/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolivas
 */
public class EVA1_19_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLO DE 3 DIMESIONES
        int [][][] aiCubo = new int [3][4][2];
        //CUANTOS ENTEROS SON?
        //24 enteros
        
        for (int i = 0; i < aiCubo.length; i++) {
            for (int j = 0; j < aiCubo[i].length; j++) {
                for (int k = 0; k < aiCubo[i][j].length; k++) {
                    aiCubo[i][j][k]= 100;
                }
            }
        }
    }
    
}
