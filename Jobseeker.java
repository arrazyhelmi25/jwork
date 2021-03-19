/**
 * Kelas Jobseeker, dalam kelas ini terdapat beberapa method acessor (get) dan mutator (set).
 * Serta adanya sebuah method yang bertipe void untuk melakukan printData.
 * Sesuai dengan nama kelasnya (Jobseeker) yang berarti pencari kerja, sepertinya akan digunakan untuk mengatur segala data yang terkait dengan detail orang pencari kerja.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * @author Helmi Arrazy
 * @version 18-03-2021
 */
public class Jobseeker
{
    // Deklarasi beberapa instance variables yang akan digunakan.
    // Access Modifier variable di set private.
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Sebuah Constructor default yang bernama Jobseeker.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param id merupakan nilai inputan untuk variable id
     * @param name  merupakan nilai inputan untuk variable name
     * @param email  merupakan nilai inputan untuk variable email
     * @param password merupakan nilai inputan untuk variable password
     * @param joinDate merupakan nilai inputan untuk variable joinDate
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        /* Digunakan sebuah keyword 'this'.Tujuaanya untuk menyatakan atau mereferensikan variable yang ada didalam class itu sendiri, 
         * yaitu variable instance pada class Jobseeker yang ada diatas. 
         * Agar sistem komputer tidak bingung ketika menetapkan nilai variablenya, 
         * karena nama variable instance dan nama parameter dalam konstruktor sama, jadi harus direferensikan/diarahkan.*/
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getId untuk mendapatkan/mengembalikkan data id.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return id jadi mengembalikkan nilai yang ada didalam variable id
     */
    public int getId()
    {
        return id;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getName untuk mendapatkan/mengembalikkan data name.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return name jadi mengembalikkan nilai yang ada didalam variable name
     */
    public String getName()
    {
        return name;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getEmail untuk mendapatkan/mengembalikkan data email.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return email jadi mengembalikkan nilai yang ada didalam variable email
     */
    public String getEmail()
    {
        return email;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getPassword untuk mendapatkan/mengembalikkan data password.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return password jadi mengembalikkan nilai yang ada didalam variable password
     */
    public String getPassword()
    {
        return password;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getJoinDate untuk mendapatkan/mengembalikkan data joinDate.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return joinDate jadi mengembalikkan nilai yang ada didalam variable joinDate
     */
    public String getJoinDate()
    {
        return joinDate;
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setId untuk menetapkan/mengisi nilai dari variable id.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu id.
     * Access modifier pada method berjenis public.
     * 
     * @param id digunakan sebagai inputan untuk variable id
     */
    public void setId(int id)
    {
        this.id = id; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setName untuk menetapkan/mengisi nilai dari variable name.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu name.
     * Access modifier pada method berjenis public.
     * 
     * @param name digunakan sebagai inputan untuk variable name
     */
    public void setName(String Name)
    {
        this.name = name; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setEmail untuk menetapkan/mengisi nilai dari variable email.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu email.
     * Access modifier pada method berjenis public.
     * 
     * @param email digunakan sebagai inputan untuk variable email
     */
    public void setEmail(String email)
    {
        this.email = email; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setPassword untuk menetapkan/mengisi nilai dari variable password.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu password.
     * Access modifier pada method berjenis public.
     * 
     * @param password digunakan sebagai inputan untuk variable password
     */
    public void setPassword(String password)
    {
        this.password = password; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    /**
     * Sebuah method setter (mutator) yang bernama setJoinDate untuk menetapkan/mengisi nilai dari variable joinDate.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu joinDate.
     * Access modifier pada method berjenis public.
     * 
     * @param joinDate digunakan sebagai inputan untuk variable joinDate
     */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    
    /**
     * Sebuah method yang bernama prinData dengan return type void
     * Ada instruksi yang dideclare didalam method tersebut, yaitu menampilkan/mencetak isi data yang ada didalam method getName.
     * Dimana didalam method getName ada instruksi untuk mengembalikkan isi variable name, 
     * jadi data yang akan ditampilkan adalah data yang ada didalam variable name.
     * Access Modifier pada method berjenis public.
     */
    public void printData()
    {
        System.out.println(getName()); //print data
    }
}