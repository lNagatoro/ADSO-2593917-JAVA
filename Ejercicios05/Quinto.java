import java.util.Scanner;

public class JuegoAdivinaPalabra {
    public static void main(String[] args) {
        String palabraSecreta = "MONITOR";
        int intentosMaximos = 5;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido");
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Hola " + nombre + ", ¿estás listo?");
        System.out.println("Presiona 1 para iniciar el juego o 2 para salir");
        int opcion = entrada.nextInt();
        
        if (opcion == 1) {
            int intentos = 0;
            String palabraAdivinada = "";
            for (int i = 0; i < palabraSecreta.length(); i++) {
                palabraAdivinada += "-";
            }
            while (intentos < intentosMaximos && !palabraAdivinada.equals(palabraSecreta)) {
                System.out.println("La palabra a adivinar es:");
                System.out.println(palabraAdivinada);
                System.out.print("Ingresa una letra: ");
                char letra = entrada.next().charAt(0);
                boolean letrasAcertada = false;
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        letrasAcertada = true;
                        palabraAdivinada = palabraAdivinada.substring(0, i) + letra + palabraAdivinada.substring(i+1);
                    }
                }
                if (!letrasAcertada) {
                    intentos++;
                    System.out.println("La letra " + letra + " no está en la palabra secreta. Te quedan " + (intentosMaximos-intentos) + " intentos.");
                }
            }
            if (intentos == intentosMaximos) {
                System.out.println("has perdido. La palabra secreta era " + palabraSecreta);
            } else {
                System.out.println("has ganado. La palabra secreta era " + palabraSecreta);
            }
        } else {
            System.out.println("¡Suerte para la proxima!");
        }
    }
}
