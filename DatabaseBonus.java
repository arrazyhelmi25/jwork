
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
    private static String [] listBonus;

    /**
     * Sebuah method yang bernama addBonus, sepertinya method ini digunakan untuk menambahkan data bonus;
     * Access Modifier method berjenis public.
     * Keyword static digunakan agar method ini dapat diakses dari class lain tanpa harus membuat objeknya terlebih dahulu.
     * Return type dari method bertipe boolean.
     * Ada parameter yang digunakan pada method, yaitu bonus.
     * 
     * @param bonus digunakan sebagai inputan untuk method ini
     * @return false jenis nilai yang dikembalikkan berupa tipe data boolean yaitu 'false'
     * 
     */
    public static boolean addBonus(Bonus bonus)
    {
        return false;
    }
    
    
    /**
     * Sebuah method yang bernama removeBonus, sepertinya method ini digunakan untuk membuang data bonus.
     * Access Modifier method berjenis public.
     * Keyword static digunakan agar method ini dapat diakses dari class lain tanpa harus membuat objeknya terlebih dahulu.
     * Return type dari method bertipe boolean.
     * Ada parameter yang digunakan pada method, yaitu bonus.
     * 
     * @param bonus digunakan sebagai inputan untuk method ini
     * @return false jenis nilai yang dikembalikkan berupa tipe data boolean yaitu 'false'
     * 
     */
    public static boolean removeBonus(Bonus bonus)
    {
        return false;
    }
    
    
    /**
     * Sebuah method yang bernama getBonus, sepertinya method ini digunakan untuk mendapatkan data bonus.
     * Access Modifier method berjenis public.
     * Keyword static digunakan agar method ini dapat diakses dari class lain tanpa harus membuat objeknya terlebih dahulu.
     * Return type dari method berjenis Bonus (yang merupakan class).
     * Tidak ada parameter yang digunakan pada method ini.
     * 
     * @return null artinya tidak ada data (null) yang dikembalikkan
     * 
     */
    public static Bonus getBonus()
    {
        return null;
    }
    
    
    /**
     * Sebuah method yang bernama getListBonus, sepertinya method ini digunakan untuk mendapatkan daftar dari data bonus.
     * Access Modifier method berjenis public.
     * Keyword static digunakan agar method ini dapat diakses dari class lain tanpa harus membuat objeknya terlebih dahulu.
     * Return type dari method bertipe String array.
     * Tidak ada parameter yang digunakan pada method ini.
     * 
     * 
     * @return listBonus artinya mengembalikkan nilai/data yang ada didalam variable listBonus
     * 
     */
    public static String [] getListBonus()
    {
        return listBonus;
    }
}
