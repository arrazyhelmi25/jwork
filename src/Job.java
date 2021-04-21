/**
 * Kelas Job, dalam kelas ini terdapat beberapa method acessor (get) dan mutator (set).
 * Serta adanya sebuah method yang bertipe void untuk melakukan printData nilai dari instance variables.
 * Sesuai dengan nama kelasnya (Job) yang berarti pekerjaan, sepertinya akan digunakan untuk mengatur segala data yang terkait dengan suatu pekerjaan.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * @author Helmi Arrazy
 * @version 18-03-2021
 */
public class Job
{
    // Deklarasi beberapa instance variables yang akan digunakan.
    // Access Modifier variable di set private.
    private int id;
    private String name;
    private Recruiter recruiter;
    private int fee;
    private JobCategory category;
    
    /**
     * Sebuah Constructor default yang bernama Job.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param id merupakan nilai inputan untuk variable id
     * @param name  merupakan nilai inputan untuk variable name
     * @param fee  merupakan nilai inputan untuk variable fee
     * @param category merupakan nilai inputan untuk variable category
     * @param recruiter merupakan nilai inputan untuk variable recruiter
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category)
    {
        /* Digunakan sebuah keyword 'this'.Tujuaanya untuk menyatakan atau mereferensikan variable yang ada didalam class itu sendiri, 
         * yaitu variable instance pada class Job yang ada diatas. 
         * Agar sistem komputer tidak bingung ketika menetapkan nilai variablenya, 
         * karena nama variable instance dan nama parameter dalam konstruktor sama, jadi harus direferensikan/diarahkan.*/
        this.id = id;
        this.recruiter = recruiter;
        this.name = name;
        this.fee = fee;
        this.category = category;
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
     * Sebuah method getter (accessor) yang bernama getFee untuk mendapatkan/mengembalikkan data fee.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return fee jadi mengembalikkan nilai yang ada didalam variable fee
     */
    public int getFee()
    {
        return fee;
    }
    
    /**
     * Sebuah method getter (accessor) yang bernama JobCategory untuk mendapatkan/mengembalikkan data category.
     * Return type dari method ini adalah JobCategory (yang merupakan kelas).
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return category jadi mengembalikkan nilai yang ada didalam variable category
     */
    public JobCategory getCategory()
    {
        return category;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getRecruiter untuk mendapatkan/mengembalikkan data recruiter.
     * Return type dari method ini adalah Recruiter (yang merupakan kelas).
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return recruiter jadi mengembalikkan nilai yang ada didalam variable recruiter
     */
    public Recruiter getRecruiter()
    {
        return recruiter;
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
    public void setName(String name)
    {
       this.name = name; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setRecruiter untuk menetapkan/mengisi nilai dari variable recruiter.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu recruiter.
     * Access modifier pada method berjenis public.
     * 
     * @param recruiter digunakan sebagai inputan untuk variable recruiter
     */
    public void setRecruiter(Recruiter recruiter)
    {
       this.recruiter = recruiter; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setFee untuk menetapkan/mengisi nilai dari variable fee.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu fee.
     * Access modifier pada method berjenis public.
     * 
     * @param fee digunakan sebagai inputan untuk variable fee
     */
    public void setFee(int fee)
    {
        this.fee = fee; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setCategory untuk menetapkan/mengisi nilai dari variable category.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu category.
     * Access modifier pada method berjenis public.
     * 
     * @param category digunakan sebagai inputan untuk variable category
     */
    public void setCategory(JobCategory category)
    {
        this.category = category; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    @Override
    public String toString(){
        return "Id = "+getId()+"\nName = "+getName()+"\nRecruiter = "+getRecruiter().getName()+"\nCity = "+getRecruiter().getLocation().getCity()+"\nFee = "+getFee()+"\nCategory = "+getCategory();
    }
    
    
}
