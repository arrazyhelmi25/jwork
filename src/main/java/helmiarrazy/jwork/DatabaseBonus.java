package helmiarrazy.jwork;
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
public class DatabaseBonus {
    // instance variables
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException{
        Bonus temp = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                temp = bonus;
                return temp;
            }
        }
        if (temp == null){
            throw new BonusNotFoundException(id);
        }
        return temp;
    }

    public static Bonus getBonusByReferralCode(String referralCode){
        Bonus temp = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (referralCode.equals(bonus.getReferralCode())) {
                temp = bonus;
            }
        }
        return temp;
    }


    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for (Bonus element : BONUS_DATABASE) {
            if (element.getReferralCode() == bonus.getReferralCode()) {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activateBonus(int id){
        boolean temp = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                temp = true;
            }
        }
        return temp;
    }

    public static boolean deactivateBonus(int id){
        boolean temp = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                temp = true;
            }
        }
        return temp;
    }


    public static boolean removeBonus(int id) throws BonusNotFoundException {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        throw new BonusNotFoundException(id);
    }
}
