package helmiarrazy.jwork;
import java.util.ArrayList;

/**
 * Kelas DatabaseRecruiter digunakan untuk mengatur segala data terkait suatu database Recruiter.
 * 
 * @author Helmi Arrazy
 * @version 20-03-2021
 */
public class DatabaseRecruiter
{
    // instance variables
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;


    /**
     * Method getter (accessor) yang bernama getRecruiterDatabase, berfungsi untuk mengambil isi list data Recruiter_DATABASE;
     *
     * @return Recruiter_DATABASE mengembalikkan semua isi data Recruiter_DATABASE
     */
    public static ArrayList<Recruiter> getRecruiterDatabase() {
        return RECRUITER_DATABASE;
    }


    /**
     * Method getter (accessor) yang bernama getLastId, berfungsi untuk mendapatkan Id dari Job terakhir
     *
     * @return lastId mengembalikkan isi variable lastId (id terkahir)
     */
    public static int getLastId() {
        return lastId;
    }


    /**
     * Method getter (accessor) yang bernama getRecruiterById, berfungsi untuk mendapatkan data Recruiter berdasarkan Id nya
     *
     * @param id yaitu menggunakan inputan id dari recruiter untuk menampilkan data recruiter yang sesuai
     * @return temp sebagai objek dari Recruiter
     */
    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Recruiter temp = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                temp = recruiter;
                return temp;
            }
        }
        throw new RecruiterNotFoundException(id);
    }


    /**
     * Method addRecruiter, berfungsi untuk menambahkan data Recruiter baru kedalam Database Recruiter
     *
     * @param recruiter sebagai inputan data recruiter baru yang akan ditambahkan ke Database Recruiter
     * @return booelan untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }


    /**
     * Method removeRecruiter, berfungsi untuk menghapus data Recruiter yang ada di dalam Database Recruiter
     *
     * @param id sebagai inputan untuk menghapus recruiter berdasarkan Id yang diinputkan
     * @return booelan untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        boolean temp = true;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                RECRUITER_DATABASE.remove(recruiter);
                temp = true;
                return temp;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
}
