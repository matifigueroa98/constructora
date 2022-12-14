package Core;

import Model.Empleados.*;
import Model.Empresa.Empresa;
import Model.Obras.*;
import java.util.ArrayList;

public class Main {
 

    public static void main(String[] args) {
       
     Obrero obrero1 = new Obrero (24, "Matias","40864421", "2236036523", Obrero.SUELDO_DIARIO);
     Obrero obrero2 = new Obrero (58, "Edgardo", "16923053", "2235052985", Obrero.SUELDO_DIARIO);
     Obrero obrero3 = new Obrero (56, "Mariela", "17871097", "2235968954", Obrero.SUELDO_DIARIO);
     Arquitecto arquitecto = new Arquitecto (305, "Juan", "40876567", "2235761058", Arquitecto.SUELDO_DIARIO);
     MaestroMayorDeObra maestro1 = new MaestroMayorDeObra (30, "Ernudo", "37509654", "2235490829", MaestroMayorDeObra.SUELDO_DIARIO);
     MaestroMayorDeObra maestro2 = new MaestroMayorDeObra (36, "Kobe", "120321431", "2236396563", MaestroMayorDeObra.SUELDO_DIARIO);
     
     obrero1.construir();
     maestro1.construir();
     arquitecto.crearPlanos();
     
    Empresa empresa = new Empresa ("Figueroa Company");
    empresa.asignarEmpleados(maestro1);
    empresa.asignarEmpleados(maestro2);
    empresa.asignarEmpleados(arquitecto);
    empresa.asignarEmpleados(obrero1);
    empresa.asignarEmpleados(obrero2);
    empresa.asignarEmpleados(obrero3);
    
        ArrayList<Empleado> listaPersonal = empresa.getListaEmpleados();
    Hotel hotel = new Hotel (5, "Agus Hotel", "Zubiria 3000", 45, 34, 16, listaPersonal);
        System.out.println("el precio total del hotel es: "+hotel.precioEstimado());

    Comercio comercio = new Comercio ("cerveceria", "Antares", "Roca 1570", 60, 55, 30, listaPersonal);
        System.out.println("el precio total del comercio es: "+ comercio.precioEstimado());
    
    ObrasDomesticas domesticas = new ObrasDomesticas(7, "Luro 1600", 24, 27, 20, listaPersonal);
        System.out.println("el precio total de la obra domestica es: "+ domesticas.precioEstimado());
        
     empresa.agregarObras(hotel);
     empresa.agregarObras(comercio);
     empresa.agregarObras(domesticas);
     
     hotel.recorrerEmpleados();
     comercio.recorrerEmpleados();
     domesticas.recorrerEmpleados();
     
     empresa.verObras();
    } 
}
