
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // atributos
    String codigo, cedula, nombre;
    int edad;
    // constructor
    public Persona(String codigo, String cedula, String nombre, int edad){
    this.codigo=codigo;
    this.cedula=cedula;
    this.nombre=nombre;
    this.edad=edad;
    }
    //getters & setters
    public String getCodigo(){
     return codigo;
      }
    
    public void setCodigo(String codigo){
     this.codigo=codigo;
      }
    
    public String getCedula(){
     return cedula;
      }
    
    public String getNombre(){
     return nombre;
      }
    
    public int getEdad(){
     return edad;  
     }
    
    
      public void setCedula(String cedula){
     this.cedula=cedula;
      }
    
    public void getNombre(String nombre){
     this.nombre=nombre;
      }
    
    public void getEdad(int edad){
     this.edad=edad;  
     }
    
      public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cedula: " + cedula);
        System.out.println("Código: " + codigo);
    }
}
