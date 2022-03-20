package utility;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class ConnectionDb {
    private final String URL="jdbs:postgresql://localhost:5432/SatisDB";
    private final String username= "postgres";
    private final String password="root";
    //bağlantı için
    private Connection connection;
    public Connection getConnection(){
        try{
            Driver.class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL,username,password);
            return connection;
        }catch (Exception e) {
            System.out.println("Hata...= " + e.toString());
            return null;
        }
    }
    public void closeConnection(){
        try{
            if(!connection.isClosed()){
                connection.close();
            }
        }catch (Exception e){
            System.out.println("Close Error...: "+e.toString());
        }
    }
}
