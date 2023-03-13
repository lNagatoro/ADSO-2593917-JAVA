import java.util.Scanner;

public class Pagina2 {
    public static void main(String[] args) {
        
        try (Scanner entrada2 = new Scanner(System.in)) {
            try (Scanner entrada1 = new Scanner(System.in)) {
                int opcion = 0;
                int pos_disponible = 0;
                Pagina1 arreglo [] = new Pagina1 [100];
                


                do {
                    System.out.println("||===========================================||");
                    System.out.println("||------- Personas Registradas: "+((pos_disponible<10)? "0":"")+pos_disponible+" -||");
                    System.out.println("||=======1.Restrar Personas :================||");
                    System.out.println("||=======2.Ver Lista Personal :==============||");
                    System.out.println("||=======3.Ordenar lista personal :==========||");
                    System.out.println("||=======4.salir :===========================||");
                    System.out.println("||===========================================||");
                    System.out.println("||============DATOS PERSONALES===============||");
                    System.out.println("||============Ingrese la Opcion :============||");
                    opcion = entrada2.nextInt();

                    if (opcion == 1) {
                        System.out.print("||=> Ingrese su documento: ");
                        int documento = entrada1.nextInt();
                        System.out.print("||=> Ingrese su nombre: ");
                        String nombre = entrada1.nextLine();
                        System.out.print("||=> Ingrese su apellido: ");
                        String apellido = entrada1.nextLine();
                        System.out.print("||=> Ingrese su direccion: ");
                        String direccion = entrada1.nextLine();
                        System.out.print("||=> Ingrese su telefono: ");
                        String telefono = entrada1.nextLine();
                        System.out.print("||=> Ingrese su correo: ");
                        String correo = entrada1.nextLine();

                        Pagina1 temporal = new Pagina1(documento, nombre, apellido, direccion, telefono, correo);
                        boolean valido = true;
                        for (int i=0; i<pos_disponible; i++) {
                			if (temporal.getDocumento() == arreglo[i].getDocumento()) {
                				valido = false;
                				System.out.println("||===> EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTRAR. \n\n");
                				break;
                			}
                		}

                		if (valido) {
                			arreglo[pos_disponible] = temporal;
                			pos_disponible++;
                			System.out.println("||===> REGISTRADO CON EXITO \n\n");
                		}
                    }else
                    if (opcion == 2) {
                        for(int i = 0;i<arreglo.length;i++){
                            if (arreglo[i] != null) {
                                arreglo[i].mostrardatospersonales();
                            }
                        }
                    }else
                    if (opcion == 3) {
                        for (int i=0; i<arreglo.length; i++) {
                			for (int j=0; j<arreglo.length-1; j++) {
                				if ( arreglo[j]!=null && arreglo[j+1]!=null) {
                					if ( arreglo[j].getNombre().compareToIgnoreCase(arreglo[j+1].getNombre()) > 0 ) {
                						Pagina1 aux = arreglo[j];
                						arreglo[j] = arreglo[j+1];
                						arreglo[j+1] = aux;
                					}
                				}
                			}
                		}
                    }else
                    if (opcion == 4) {
                        System.out.println("||================Saliendo==================||");
                    }else{
                        System.out.println("||==========================================||");
                        System.out.println("||=============Opcion Invalida==============||");
                        System.out.println("||==========================================||");
                    }
                } while(opcion != 4);
            }
        }















        


    }
}
