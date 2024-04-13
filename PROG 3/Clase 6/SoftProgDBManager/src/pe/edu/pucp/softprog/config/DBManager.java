package pe.edu.pucp.softprog.config;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
    private Connection con;
    private static String url = "jdbc:mysql://"+
            "db-prog3-softprog.cifcsbehaca5.us-east-1.rds.amazonaws.com"+
            ":3306/prog3";
    private String user = "admin";
    private String password = "prog3softprog";
    //Metodo de diseno Singleton
    private static DBManager dbManager;
    public static DBManager getInstance(){
        if(dbManager == null){
            createInstance();
        }
        return dbManager;
    }
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    private static void createInstance(){
        if(dbManager==null){
            dbManager = new DBManager();
        }
    }
}
