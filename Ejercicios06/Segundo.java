import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.print("Ingrese número: ");
        int numero = sc.nextInt();

        
        for (int i = 0; i < frase.length(); i++) {
            int nuevaPosicion = (i - numero) % frase.length();
            if (nuevaPosicion < 0) {
                nuevaPosicion += frase.length();
            }
            System.out.print(frase.charAt(nuevaPosicion));
        }

        System.out.println(); 
    }
}
