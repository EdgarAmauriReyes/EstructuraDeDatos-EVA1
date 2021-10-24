/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolivas
 */
public class EVA1_9_USANDO_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. UN ARREGLO DE ENTEROS
        int[] aiDatos = new int[10];
        //2. LLENAR DE VALORES
        //Arreglo: estructura de acceso alaeatrio 
        //Indice:
        //primer elemento del arreglo: posicion 0
        //Ultimo elemento del arreglo: N - 1 (N es el tamaño del arreglo)
        // ACESO A LOS VALORES:
        for (int i = 0; i < 10; i++) {
                         //casting --> convertimos dubles a enteros
            aiDatos[i] = (int)(Math.random()*100); //Random --> Valores entre 0.0 y 1.0 X 100 (valores entre 0 y 100)
        }
        //3.IMPRIMIR VALORES
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + aiDatos [i] + "]");
        }
    }
    
}
