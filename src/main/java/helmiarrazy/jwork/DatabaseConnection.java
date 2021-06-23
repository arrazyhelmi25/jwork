package helmiarrazy.jwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 * Kelas DatabaseConnection, berfungsi untuk membuat koneksi dengan database pada server (PostgreSQL)
 *
 * @author Helmi Arrazy
 * @version 20-06-2021
 */
public class DatabaseConnection {

    /**
     * Method connection digunakan untuk konfigurasi database PostgreSQL yang digunakan
     *
<<<<<<< HEAD
     * @return c yaitu mengubungkan database dengan server (localhost)
=======
     * @return r yaitu mengubungkan database dengan server (localhost)
>>>>>>> 80265ed36f47cefa04a71b0ba23b0aa19735365e
     */
    public static Connection connection() {
        Connection c = null;
        Statement stmt = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "root";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + db_name, db_user, db_password);
            System.out.println("Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
