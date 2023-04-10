import java.util.Arrays;
import java.util.Scanner;

public class Cuarto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        String[] personas = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            personas[i] = sc.next();
        }

        System.out.println("Arreglo original: " + Arrays.toString(personas));

        Arrays.sort(personas);

        System.out.println("Arreglo ordenado: " + Arrays.toString(personas));

    }

}
