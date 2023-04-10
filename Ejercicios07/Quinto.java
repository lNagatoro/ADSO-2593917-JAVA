import java.util.Scanner;

public class Quinto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el número de personas: ");
    int n = scanner.nextInt();
    scanner.nextLine(); 
    
    String[] nombres = new String[n];
    String[] generos = new String[n];
    
    for (int i = 0; i < n; i++) {
      System.out.printf("Ingrese el nombre de la persona %d: ", i+1);
      nombres[i] = scanner.nextLine();
      System.out.printf("Ingrese el género de %s (Hombre o Mujer): ", nombres[i]);
      generos[i] = scanner.nextLine();
    }
    
    for (int i = 0; i < n; i++) {
      System.out.printf("[ %s -> %s ]%n", nombres[i], generos[i]);
    }
  }
}
