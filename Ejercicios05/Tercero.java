import java.util.Scanner;

public class Tercero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un nombre completo: ");

        String nombreCompleto = scanner.nextLine();

        String[] palabras = nombreCompleto.split(" ");

        String nombreInvertido = "";

        for (int i = palabras.length - 1; i >= 0; i--) {

            nombreInvertido += palabras[i] + " "; 

        }

        System.out.println("Nombre invertido: " + nombreInvertido.trim()); 
    }
}