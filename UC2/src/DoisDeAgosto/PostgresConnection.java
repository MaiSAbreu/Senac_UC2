package DoisDeAgosto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class PostgresConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/Atividade";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // Example usage
            insertCasa(conn, 11, "Rua K", 101, "Bairro X", "Cidade Y", "12345-678", "Tipo A", 2000, "Disponível", 3, "João Silva");
            buscarCasas(conn);
            apagarCasa(conn, 11);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to insert a new record
    public static void insertCasa(Connection conn, int id, String rua, int numero, String bairro, String cidade, String cep, String tipo, int anoConstrucao, String status, int quartos, String proprietario) throws SQLException {
        String sql = "INSERT INTO casa (id, rua, numero, bairro, cidade, cep, tipo, ano_construcao, status, quartos, proprietario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, rua);
            pstmt.setInt(3, numero);
            pstmt.setString(4, bairro);
            pstmt.setString(5, cidade);
            pstmt.setString(6, cep);
            pstmt.setString(7, tipo);
            pstmt.setInt(8, anoConstrucao);
            pstmt.setString(9, status);
            pstmt.setInt(10, quartos);
            pstmt.setString(11, proprietario);
            pstmt.executeUpdate();
            System.out.println("Inserido com sucesso!");
        }
    }

    // Method to fetch all records
    public static void buscarCasas(Connection conn) throws SQLException {
        String sql = "SELECT * FROM casa";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Rua: " + rs.getString("rua"));
                System.out.println("Número: " + rs.getInt("numero"));
                System.out.println("Bairro: " + rs.getString("bairro"));
                System.out.println("Cidade: " + rs.getString("cidade"));
                System.out.println("CEP: " + rs.getString("cep"));
                System.out.println("Tipo: " + rs.getString("tipo"));
                System.out.println("Ano de Construção: " + rs.getInt("ano_construcao"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("Quartos: " + rs.getInt("quartos"));
                System.out.println("Proprietário: " + rs.getString("proprietario"));
                System.out.println();
            }
        }
    }

    // Method to delete a record by ID
    public static void apagarCasa(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM casa WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Registro excluído com sucesso!");
            } else {
                System.out.println("Nenhum registro encontrado com o ID fornecido.");
            }
        }
    }
}