import java.util.Scanner;

public class Tercero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = sc.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = sc.nextLine();
        String resultado = "";

        int cont1 = palabra1.length();
        int cont2 = palabra2.length();
        int minLength = Math.min(cont1, cont2);

        for (int i = 0; i < minLength; i++) {
            resultado += palabra1.charAt(i);
            resultado += palabra2.charAt(i);
        }

        if (cont1 > cont2) {
            resultado += palabra1.substring(minLength);
        } else if (cont2 > cont1) {
            resultado += palabra2.substring(minLength);
        }

        System.out.println("El resultado es: " + resultado);
    }
}
