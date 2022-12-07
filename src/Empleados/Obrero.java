
package Empleados;

public class Obrero extends Empleado {
   private int edad;
   private int sueldoDiario = 1500;

    public Obrero(int edad, String nombre, int dni, int telefono) {
        super(nombre, dni, telefono);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
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
