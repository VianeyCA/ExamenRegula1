package examenregula1;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamenRegula1 {

    
     public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String respuesta;
        int size;
        boolean parar = false;
        do {
            parar = false;
            System.out.println("--------Longitud del arreglo--------");
            System.out.println("Ingrese el tamaño del arreglo: ");
            size = leer.nextInt();
            String M[] = new String[size];
            for (int i = 0; i < M.length; i++) {
                System.out.println("[" + i + "]Ingresa el dato: ");
                M[i] = leer.next();
            }
            for (int i = 0; i < M.length; i++) {
                lista.add(M[i]);
            }
            System.out.println("¿Desea agregar mas elementos? (SI/NO)");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("SI")) {
                parar = true;
            }
        } while (parar == true);
         System.out.println("====== Datos de la lista ======");
        System.out.println(lista.toString());
    }
    
}
