
package Empleados;


public class Empleado {
    protected String nombre;
    protected int dni,telefono;

    public Empleado(String nombre, int dni, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;   
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono;
    } 
    
}
