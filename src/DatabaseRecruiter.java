import java.util.ArrayList;

/**
 * Kelas DatabaseRecruiter
 * 
 * @author Helmi Arrazy
 * @version 20-03-2021
 */
public class DatabaseRecruiter
{
    // instance variables
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase() {
        return RECRUITER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Recruiter getRecruiterById(int id) {
        Recruiter temp = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()){
                temp = recruiter;
            }
            else{
                temp =  null;
            }
        }
        return temp;
    }


    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }


    public static boolean removeRecruiter(int id)
    {
        boolean temp = true;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()){
                RECRUITER_DATABASE.remove(id);
                temp = true;
            }
            else{
                temp = false;
            }
        }
        return temp;
    }
}
