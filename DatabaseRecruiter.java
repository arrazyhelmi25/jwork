/**
 * Kelas DatabaseRecruiter
 * Sesuai dengan nama kelasnya, sepertinya akan digunakan untuk mengatur segala data terkait suatu database perekrut (recruiter).
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * @author Helmi Arrazy
 * @version 20-03-2021
 */
public class DatabaseRecruiter
{
    // Deklarasi instance variables yang digunakan.
    // Access Modifier variable di set private.
    private static String [] listRecruiter;


    /**
     * Sebuah method yang bernama addRecruiter, sepertinya method ini digunakan untuk menambahkan data recruiter.
     * Access Modifier method berjenis public.
     * Keyword static digunakan agar method ini dapat diakses dari class lain tanpa harus membuat objeknya terlebih dahulu.
     * Return type dari method bertipe boolean.
     * Ada parameter yang digunakan pada method, yaitu recruiter.
     * 
     * @param recruiter digunakan sebagai inputan untuk method ini
     * @return false jenis nilai yang dikembalikkan berupa tipe data boolean yaitu 'false'
     * 
     */
    public static boolean addRecruiter(Recruiter recruiter)
    {
        return false;
    }
    
    
    /**
     * Sebuah method yang bernama removeRecruiter, sepertinya method ini digunakan untuk membuang data recruiter.
     * Access Modifier method berjenis public.
     * Return type dari method bertipe boolean.
     * Ada parameter yang digunakan pada method, yaitu recruiter.
     * 
     * @param recruiter digunakan sebagai inputan untuk method ini
     * @return false jenis nilai yang dikembalikkan berupa tipe data boolean yaitu 'false'
     * 
     */
    public static boolean removeRecruiter(Recruiter recruiter)
    {
        return false;
    }
    
    
    /**
     * Sebuah method yang bernama getRecruiter, sepertinya method ini digunakan untuk mendapatkan data recruiter.
     * Access Modifier method berjenis public.
     * Return type dari method berjenis Recruiter (sepertinya object atau kelas).
     * Tidak ada parameter yang digunakan pada method ini.
     * 
     * @return null artinya tidak ada data (null) yang dikembalikkan
     * 
     */
    public static Recruiter getRecruiter()
    {
        return null;
    }
    
    
    /**
     * Sebuah method yang bernama getListRecruiter, sepertinya method ini digunakan untuk mendapatkan daftar dari data recruiter.
     * Access Modifier method berjenis public.
     * Return type dari method bertipe String array.
     * Tidak ada parameter yang digunakan pada method ini.
     * 
     * 
     * @return listRecruiter jadi mengembalikkan nilai/data yang ada didalam variable listRecruiter
     * 
     */
    public static String [] getListRecruiter()
    {
        return listRecruiter;
    }
}
