import java.util.Arrays;
import java.util.Scanner;

public class Tercero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de los arreglos: ");
        int n = scanner.nextInt();
        
        int[] arreglo1 = new int[n];
        int[] arreglo2 = new int[n];
        
        System.out.println("Ingrese los valores para el arreglo 1:");
        for (int i = 0; i < n; i++) {
            arreglo1[i] = scanner.nextInt();
        }
        
        System.out.println("Ingrese los valores para el arreglo 2:");
        for (int i = 0; i < n; i++) {
            arreglo2[i] = scanner.nextInt();
        }
        
        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);
        
        if (Arrays.equals(arreglo1, arreglo2)) {
            System.out.println("Los arreglos son equivalentes");
        } else {
            System.out.println("Los arreglos son diferentes");
        }
    }

}
