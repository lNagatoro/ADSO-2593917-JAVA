import java.util.Scanner;

public class Sexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        String[] arreglo = new String[n];
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para el índice " + i + ": ");
            arreglo[i] = scanner.nextLine();
        }
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();
        System.out.println("Encontradas:");
        for (int i = 0; i < n; i++) {
            if (arreglo[i].toLowerCase().contains(palabraBuscada.toLowerCase())) {
                System.out.println("-> Posicion " + i + ": " + arreglo[i]);
            }
        }
    }
}
