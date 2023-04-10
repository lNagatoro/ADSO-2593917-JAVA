import java.util.Scanner;

public class Primero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una oración: ");
        String oracion = scanner.nextLine().toLowerCase();

        int contadorVocales = 0;
        for (int i = 0; i < oracion.length(); i++) {
            char letra = oracion.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La cantidad de vocales es: " + contadorVocales);
    }
}
