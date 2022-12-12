
package Model.Empleados;


public class MaestroMayorDeObra extends Empleado {
      private int edad;
     public static final int SUELDO_DIARIO = 1800;

    public MaestroMayorDeObra(int edad, String nombre, String dni, String telefono, int costo) {
        super(nombre, dni, telefono, costo);
        this.edad = edad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getSueldoDiario() {
        return SUELDO_DIARIO;
    }

     public void construir (){
       System.out.println("Soy maestro y superviso las construcciones");
   }
}
