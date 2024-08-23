package UmDeAgosto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:numero_porta/nome_banco";
        String user = "postgres";
        String password = "";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();

            rs = stmt.executeQuery("SELECT * FROM casa");

            while (rs.next()) {
                System.out.println("Coluna 1: " + rs.getString("id"));
                System.out.println("Coluna 2: " + rs.getString("rua"));
                System.out.println("Coluna 3: " + rs.getString("numero"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



