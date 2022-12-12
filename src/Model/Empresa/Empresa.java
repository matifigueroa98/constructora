
package Model.Empresa;

import Model.Empleados.*;
import Model.Obras.*;
import java.time.temporal.TemporalQueries;
import java.util.ArrayList;


public class Empresa {
   protected String nombre;
   protected ArrayList listaEmpleados = new ArrayList <Empleado> ();
   protected ArrayList obrasRealizadas = new  ArrayList <Obra> (); 

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = listaEmpleados;
        this.obrasRealizadas = obrasRealizadas;   
    }
    
    public void listaObras (){
        for (int i=0; i< obrasRealizadas.size();i++){
            System.out.println((i+1)+" .Obra: ");
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
