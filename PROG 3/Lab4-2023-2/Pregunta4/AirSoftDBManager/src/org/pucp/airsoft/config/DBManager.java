package org.pucp.airsoft.config;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
    private Connection con;
    private static DBManager dbManager = new DBManager();
    private String url = "jdbc:mysql://"+
            "lp2-labs-inf282-2023-2.cifcsbehaca5.us-east-1.rds.amazonaws.com"+
            ":3306/inf282";
    private String username = "master";
    private String password = "lp2labsinf282";
    
    public Connection getConnection(){
        try{
            //Registrar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establecer la conexion con la DB
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Se ha establecido la conexion con la Base de Datos");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
    public static DBManager getInstance(){
        return dbManager;
    }
}
