
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
public class EVA1_18_PROMEDIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int[][]aiGrupos;
        //PREGUNTAR AL USUARIO LOS GRUPOS
        System.out.println("¿Cuantos grupos son?");
        int iNoGrupos = input.nextInt();
        //LOS GRUPOS REPRESENTAN LAS FILAS
        aiGrupos = new int [iNoGrupos][];
        for (int i = 0; i < aiGrupos.length; i++) {
            System.out.println("para el grupo " + i + "¿Cuantos estudiantes son?");
            int iNoEstu = input.nextInt();
            aiGrupos[i] = new int [iNoEstu];
        }
        
        //VAMOS A PREGUNTAR LAS EDADES
        for (int i = 0; i < aiGrupos.length; i++) {// primer dimension filas grupos
            for (int j = 0; j < aiGrupos[i].length; j++) {//segunda dimesion, para cada grupo, alumnos hay 
                System.out.print("[" + "]");// PRINT (Imprime en la misma linea)
            }
            System.out.println("");//PRINTLN(Imprime y despues hace salto de linea (enter)
        }
    }
    
}
