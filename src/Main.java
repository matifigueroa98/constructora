
import Model.Empleados.*;
import Model.Empresa.Empresa;
import Model.Obras.*;

public class Main {


    public static void main(String[] args) {
       
     Obrero obrero1 = new Obrero (24, "Matias","40864421", "2236036523");
     Obrero obrero2 = new Obrero (58, "Edgardo", "16923053", "2235052985");
     Obrero obrero3 = new Obrero (56, "Mariela", "17871097", "2235968954");
     Arquitecto arquitecto = new Arquitecto (305, "Juan", "40876567", "2235761058");
     MaestroMayorDeObra maestro1 = new MaestroMayorDeObra (30, "Ernudo", "37509654", "2235490829");
     MaestroMayorDeObra maestro2 = new MaestroMayorDeObra (36, "Kobe", "120321431", "2236396563");
     
     obrero1.construir();
     maestro1.construir();
     arquitecto.crearPlanos();
     
    
     
     
     
    }
}
