/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolivas
 */
public class EVA1_16_ARREGLO_DE_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARRA UN ARREGLO DE DOS DIMESCIONES:
        int[][]iMatriz = new int [3][3];
        System.out.println("Direccion de la matriz: "+ iMatriz);
        System.out.println("Tamaño de la primera dimencion (filas): " + iMatriz.length );
        for (int i = 0; i < iMatriz.length; i++) {//FIlAS
            System.out.println("iMtriz["+i+"]= " + iMatriz[i]);
        }
    }
    
}
