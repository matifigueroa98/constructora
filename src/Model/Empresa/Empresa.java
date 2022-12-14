
package Model.Empresa;

import Model.Empleados.*;
import Model.Obras.Obra;
import java.util.ArrayList;


public class Empresa {
   protected String nombre;
   protected ArrayList <Empleado> listaEmpleados;
   protected ArrayList <Obra> obrasRealizadas; 

    public Empresa(String nombre) {
        this.listaEmpleados = new ArrayList <> ();
        this.obrasRealizadas = new  ArrayList <> ();
        this.nombre = nombre;
    }

    
    public void verObras (){
        for (Obra o : obrasRealizadas){
            System.out.println(o.precioEstimado());
        }
    }
    
    public void agregarObras (Obra obra){
        obrasRealizadas.add(obra);
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

    public ArrayList <Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList <Obra> getObrasRealizadas() {
        return obrasRealizadas;
    }

    public void setObrasRealizadas(ArrayList obrasRealizadas) {
        this.obrasRealizadas = obrasRealizadas;
    }   
   
}
