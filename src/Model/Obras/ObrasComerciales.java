
package Model.Obras;

import Model.Empleados.Empleado;
import java.util.ArrayList;


public abstract class ObrasComerciales extends Obra {
    protected String nombreObra;

    public ObrasComerciales(String nombreObra, String direccion, double cantidadm2, double tiempoObra, double costom2, ArrayList<Empleado> listaPersonal) {
        super(direccion, cantidadm2, tiempoObra, costom2, listaPersonal);
        this.nombreObra = nombreObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }
    
    
    
    
    
    
}
