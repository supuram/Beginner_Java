package DataBase_MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Fifth_DataEntry
{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/giraffe";
        String user = "root";
        String password = "a";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO student (Student_ID,name,major,GPA,Hobby) VALUES (12, 'Madhubani', 'Electrical', 7.64, 'Badminton')");
            stmt.executeUpdate("INSERT INTO student (Student_ID,name,major,GPA,Hobby) VALUES (13, 'Chitrak', 'Civil', 9.59, 'Cricket')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
