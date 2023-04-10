import java.util.Scanner;
public class Primero {
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese la longitud del arreglo");
        int n = entrada.nextInt();
        int arreglo[] = new int[n];

        int cont_par = 0;
        int cont_impar = 0;
        

        for(int i = 0; i < n ; i++){
           System.out.println("Vamos a ingresar los N números para el arreglo");
           arreglo[i] = entrada.nextInt();
           if(arreglo[i] % 2 == 0){
               cont_par++;
           }
           else{
               cont_impar++;
           }   
           
        }
        int pares[] = new int[cont_par];
        int impares[] = new int[cont_impar];

        
        cont_par = 0;
        cont_impar = 0; 

       System.out.print("Arreglo original: ");
        for(int i = 0 ; i < n ; i++){
            if(arreglo[i] % 2 == 0){
                pares[cont_par] = arreglo[i];
                cont_par++;
            }else{
                impares[cont_impar] = arreglo[i];
                cont_impar++;
            } 
            System.out.print(arreglo[i]+" - ");
        }
        

        System.out.println(" ");

        System.out.print("Arreglo de los pares: ");

        for(int i = 0 ; i < cont_par ; i++){
            System.out.print(pares[i]+" - ");
        }
        System.out.println("Longitud: "+pares.length);

        System.out.print("Arreglo de los impares: ");
        
        for(int i = 0 ; i < cont_impar ; i++){
            System.out.print(impares[i]+" - ");
        }
        System.out.println("Longitud: "+impares.length);

    }
}