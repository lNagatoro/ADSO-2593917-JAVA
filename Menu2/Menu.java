import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        
        Scanner entrada_numero = new Scanner(System.in) {
            Scanner entrada_texto = new Scanner(System.in) {

                private static final int CAPACIDAD_MAXIMA = 100;
                private static int contadorClientes = 0;
                private static Princial[] listaClientes = new Princial[CAPACIDAD_MAXIMA];
                int pos_disponible = 0;
                int opcion = 0;
                
                while (opcion != salir) {
                        System.out.println("|| ------------------------------------------------------------------ ||");
                        System.out.println("|| ----------------------------- SECCION CLIENTES ------------------- ||");
                        System.out.println("|| ------------------------------------------------------------------ ||");
                        System.out.println("|| Clientes Registrados: " + contadorClientes + " --------------------||");
                        System.out.println("|| -------------------------------------------------------------------||");
                        System.out.println("|| 1. Registrar Cliente. ---------------------------------------------||");
                        System.out.println("|| 2. Ver Clientes Registrados. --------------------------------------||");
                        System.out.println("|| 3. Modificar Información Cliente. ---------------------------------||");
                        System.out.println("|| 4. Ver información Cliente. ---------------------------------------||");
                        System.out.println("|| 5. Eliminar Cliente. ----------------------------------------------||");
                        System.out.println("|| 6. Salir. ---------------------------------------------------------||");
                        System.out.println("|| ------------------------------------------------------------------ ||");

                        opcion = scanner.nextInt();

                
                    switch (opcion) {
                        case 1:
                            registrarCliente();
                                if (contadorClientes == CAPACIDAD_MAXIMA) {
                                System.out.println("Error: La capacidad máxima de clientes ha sido alcanzada.");
                                return;
                                }
                                Scanner scanner = new Scanner(System.in);
                                System.out.println("Ingrese el documento del cliente: ");
                                String documento = scanner.nextLine();
                                System.out.println("Ingrese los nombres del cliente: ");
                                String nombres = scanner.nextLine();
                                System.out.println("Ingrese los apellidos del cliente: ");
                                String apellidos = scanner.nextLine();
                                System.out.print("||=> Ingrese su direccion: ");
                                String direccion = entrada_texto.nextLine();
                                System.out.print("||=> Ingrese su telefono: ");
                                String telefono = entrada_texto.nextLine();
                                System.out.print("||=> Ingrese su correo: ");
                                String correo = entrada_texto.nextLine();
                                Princial cliente = new Cliente(documento, nombres, apellidos, direccion, telefono, correo);
                                listaClientes[contadorClientes] = cliente;
                                contadorClientes++;
                                System.out.println("Cliente registrado exitosamente.");
                            break;
                        case 2:
                            verClientesRegistrados();
                                if (contadorClientes == 0) {
                                System.out.println("No hay clientes registrados.");
                                return;
                                }
                                System.out.println("Lista de clientes:");
                                for (int i = 0; i < contadorClientes; i++) {
                                    System.out.println(listaClientes[i].getDocumento() + " -> " + listaClientes[i].getNombres() + " " + listaClientes[i].getApellidos());
                                }
                            break;
                        case 3:
                            modificarInformacionCliente();
                                for (int i=0; i<arreglo.length; i++) {
                                    for (int j=0; j<arreglo.length-1; j++) {
                                        if ( arreglo[j]!=null && arreglo[j+1]!=null) {
                                            if ( arreglo[j].getNombre().compareToIgnoreCase(arreglo[j+1].getNombre()) > 0 ) {
                                                Principal aux = arreglo[j];
                                                arreglo[j] = arreglo[j+1];
                                                arreglo[j+1] = aux;
                                            }
                                        }
                                    }
                		        }
                            break;
                        case 4:
                            verInformacionCliente();
                                for(int i = 0;i<arreglo.length;i++){
                                    if (arreglo[i] != null) {
                                        arreglo[i].mostrardatospersonales();
                                    }    
                                }
                                System.out.println("Ingrese el numero de cedula que desea buscar: ");
                                int solucitud = entrada_numero.nextInt();
                                if(solucitud == documento){
                                    System.out.print("Infomacion del cliente"+arreglo);
                                }
                            break;
                        case 5:
                            eliminarCliente();
                                System.out.print("Ingrese el numero del usuario que desea eliminar: ");
                                int eliminar = entrada_numero.nextInt();
                                int pos = -1;
                                for(int i = 0; i < arreglo.length; i++){
                                    if(arreglo[i].getID() == eliminar.getID()){
                                        pos = i;
                                    
                                    }

                                }
                                if(pos != -1){
                                    arreglo[] nuevoUsuario = new arreglo[arreglo.length-1];
                                    int j = 0;
                                    for(int i = 0; i < arreglo.length; i++){
                                        nuevoUsuario[j] = arreglo[i];
                                        j++;
                                    }
                                arreglo = nuevoUsuario;
                                }
                            break;
                        case 6:
                            salir = true;
                            break;
                        default:
                            System.out.println("Opción inválida. Intente de nuevo.");
                            break;
                    }
                }
            };
        };
    }
}
    