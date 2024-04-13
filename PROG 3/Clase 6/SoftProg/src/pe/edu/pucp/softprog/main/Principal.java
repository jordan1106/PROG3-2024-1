package pe.edu.pucp.softprog.main;
import java.util.ArrayList;
import pe.edu.pucp.softprog.rrhh.dao.AreaDAO;
import pe.edu.pucp.softprog.rrhh.model.Area;
import pe.edu.pucp.softprog.rrhh.mysql.AreaMySQL;

public class Principal {
    public static void main(String[] args){
        /*
        //Para insertar
        Area area = new Area("CONTABILIDAD");
        AreaDAO daoArea = new AreaMySQL();
        int resultado = daoArea.insertar(area);
        if(resultado!=0){
            System.out.println("Se ha registrado con exito");
        }else{
            System.out.println("Ha ocurrido un error");
        }
        */
        
        
        //Para listar
        AreaDAO daoArea = new AreaMySQL();
        ArrayList<Area> areas = daoArea.listarTodas();
        for(Area area: areas){
            System.out.println(area.getIdArea() + ". "+area.getNombre());
        }
        
        
        //Para actualizar
        Area areaModificar = areas.get(3);
        areaModificar.setNombre("CAFETERIA");
        int resultado = daoArea.modificar(areaModificar);
        if(resultado!=0){
            System.out.println("Se realizo con exito la modificacion");
        }else{
            System.out.println("Ha ocurrido un error en la modificacion");
        }
        
        daoArea.eliminar(areaModificar.getIdArea());
    }
}
