
package Model.Empleados;


public abstract class Empleado {
    protected String nombre;
    protected String dni;
    protected String telefono;

    public Empleado(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;   
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre= " + nombre + ", dni= " + dni + ", telefono= " + telefono;
    } 
    
}
