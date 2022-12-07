
package Empleados;


public class Arquitecto extends Empleado {
    private int numeroMatricula;
    private int sueldoDiario = 2000;

    public Arquitecto(int numeroMatricula, String nombre, int dni, int telefono) {
        super(nombre, dni, telefono);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
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

    public void crearPlanos (){
        System.out.println("creando mi proximo plano");
    }
    
}
