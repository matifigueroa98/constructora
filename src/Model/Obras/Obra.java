
package Model.Obras;

import Model.Empleados.Empleado;
import java.util.*;


public abstract class Obra {
    
    protected String direccion;
    protected double cantidadm2;
    protected double tiempoObra;
    protected double costom2;
    protected ArrayList <Empleado> listaPersonal = new  ArrayList <Empleado> ();

    public Obra(String direccion, double cantidadm2, double tiempoObra, double costom2, ArrayList <Empleado> listaPersonal) {
        this.direccion = direccion;
        this.cantidadm2 = cantidadm2;
        this.tiempoObra = tiempoObra;
        this.costom2 = costom2;
        this.listaPersonal = listaPersonal;
    }
    
    public void recorrerEmpleados (){
        System.out.println("Empleados de la obra: \n");
    for (Empleado i: getListaPersonal()){ 
         System.out.println(i);
     }
    System.out.println("-----------------");
    }
    
    public double precioEstimadoTotalDeObra (double costoEmpleados){
        return ((costom2 * cantidadm2) + (costoEmpleados)) * tiempoObra;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCantidadm2() {
        return cantidadm2;
    }

    public void setCantidadm2(double cantidadm2) {
        this.cantidadm2 = cantidadm2;
    }

    public double getTiempoObra() {
        return tiempoObra;
    }

    public void setTiempoObra(double tiempoObra) {
        this.tiempoObra = tiempoObra;
    }

    public double getCostom2() {
        return costom2;
    }

    public void setCostom2(double costom2) {
        this.costom2 = costom2;
    }

    public ArrayList<Empleado> getListaPersonal() {
        return listaPersonal;
    }

    public void setListaPersonal(ArrayList<Empleado> listaPersonal) {
        this.listaPersonal = listaPersonal;
    }

    @Override
    public String toString() {
        return "Obra{" + "direccion=" + direccion + ", cantidadm2=" + cantidadm2 + ", tiempoObra=" + tiempoObra + ", costom2=" + costom2 + ", listaPersonal=" + listaPersonal + '}';
    } 
}
