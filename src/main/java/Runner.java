
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Runner {
    public static void main(String[] args) {
        try{
            //Driver ı kullan
            Driver.class.forName("org.postgresql.Driver");
            //Bağlantı yap
            /*
            ConnectionString -> her veritabanı için ayrı yazılır.
            bir veri tabanı için connectionstring arayacaksanız veri tabanının kendi sitesine baın.
             */
            String URL="jdbs:postgresql://localhost:5432/SatisDB";
            String username="postgres";
            String password="root";

            Connection conn =
                    DriverManager.getConnection(URL,username,password);
            //Emir ver
            String SQL="insert into tblmusteri(ad,soyad) values ('Ayşe,'Ün')";
            PreparedStatement pst =conn.prepareCall(SQL);
            //Emri işle
            pst.executeUpdate();
            //bağlantıyı kapat
            conn.close();
        }catch (Exception e){
            System.out.println("Hata....: "+e.toString());
        }

    }
}
