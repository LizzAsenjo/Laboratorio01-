/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio01;

/**
 *
 * @author ESTUDIANTE
 */
public class Laboratorio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //primer ejemplo
        //------------------------------------
        
        String nombre = "Juan";
        
        Persona per = new Persona(nombre);
        per.setApellido("Perez");
        per.setDni("4561235");
        per.setEdad(16);
        
        String imprimir =per.getConsola();
        System.out.println( imprimir);
        
        //Segundo ejemplo
        //-------------------------------------
       
        String nombre2 = "Miguel";
        String apellido = "Cervantes";
        String dni = "11112222";
        
        Persona per2 = new Persona 
                     (nombre2, apellido, dni);
        
        String imprimir2 = per2.getConsola();
        System.out.println( imprimir2);
        
    }
    
}
