package DataBase_MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Third_DataEntryAgain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/giraffe";
        String user = "root";
        String password = "pass";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO student (Student_ID, name, major, GPA, Hobby) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, 9);
            stmt.setString(2, "Timon");
            stmt.setString(3, "Civil");
            stmt.setFloat(4,9.76f);
            stmt.setString(5, "Badminton");
            stmt.setInt(1, 10);
            stmt.setString(2, "Baisakhi");
            stmt.setString(3, "Electrical");
            stmt.setFloat(4,8.12f);
            stmt.setString(5, "Badminton");
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Note that the data number 9 has been overwritten by data number 10.
 */
