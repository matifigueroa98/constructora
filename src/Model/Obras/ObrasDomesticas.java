
package Model.Obras;

import Model.Empleados.Empleado;
import java.util.ArrayList;


public class ObrasDomesticas extends Obra {
    private int cantidadHabitaciones;

    public ObrasDomesticas(int cantidadHabitaciones, String direccion, double cantidadm2, double tiempoObra, double costom2, ArrayList<Empleado> listaPersonal) {
        super(direccion, cantidadm2, tiempoObra, costom2, listaPersonal);
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    
    
    
    
    
    
}
