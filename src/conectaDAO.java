
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public class conectaDAO {
    
    public Connection connectDB() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/leiloestdsat",
                "root",
                "1234"
            );
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
    
}
