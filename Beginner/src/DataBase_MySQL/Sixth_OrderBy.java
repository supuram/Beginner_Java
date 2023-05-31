package DataBase_MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Sixth_OrderBy {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/giraffe";
        String username = "root";
        String password = "Kedarkamod@248";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String query = "ALTER TABLE student ORDER BY Student_ID ASC";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
ALTER TABLE student ORDER BY Student_ID ASC permanently arranges the table student in ascending
order according to the Student_ID
 */