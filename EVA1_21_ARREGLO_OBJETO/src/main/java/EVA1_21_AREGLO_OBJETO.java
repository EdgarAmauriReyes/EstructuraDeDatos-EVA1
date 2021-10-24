
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
public class EVA1_21_AREGLO_OBJETO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        Humano[] aPersona = new Humano [10];// ARREGLO TAMAÑO 10 QUE ALMACENA OBJETOS DE TIPO PERSONA
        //PARA USAR OBJETO, DEBE CREARLO
        //PARA CREAR UN OBJETO USAN NEW
        //SI NO LO CREAN, NO EXISTE
        
        for (int i = 0; i < aPersona.length; i++) {
            aPersona[i] = new Humano(); // CREO UN OBJETO DE TIPO PERSONA EN LA POSICION i
            System.out.println("Introduce u nombre: ");
            String nombre = input.nextLine();
            aPersona[i].setNombre(nombre);
        }
        
        for (int i = 0; i < aPersona.length; i++) {
            System.out.println("Nombre: " + aPersona[i].getNombre());
            
        }   
    }
}
    
    class Humano {
        private String nombre;
        
        public String getNombre(){
            return nombre;
        }
        
        public void setNombre (String nombre){
            this.nombre = nombre;
        }
    }
    

