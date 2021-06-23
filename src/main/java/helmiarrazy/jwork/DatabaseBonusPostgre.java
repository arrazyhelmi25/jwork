package helmiarrazy.jwork;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Kelas DatabaseBonusPostgre, berfungsi untuk mengatur semua operasi Database Bonus pada PostgreSQL
 *
 * @author Helmi Arrazy
 * @version 21-06-2021
 */
public class DatabaseBonusPostgre {
    // Instance Variable
    private static Connection c = null;
    private static Statement stmt = null;


    /**
     * Method addBonus digunakan untuk  menambahkan data bonus baru pada database
     *
     * @param bonus sebagai input untuk data atau objek bonus yang akan ditambahkan
     * @return objek bonus jika berhasil
     */
    public static Bonus addBonus(Bonus bonus){
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            int id = bonus.getId();
            String referralCode = bonus.getReferralCode();
            int extraFee = bonus.getExtraFee();
            int minTotalFee = bonus.getMinTotalFee();
            boolean active = bonus.getActive();

            String query =  "INSERT INTO bonus (id, referralCode, extraFee, minTotalFee, active)"
                    + "VALUES (" + id + ",'" + referralCode + "','"+ extraFee + "','"+ minTotalFee + "','" + active + "');";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
            return null;
        }
        return bonus;
    }


    /**
     * Method getter (accessor) yang bernama getBonusById, berfungsi untuk mendapatkan data bonus berdasarkan Id yang diinputkan
     *
     * @param id sebagai inputan id dari bonus yang ingin ditampilkan
     * @return value yang berisi informasi data bonus yang akan ditampilkan berdasarkan id yang telah diinputkan
     */
    public static Bonus getBonusById(int id) {
        Bonus value = null;
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM bonus WHERE id = "+ id +"");
            while (rs.next()) {
                id = rs.getInt("id");
                String referralCode = rs.getString("referralCode");
                int extraFee = rs.getInt("extraFee");
                int minTotalFee = rs.getInt("minTotalFee");
                boolean active = rs.getBoolean("active");
                value = new Bonus(id, referralCode, extraFee, minTotalFee, active);
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
     * Method getter (accessor) yang bernama getLastBonusId, berfungsi untuk mendapatkan ID bonus terakhir dari database
     *
<<<<<<< HEAD
     * @return value yang berisi id terakhir dari bonus
=======
     * return value yang berisi id terakhir dari bonus
>>>>>>> 80265ed36f47cefa04a71b0ba23b0aa19735365e
     */
    public static int getLastBonusId() {
        int value = 0;
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX (id) FROM bonus;");
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
     * Method getter (accessor) yang bernama getBonusByReferralCode, berfungsi untuk mendapatkan data bonus berdasarkan referral code yang diinputkan
     *
     * @param referralCode sebagai inputan referral code dari bonus yang ingin ditampilkan
     * @return value yang berisi informasi data bonus yang akan ditampilkan berdasarkan referral code yang telah diinputkan
     */
    public static Bonus getBonusByReferralCode(String referralCode) {
        Bonus value = null;
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM bonus WHERE referralCode = '" + referralCode + "'");
            while (rs.next()) {
                referralCode = rs.getString("referralCode");
                int id = rs.getInt("id");
                int extraFee = rs.getInt("extraFee");
                int minTotalFee = rs.getInt("minTotalFee");
                boolean active = rs.getBoolean("active");
                value = new Bonus(id, referralCode, extraFee, minTotalFee, active);
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
     * Method getter (accessor) yang bernama getBonusDatabase, berfungsi untuk menampilkan semua data bonus yang ada di Database
     *
     * @return objek atau semua data bonus jika berhasil
     */
    public static ArrayList<Bonus> getBonusDatabase() {
        ArrayList<Bonus> bonuses = new ArrayList<>();
        Bonus value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM bonus;");
            while (rs.next()) {
                String referralCode = rs.getString("referralCode");
                int id = rs.getInt("id");
                int extraFee = rs.getInt("extraFee");
                int minTotalFee = rs.getInt("minTotalFee");
                boolean active = rs.getBoolean("active");
                value = new Bonus(id, referralCode, extraFee, minTotalFee, active);
                bonuses.add(value);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return bonuses;
    }


    /**
     * Method removeBonus, berfungsi untuk  untuk menghapus data bonus tertentu dari database
     *
     * @param id digunakan untuk menghapus data bonus berdasarkan id yang diinputkan
     * @return boolean untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean removeBonus(int id) {
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            String query = "DELETE FROM bonus WHERE id = "+ id +"";
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
