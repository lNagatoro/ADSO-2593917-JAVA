import java.util.Scanner;

public class TresEnLinea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del primer usuario: ");
        String nombreJugador1 = scanner.nextLine();

        System.out.print("Ingrese el nombre del segundo usuario: ");
        String nombreJugador2 = scanner.nextLine();

        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Iniciar juego");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Tablero tablero = new Tablero();
                    tablero.mostrar();

                    boolean juegoTerminado = false;
                    boolean turnoJugador1 = true;
                    while (!juegoTerminado) {
                        int posicion;
                        if (turnoJugador1) {
                            System.out.print(nombreJugador1 + ", ingrese una posicion (1-9): ");
                            posicion = scanner.nextInt();
                            tablero.marcar(posicion, 'X');
                        } else {
                            System.out.print(nombreJugador2 + ", ingrese una posicion (1-9): ");
                            posicion = scanner.nextInt();
                            tablero.marcar(posicion, 'O');
                        }

                        turnoJugador1 = !turnoJugador1;

                        if (tablero.haGanado('X')) {
                            System.out.println(nombreJugador1 + " ha ganado!");
                            juegoTerminado = true;
                        } else if (tablero.haGanado('O')) {
                            System.out.println(nombreJugador2 + " ha ganado!");
                            juegoTerminado = true;
                        } else if (tablero.estaLleno()) {
                            System.out.println("El juego ha terminado en empate.");
                            juegoTerminado = true;
                        }
                    }

                    break;
                case 2:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                   
            }
        }while(opcion != 2);
    }
}