import java.util.Scanner;

public class Cuarto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del primer arreglo: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Ingrese los valores del primer arreglo:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        
        System.out.print("Ingrese el tamaño del segundo arreglo: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Ingrese los valores del segundo arreglo:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        int index = 0;
        for (int i = 0; i < size1; i++) {
            array3[index] = array1[i];
            index++;
            if (i < size2) {
                array3[index] = array2[i];
                index++;
            }
        }
        
        System.out.print("El arreglo intercalado es: { ");
        for (int i = 0; i < size3; i++) {
            System.out.print(array3[i]);
            if (i < size3 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
        
    }
}
