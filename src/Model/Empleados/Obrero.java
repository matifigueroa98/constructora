
package Model.Empleados;

import Interfaces.ITrabajo;

public class Obrero extends Empleado implements ITrabajo {
   private int edad;
   public static final int SUELDO_DIARIO = 1500;

    public Obrero(int edad, String nombre, String dni, String telefono, int costo) {
        super(nombre, dni, telefono, costo);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

   @Override
    public String getNombre() {
        return nombre;
    }

   @Override
    public String getDni() {
        return dni;
    }

   @Override
    public String getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

   @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getSueldoDiario() {
        return SUELDO_DIARIO;
    }
   
   @Override
   public void construir (){
       System.out.println("Soy obrero y construyo");
   }

   @Override
    public int getCosto() {
        return costo;
    }

   @Override
    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
