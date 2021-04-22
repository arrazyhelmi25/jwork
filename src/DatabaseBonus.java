import java.util.ArrayList;

/**
 * Kelas DatabaseBonus,
 * Sesuai dengan nama kelasnya, sepertinya akan digunakan untuk mengatur segala data terkait suatu bonus, atau database bonus pekerjaan.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * 
 * @author Helmi Arrazy
 * @version 01-04-2021
 */
public class DatabaseBonus
{
    // Deklarasi instance variables yang digunakan.
    // Access Modifier variable di set private.
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase()
    {
        return BONUS_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Bonus getBonusById(int id){
        Bonus x = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                x = bonus;
            }
            else {
                x = null;
            }
        }
        return x;
    }

    public static Bonus getBonusByReferralCode(String referralCode){
        Bonus x = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (referralCode.equals(bonus.getReferralCode())) {
                x = bonus;
            }
            else {
                x = null;
            }
        }
        return x;
    }

    public static boolean addBonus(Bonus bonus)
    {
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activeBonus (int id)
    {
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                x = true;
            }
            else {
                x = false;
            }
        }
        return x;
    }

    public static boolean deactiveBonus (int id)
    {
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                x = true;
            }
            else {
                x = false;
            }
        }
        return x;
    }

    public static boolean removeBonus (int id)
    {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        return false;
    }
}
