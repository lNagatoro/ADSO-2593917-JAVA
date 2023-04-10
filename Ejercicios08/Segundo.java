import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        System.out.print("Ingrese el número de movimientos: ");
        int numMovimientos = scanner.nextInt();
        
        for (int i = 0; i < numMovimientos; i++) {
            int temp = arreglo[0];
            for (int j = 0; j < n - 1; j++) {
                arreglo[j] = arreglo[j + 1];
            }
            arreglo[n - 1] = temp;
            System.out.print("Movimiento " + (i + 1) + ": { ");
            for (int j = 0; j < n; j++) {
                System.out.print(arreglo[j]);
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" }");
        }
    }
}
