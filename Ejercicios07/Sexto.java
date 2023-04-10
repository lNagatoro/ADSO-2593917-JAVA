import java.util.Scanner;

public class Sexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        PagoMensual[] pagosMensuales = new PagoMensual[12];
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\nBienvenido(a) " + nombre + ", elija una opción:");
            System.out.println("1: Registrar pago mensual - año 2019");
            System.out.println("2: Ver pago todos los meses - año 2019");
            System.out.println("3: Ver pago mes específico");
            System.out.println("4: Salir");
            System.out.print("Opción elegida: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el mes (1-12): ");
                    int mes = scanner.nextInt();
                    System.out.print("Ingrese el pago mensual: ");
                    double pago = scanner.nextDouble();
                    pagosMensuales[mes-1] = new PagoMensual(mes, pago);
                    System.out.println("Pago mensual registrado para el mes " + mes);
                    break;
                case 2:
                    System.out.println("\nPagos mensuales registrados en el año 2019:");
                    for (int i = 0; i < pagosMensuales.length; i++) {
                        if (pagosMensuales[i] != null) {
                            System.out.println(pagosMensuales[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el mes que desea ver (1-12): ");
                    int mesSeleccionado = scanner.nextInt();
                    PagoMensual pagoDelMes = pagosMensuales[mesSeleccionado-1];
                    if (pagoDelMes != null) {
                        System.out.println("\nPago mensual del mes " + mesSeleccionado + ":");
                        System.out.println(pagoDelMes);
                    } else {
                        System.out.println("\nNo se ha registrado pago mensual para el mes " + mesSeleccionado);
                    }
                    break;
                case 4:
                    System.out.println("\nGracias por utilizar la aplicación Registro de Pagos.");
                    break;
                default:
                    System.out.println("\nOpción inválida, intente de nuevo.");
                    break;
            }
       
        }
    }
}