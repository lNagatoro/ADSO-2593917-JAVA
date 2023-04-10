import java.util.Scanner;

public class Septimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Ingrese la posición del elemento para empezar el anti horario: ");
        int posicion = scanner.nextInt();

        System.out.print("Arreglo: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i]);
            if (i < n-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Anti horario: ");
        for (int i = 0; i < n; i++) {
            int j = (posicion+i) % n;
            System.out.print(arreglo[j]);
            if (i < n-1) {
                System.out.print(" - ");
            }
        }
    }
}
