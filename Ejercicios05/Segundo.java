import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una oración: ");
        String oracion = scanner.nextLine();
        String oracionInvertida = "";
        for (int i = 0; i < oracion.length(); i++) {
            char caracter = oracion.charAt(i);
            if (Character.isUpperCase(caracter)) {
                oracionInvertida += Character.toLowerCase(caracter);
            } else if (Character.isLowerCase(caracter)) {
                oracionInvertida += Character.toUpperCase(caracter);
            } else {
                oracionInvertida += caracter;
            }
        }
        System.out.println("Oración invertida: " + oracionInvertida);
    }
}
