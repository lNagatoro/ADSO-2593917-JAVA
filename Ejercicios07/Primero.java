import java.util.Scanner;

public class Primero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int n = entrada.nextInt();
        
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            arreglo[i] = 1 + 2*i;
        }
        
        System.out.println("El arreglo de números impares es:");

        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
