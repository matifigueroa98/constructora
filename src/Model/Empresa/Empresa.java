
package Model.Empresa;

import Model.Empleados.*;
import Model.Obras.*;
import java.util.ArrayList;


public class Empresa {
   protected String nombre;
   protected ArrayList listaEmpleados = new ArrayList <Empleado> ();
   protected ArrayList obrasRealizadas = new  ArrayList <Obra> (); 

    public Empresa(String nombre, ArrayList listaEmpleados, ArrayList obrasRealizadas) {
        this.nombre = nombre;
        this.listaEmpleados = listaEmpleados;
        this.obrasRealizadas = obrasRealizadas;   
    }

    public void asignarEmpleados (Empleado empleado){
        listaEmpleados.add (empleado);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList getObrasRealizadas() {
        return obrasRealizadas;
    }

    public void setObrasRealizadas(ArrayList obrasRealizadas) {
        this.obrasRealizadas = obrasRealizadas;
    }
    
  
   
}
