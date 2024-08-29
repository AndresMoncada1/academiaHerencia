
/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesor extends Persona
{
  // atributos
  private String especialidad;
  private int horasSemanales;
  private double salario;
  
  // constructor
  
    public Profesor(String codigo,String cedula, String nombre, int edad, String especialidad, 
                    int horasSemanales, double salario) 
    {
        super(codigo, cedula, nombre, edad);
        this.especialidad = especialidad;
        this.horasSemanales= horasSemanales;
        this.salario = salario;
    }
    
  //getters & setters
    public String getEspecialidad() {
        return especialidad;
        }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public int getHorasSemanales(){
        return horasSemanales; 
    }

    public void setHorasSemanales(int horassemanales){
        this.horasSemanales=horasSemanales; 
    }

        public double getSalario(){
        return salario; 
    }

    public void setHorasSemanales(double salario){
        this.salario=salario; 
    }
    
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Horas de dedicación semanal: " +horasSemanales);
        System.out.println("Salario: " + salario);
    }
    }
    

