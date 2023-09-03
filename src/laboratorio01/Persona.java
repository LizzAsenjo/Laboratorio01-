/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio01;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona{
    
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private String direccion;
    
    public Persona(){}
    
    public Persona (String nombre){
        this.nombre = nombre;
    }
    
    public Persona (
            String nombre, 
            String apellido, 
            String dni ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getConsola(){
        return "------DATOS-------"
               +"\n"+ "El nombre es: "+this.getNombre()
               +"\n"+ "El apellido es: " + this.getApellido()
               +"\n"+ "El dni es: " + this.getDni()
               +"\n"+ "La edad es: " + this.getEdad();
    }
}
