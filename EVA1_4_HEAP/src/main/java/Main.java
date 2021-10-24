/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolivas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj = new MiClase();
        System.out.println(obj.getMensaje());
        System.out.println(obj); // IMPRIMIMOS LA REFERENCIA AL OBJETO EN EL HEAP   
        MiClase obj2 = new MiClase();
        System.out.println(obj2);// IMPRIMIMOS LA REFERENCIA AL OBJETO EN EL HEAP   
        Main objMain = new Main();
        System.out.println(objMain);
    }
    
}

class MiClase{ //NUEVO TIPO DE DATO ---> TIPOS DE DATOS ABSTRACTOS
    String mensaje; //ATRIBUTO --> ESTADO DEL OBJETO
    public MiClase(){ // METODOS --> COMPORTAMINETOS
        mensaje = "Hola mundo";
    }
    //getter / setter
    
    public String getMensaje(){
        return mensaje;
    }
    public void setMensaje(String mensaje){
      this.mensaje = mensaje;
    }
}