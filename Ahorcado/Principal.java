import java.util.Scanner;

public class Principal {
   
    public static void main(String[] args) {
        System.out.print("  ====INCIAR JUEGO====  ");
        Ahorcado juego = new Ahorcado("COCODRILO", 6);
        juego.start();
        System.out.print("  ====CERRAR JUEGO====  ");
    }
    
}
