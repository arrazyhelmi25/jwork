package helmiarrazy.jwork;

/**
 * Kelas Location, dalam kelas ini terdapat beberapa method acessor (get) dan mutator (set).
 * Serta adanya sebuah method yang bertipe void untuk melakukan printData.
 * Sesuai dengan nama kelasnya (Location) yang berarti lokasi, sepertinya akan digunakan untuk mengatur segala data yang terkait dengan detail suatu lokasi.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * @author Helmi Arrazy
 * @version 18-03-2021
 */
public class Location
{
    // Deklarasi beberapa instance variables yang akan digunakan.
    // Access Modifier variable di set private.
    private String province;
    private String city;
    private String description;
    
    /**
     * Sebuah Constructor default yang bernama Location.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param province merupakan nilai inputan untuk variable province
     * @param city  merupakan nilai inputan untuk variable city
     * @param description  merupakan nilai inputan untuk variable description
     */
    public Location (String province, String city, String description)
    {
        /* Digunakan sebuah keyword 'this'.Tujuaanya untuk menyatakan atau mereferensikan variable yang ada didalam class itu sendiri, 
         * yaitu variable instance pada class Location yang ada diatas. 
         * Agar sistem komputer tidak bingung ketika menetapkan nilai variablenya, 
         * karena nama variable instance dan nama parameter dalam konstruktor sama, jadi harus direferensikan/diarahkan.*/
        this.province = province;
        this.city = city;
        this.description = description;
    }

    
    
    /**
     * Sebuah method getter (accessor) yang bernama getProvince untuk mendapatkan/mengembalikkan data province.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return province jadi mengembalikkan nilai yang ada didalam variable province
     */
    public String getProvince()
    {
        return province;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getCity untuk mendapatkan/mengembalikkan data city.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return city jadi mengembalikkan nilai yang ada didalam variable city
     */
    public String getCity()
    {
        return city;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getDescription untuk mendapatkan/mengembalikkan data description.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return description jadi mengembalikkan nilai yang ada didalam variable description
     */
    public String getDescription()
    {
        return description;
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setProvince untuk menetapkan/mengisi nilai dari variable province.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu province.
     * Access modifier pada method berjenis public.
     * 
     * @param province digunakan sebagai inputan untuk variable province
     */
    public void setProvince(String province)
    {
        this.province = province; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setCity untuk menetapkan/mengisi nilai dari variable city.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu city.
     * Access modifier pada method berjenis public.
     * 
     * @param city digunakan sebagai inputan untuk variable city
     */
    public void setCity(String city)
    {
        this.city = city; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setDescription untuk menetapkan/mengisi nilai dari variable description.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu description.
     * Access modifier pada method berjenis public.
     * 
     * @param description digunakan sebagai inputan untuk variable description
     */
    public void setDescription(String description)
    {
        this.description = description; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    @Override
    public String toString(){
        return "Province = "+getProvince()+"\nCity = "+getCity()+"\nDescription = "+getDescription();
    }
}