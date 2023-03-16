import java.util.Scanner;

public class Ahorcado {
    private String palabraSecreta;
    private char[] palabraGuiones;
    private int Intentos;
    private int numAciertos;
    private boolean gameOver;
    
    public Ahorcado(String palabraSecreta, int Intentos) {
        this.palabraSecreta = palabraSecreta.toUpperCase();
        this.palabraGuiones = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraGuiones.length; i++) {
            palabraGuiones[i] = '-';
        }
        this.Intentos = Intentos;
        this.numAciertos = 0;
        this.gameOver = false;
    }
    
    public void start() {
        Scanner input = new Scanner(System.in);
        while (!gameOver) {
            System.out.println("Palabra: " + String.valueOf(palabraGuiones));
            System.out.println("Intentos restantes: " + Intentos);
            System.out.print("Ingrese una letra: ");
            char letra = input.next().toUpperCase().charAt(0);
            if (!intentar(letra)) {
                Intentos--;
            }
            if (numAciertos == palabraSecreta.length()) {
                System.out.println("¡Ganaste!");
                gameOver = true;
            } else if (Intentos == 0) {
                System.out.println("¡Perdiste! La palabra era " + palabraSecreta);
                gameOver = true;
            }
        }
    }
    
    private boolean intentar(char letra) {
        boolean acierto = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraGuiones[i] = letra;
                numAciertos++;
                acierto = true;
            }
        }
        return acierto;
    }
}
