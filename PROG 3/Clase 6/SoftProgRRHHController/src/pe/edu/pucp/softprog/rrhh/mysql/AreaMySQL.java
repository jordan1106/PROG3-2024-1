package pe.edu.pucp.softprog.rrhh.mysql;
import java.util.ArrayList;
import pe.edu.pucp.softprog.rrhh.dao.AreaDAO;
import pe.edu.pucp.softprog.rrhh.model.Area;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import pe.edu.pucp.softprog.config.DBManager;

public class AreaMySQL implements AreaDAO{

    private Connection con;
    private Statement st;
    private ResultSet rs;
    @Override
    public int insertar(Area area) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            /*
            Antes del metodo Singleton
            //Registrar un driver conexion
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Realizamos la conexion
            con = DriverManager.getConnection(DBManager.url,DBManager.user,DBManager.password);
            */
            String sql = "INSERT INTO area(nombre,activo) "+"VALUES('"+area.getNombre()+"',1)";
            st = con.createStatement();
            resultado = st.executeUpdate(sql);
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                con.close();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }

    @Override
    public int modificar(Area area) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            /*
            //Registrar un driver conexion
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Realizamos la conexion
            con = DriverManager.getConnection(DBManager.url,DBManager.user,DBManager.password);
            */
            String sql = "UPDATE area SET nombre='"+area.getNombre()+"' where id_area="+area.getIdArea()+";";
            st = con.createStatement();
            resultado = st.executeUpdate(sql);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                con.close();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }

    @Override
    public int eliminar(int idArea) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            /*
            //Registrar un driver conexion
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Realizamos la conexion
            con = DriverManager.getConnection(DBManager.url,DBManager.user,DBManager.password);
            */
            String sql = "UPDATE area SET activo =0 where id_area="+idArea;
            st = con.createStatement();
            resultado = st.executeUpdate(sql);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                con.close();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return resultado;    }

    @Override
    public ArrayList<Area> listarTodas() {
        ArrayList<Area> areas = new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //con = DriverManager.getConnection(DBManager.url,DBManager.user,DBManager.password);
            String sql = "SELECT * FROM area WHERE activo = 1";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Area area = new Area();
                area.setIdArea(rs.getInt("id_area"));
                area.setNombre(rs.getString("nombre"));
                area.setActivo(true);
                areas.add(area);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                rs.close();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            try{
                con.close();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return areas;
    }
    
}
