package DataBase_MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Fourth_DataEntry {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/giraffe";
        String user = "root";
        String password = "a";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query1 = "INSERT INTO student (Student_ID, name, major, GPA, Hobby) VALUES (?,?,?,?,?)";
            String query2 = "INSERT INTO student (Student_ID, name, major, GPA, Hobby) VALUES (?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(query1);
            PreparedStatement stmt1 = conn.prepareStatement(query2);
            stmt.setInt(1, 9);
            stmt.setString(2, "Timon");
            stmt.setString(3, "Civil");
            stmt.setFloat(4,8.23f);
            stmt.setString(5, "Football");
            stmt.executeUpdate();

            stmt1.setInt(1, 11);
            stmt1.setString(2, "Tania");
            stmt1.setString(3, "English");
            stmt1.setFloat(4,9.76f);
            stmt1.setString(5, "Badminton");
            stmt1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Note that the data number 9 has been overwritten by data number 10.
 */
