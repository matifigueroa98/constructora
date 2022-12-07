
package Model.Empleados;

public class Obrero extends Empleado {
   private int edad;
   private int sueldoDiario = 1500;

    public Obrero(int edad, String nombre, String dni, String telefono) {
        super(nombre, dni, telefono);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(int sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }  
   
   public void construir (){
       System.out.println("Soy obrero y construyo");
   }
    
}