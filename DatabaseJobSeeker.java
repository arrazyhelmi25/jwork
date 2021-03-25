/**
 * Kelas DatabaseJobSeeker
 * Sesuai dengan nama kelasnya, sepertinya akan digunakan untuk mengatur segala data terkait suatu database pencari pekerjaan.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * @author Helmi Arrazy
 * @version 25-03-2021
 */
public class DatabaseJobSeeker
{
    // Deklarasi instance variables yang digunakan.
    // Access Modifier variable di set private.
    private static String [] listJobSeeker;
    
    
    /**
     * Sebuah method yang bernama addJobSeeker, sepertinya method ini digunakan untuk menambahkan data jobseeker.
     * Access Modifier method berjenis public.
     * Keyword static digunakan agar method ini dapat diakses dari class lain tanpa harus membuat objeknya terlebih dahulu.
     * Return type dari method bertipe boolean.
     * Ada parameter yang digunakan pada method, yaitu jobseeker.
     * 
     * @param jobseeker digunakan sebagai inputan untuk method ini
     * @return false jenis nilai yang dikembalikkan berupa tipe data boolean yaitu 'false'
     * 
     */
    public static boolean addJobSeeker(Jobseeker jobseeker)
    {
        return false;
    }
    
    
    /**
     * Sebuah method yang bernama removeJobSeeker, sepertinya method ini digunakan untuk membuang data jobseeker.
     * Access Modifier method berjenis public.
     * Return type dari method bertipe boolean.
     * Ada parameter yang digunakan pada method, yaitu jobseeker.
     * 
     * @param jobseeker digunakan sebagai inputan untuk method ini
     * @return false jenis nilai yang dikembalikkan berupa tipe data boolean yaitu 'false'
     * 
     */
    public static boolean removeJobSeeker(Jobseeker jobseeker)
    {
        return false;
    }
    
    
    /**
     * Sebuah method yang bernama getJobSeeker, sepertinya method ini digunakan untuk mendapatkan data jobseeker.
     * Access Modifier method berjenis public.
     * Return type dari method berjenis Jobseeker (sepertinya object atau kelas).
     * Tidak ada parameter yang digunakan pada method ini.
     * 
     * @return null artinya tidak ada data (null) yang dikembalikkan
     * 
     */
    public static Jobseeker getJobSeeker()
    {
        return null;
    }
    
    /**
     * Sebuah method yang bernama getListJobSeeker, sepertinya method ini digunakan untuk mendapatkan daftar dari data jobseeker.
     * Access Modifier method berjenis public.
     * Return type dari method bertipe String array.
     * Tidak ada parameter yang digunakan pada method ini.
     * 
     * 
     * @return listJobSeeker jadi mengembalikkan nilai/data yang ada didalam variable listJobSeeker
     * 
     */
    public static String [] getListJobSeeker()
    {
        return listJobSeeker;
    }
}
