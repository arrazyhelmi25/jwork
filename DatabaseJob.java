/**
 * Kelas DatabaseJob
 * Sesuai dengan nama kelasnya, sepertinya akan digunakan untuk mengatur segala data terkait suatu pekerjaan, atau database pekerjaan.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * @author Helmi Arrazy
 * @version 18-03-2021
 */
public class DatabaseJob
{
    // Deklarasi instance variables yang digunakan.
    // Access Modifier variable di set private.
    private String [] listJob;

    /**
     * Sebuah constructor default yang bernama DatabaseJob.
     * Access modifier dari constructor bertipe public.
     * 
     */
    public DatabaseJob()
    {
        // Tidak ada parameter, instruksi, ataupun variables yang dideklarasikan.
        
        
    }

    /**
     * Sebuah method yang bernama addJob, sepertinya method ini digunakan untuk menambahkan data job.
     * Access Modifier method berjenis public.
     * Keyword static digunakan agar method ini dapat diakses dari class lain tanpa harus membuat objeknya terlebih dahulu.
     * Return type dari method bertipe boolean.
     * Ada parameter yang digunakan pada method, yaitu job.
     * 
     * @param job digunakan sebagai inputan untuk method ini
     * @return false jenis nilai yang dikembalikkan berupa tipe data boolean yaitu 'false'
     * 
     */
    public static boolean addJob(Job job)
    {
        return false;
    }
    
    
    /**
     * Sebuah method yang bernama removeJob, sepertinya method ini digunakan untuk membuang data job.
     * Access Modifier method berjenis public.
     * Return type dari method bertipe boolean.
     * Ada parameter yang digunakan pada method, yaitu job.
     * 
     * @param job digunakan sebagai inputan untuk method ini
     * @return false jenis nilai yang dikembalikkan berupa tipe data boolean yaitu 'false'
     * 
     */
    public boolean removeJob(Job job)
    {
        return false;
    }
    
    
    /**
     * Sebuah method yang bernama getJob, sepertinya method ini digunakan untuk mendapatkan job.
     * Access Modifier method berjenis public.
     * Return type dari method berjenis Job (sepertinya object atau kelas).
     * Tidak ada parameter yang digunakan pada method ini.
     * 
     * @return null artinya tidak ada data (null) yang dikembalikkan
     * 
     */
    
    public Job getJob()
    {
        return null;
    }
    
    /**
     * Sebuah method yang bernama getListJob, sepertinya method ini digunakan untuk mendapatkan daftar dari data job.
     * Access Modifier method berjenis public.
     * Return type dari method bertipe String array.
     * Tidak ada parameter yang digunakan pada method ini.
     * 
     * 
     * @return null artinya tidak ada data (null) yang dikembalikkan
     * 
     */
    public String [] getListJob ()
    {
        return null;
    }
}
