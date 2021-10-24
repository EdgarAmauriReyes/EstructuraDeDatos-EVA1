
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolivas
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner input = new Scanner (System.in);
        int iVal = input.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < iVal; i++) {
            //DIVISION: iVal / i
            int iMod = iVal % i ;
            if (iMod == 0){ // modulo es igual a cero, no es primo, hay que terminar
                //continue: //DETIENE LA INTERACION ACTUAL
                esPrimo = false;
                break;//DETIENE PERMANENTEMENTE EL FOR
            }  
            //Si la division es exacta --> terminamos NO ES PRIMO
            //si terminamos el for sin dividir exactamente: ES PRIMO
        }
        //IMPRIMIR SI ES O NO PRIMO
        if (esPrimo)
            System.out.println("EL numero es primo");
        else
            System.out.println("El numero no es primo");
    }
    
}
