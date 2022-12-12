
package Model.Obras;

import Model.Empleados.Empleado;
import java.util.ArrayList;


public class Comercio extends ObrasComerciales {
    private String rubro;

    public Comercio(String rubro, String nombreObra, String direccion, double cantidadm2, double tiempoObra, double costom2, ArrayList<Empleado> listaPersonal) {
        super(nombreObra, direccion, cantidadm2, tiempoObra, costom2, listaPersonal);
        this.rubro = rubro;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    
}
