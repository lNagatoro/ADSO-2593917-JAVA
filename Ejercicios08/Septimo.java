import java.util.Scanner;

public class Septimo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese un número: ");
    int num = scanner.nextInt();
    
    String[] arr = new String[num];
    
    for (int i = 0; i < arr.length; i++) {
      System.out.print("Ingrese un valor para la posición " + i + ": ");
      arr[i] = scanner.next();
    }
    
    System.out.print("Arreglo antes de eliminar el valor: ");
    mostrarArreglo(arr);
    
    System.out.print("Ingrese la posición a eliminar: ");
    int pos = scanner.nextInt();
    
    for (int i = pos; i < arr.length - 1; i++) {
      arr[i] = arr[i+1];
    }
    arr[arr.length - 1] = "";
    
    System.out.print("Arreglo después de eliminar el valor: ");
    mostrarArreglo(arr);
  }
  
  public static void mostrarArreglo(String[] arr) {
    System.out.print("{ ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print("\"" + arr[i] + "\"");
      if (i < arr.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println(" }");
  }
}
