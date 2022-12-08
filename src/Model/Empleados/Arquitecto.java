
package Model.Empleados;

public class Arquitecto extends Empleado {
    private int numeroMatricula;
    public static final int SUELDO_DIARIO = 2000;

    public Arquitecto(int numeroMatricula, String nombre, String dni, String telefono) {
        super(nombre, dni, telefono);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getSueldoDiario() {
        return SUELDO_DIARIO;
    }


    public void crearPlanos (){
        System.out.println("creando mi proximo plano");
    }
    
}
