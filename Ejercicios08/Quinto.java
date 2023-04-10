import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = input.nextInt();

        int[] arreglo = new int[tamano];

        System.out.println("Ingrese los valores para llenar el arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Posición " + i + ": ");
            arreglo[i] = input.nextInt();
        }

        System.out.print("Ingrese la posición que desea consultar: ");
        int posicion = input.nextInt();

        int posicionReal = calcularPosicionReal(posicion, tamano);

        System.out.println("El valor de la posición " + posicion + " es " + arreglo[posicionReal]);
    }

    public static int calcularPosicionReal(int posicion, int tamano) {
        
        if (posicion >= 0) {
            return posicion % tamano;
        } else {
            return tamano - (Math.abs(posicion) % tamano);
        }
    }
}
