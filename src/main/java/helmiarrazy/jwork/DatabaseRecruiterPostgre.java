package helmiarrazy.jwork;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 * Kelas DatabaseRecruiterPostgre, berfungsi untuk mengatur semua operasi Database Recruiter pada PostgreSQL
 *
 * @author Helmi Arrazy
 * @version 21-06-2021
 */
public class DatabaseRecruiterPostgre {
    // Instance Variable
    private static Connection c = null;
    private static Statement stmt = null;


    /**
     * Method addRecruiter digunakan untuk  menambahkan data recruiter baru pada database
     *
     * @param recruiter sebagai input untuk data atau objek recruiter yang akan ditambahkan
     * @return objek recruiter jika berhasil
     */
    public static Recruiter addRecruiter(Recruiter recruiter){
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            int id = recruiter.getId();
            String name = recruiter.getName();
            String email = recruiter.getEmail();
            String phoneNumber = recruiter.getPhoneNumber();
            String province = recruiter.getLocation().getProvince();
            String description = recruiter.getLocation().getDescription();
            String city = recruiter.getLocation().getCity();

            String query =  "INSERT INTO recruiter (id, name, email, phoneNumber, province, description, city)"
                    + "VALUES (" + id + ",'" + name + "','"+ email + "','"+ phoneNumber + "','" + province + "','"+ description + "','" + city + "');";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
            return null;
        }
        return recruiter;
    }


    /**
     * Method getter (accessor) yang bernama getRecruiterById, berfungsi untuk mendapatkan data recruiter berdasarkan Id yang diinputkan
     *
     * @param id sebagai inputan id dari recruiter yang ingin ditampilkan
     * @return value yang berisi informasi data recruiter yang akan ditampilkan berdasarkan id yang telah diinputkan
     */
    public static Recruiter getRecruiterById(int id) {
        Recruiter value = null;
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM recruiter WHERE id = "+ id +"");
            while (rs.next()) {
                id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");
                String province = rs.getString("province");
                String description = rs.getString("description");
                String city = rs.getString("city");

                value = new Recruiter(id, name, email, phoneNumber, new Location(province, description, city));
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }


    /**
     * Method getter (accessor) yang bernama getLastRecruiterId, berfungsi untuk mendapatkan ID recruiter terakhir dari database
     *
<<<<<<< HEAD
     * @return value yang berisi id terakhir dari recruiter
=======
     * return value yang berisi id terakhir dari recruiter
>>>>>>> 80265ed36f47cefa04a71b0ba23b0aa19735365e
     */
    public static int getLastRecruiterId() {
        int value = 0;
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX (id) FROM recruiter;");
            while (rs.next()) {
                value = rs.getInt("max");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }



    /**
     * Method getter (accessor) yang bernama getRecruiterDatabase, berfungsi untuk menampilkan semua data recruiter yang ada di Database
     *
     * @return objek atau semua data recruiters jika berhasil
     */
    public static ArrayList<Recruiter> getRecruiterDatabase() {
        ArrayList<Recruiter> recruiters = new ArrayList<>();
        Recruiter value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM recruiter;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");
                String province = rs.getString("province");
                String description = rs.getString("description");
                String city = rs.getString("city");

                value = new Recruiter(id, name, email, phoneNumber, new Location(province, description, city));
                recruiters.add(value);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return recruiters;
    }


    /**
     * Method removeBonus, berfungsi untuk  untuk menghapus data recruiter tertentu dari database
     *
     * @param id digunakan untuk menghapus data recruiter berdasarkan id yang diinputkan
     * @return boolean untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean removeRecruiter(int id) {
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            String query = "DELETE FROM recruiter WHERE id = "+ id +"";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return true;
    }


}
