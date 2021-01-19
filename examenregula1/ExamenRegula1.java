package examenregula1;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamenRegula1 {

    
     public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String respuesta;
        int tam;
        boolean parar = false;
        System.out.println("--------Longitud del arreglo--------");
        System.out.println("Longitud del arreglo");
        tam = leer.nextInt();
        String arreglo[] = new String[tam];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa el dato: ");
            arreglo[i] = leer.next();
            lista.add(arreglo[i]);
        }
        System.out.println("¿desea agregar mas elementos? (SI/NO)");
        respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("SI")) {
            do {
                parar = false;
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("Ingresa el dato: ");
                    arreglo[i] = leer.next();
                    lista.add(arreglo[i]);
                    System.out.println("¿desea agregar mas elementos? (SI/NO)");
                    respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("SI")) {
                        parar = true;
                    } else {
                        parar = false;
                        break;
                    }
                }
            } while (parar == true);
        }
        System.out.println(lista.toString());
    }
    
}
