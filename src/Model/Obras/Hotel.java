
package Model.Obras;

import Model.Empleados.Empleado;
import java.util.ArrayList;


public class Hotel extends ObrasComerciales {
    private Integer pisos;

    public Hotel(int pisos, String nombreObra, String direccion, double cantidadm2, double tiempoObra, double costom2, ArrayList<Empleado> listaPersonal) {
        super(nombreObra, direccion, cantidadm2, tiempoObra, costom2, listaPersonal);
        this.pisos = pisos;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
}
