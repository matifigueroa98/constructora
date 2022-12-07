
package Empleados;


public class MaestroMayorDeObra extends Empleado {
      private int edad;
      private int sueldoDiario = 1800;

    public MaestroMayorDeObra(int edad, String nombre, int dni, int telefono) {
        super(nombre, dni, telefono);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
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
       System.out.println("Soy maestro y superviso las construcciones");
   }
}
