import java.util.Scanner;

public class Cuarto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese palabra: ");
        String palabra = scanner.nextLine();

        
        boolean Palindroma = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                Palindroma = false;
                break;
            }
        }

      
        if (Palindroma) {
            System.out.println("La palabra " + palabra + " es palíndroma.");
        } else {
            System.out.println("La palabra " + palabra + " no es palíndroma.");
        }
    }

}
