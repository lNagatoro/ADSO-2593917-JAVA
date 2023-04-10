import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Primero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar una contraseña: ");
        String contrasena = entrada.nextLine();
        if (validarContrasena(contrasena)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no es válida.");
        }
    }

    public static boolean validarContrasena(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+");
        Matcher matcher = pattern.matcher(contrasena);
        return matcher.matches() && !contrasena.contains(" ");
    }
}
