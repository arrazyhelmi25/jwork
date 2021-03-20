/**
 * Kelas Invoice, dalam kelas ini terdapat beberapa method acessor (get) dan mutator (set).
 * Serta adanya sebuah method yang bertipe void untuk melakukan printData.
 * Sesuai dengan nama kelasnya (Invoice) yang berarti faktur, sepertinya akan digunakan untuk mengatur segala data terkait suatu pembayaran/tagihan.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * @author Helmi Arrazy
 * @version 18-03-2021
 */
public class Invoice
{
    // Deklarasi beberapa instance variables yang akan digunakan.
    // Access Modifier variable di set private.
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

    /**
     * Sebuah Constructor default yang bernama Invoice.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param id merupakan nilai inputan untuk variable id
     * @param idJob  merupakan nilai inputan untuk variable idJob
     * @param date  merupakan nilai inputan untuk variable date (tanggal)
     * @param totalFee merupakan nilai inputan untuk variable totalFee (total pembayaran)
     * @param jobseeker merupakan nilai inputan untuk variable jobseeker
     */
    
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker)
    {
        /* Digunakan sebuah keyword 'this'.Tujuaanya untuk menyatakan atau mereferensikan variable yang ada didalam class itu sendiri, 
         * yaitu variable instance pada class invoice yang ada diatas. 
         * Agar sistem komputer tidak bingung ketika menetapkan nilai variablenya, 
         * karena nama variable instance dan nama parameter dalam konstruktor sama, jadi harus direferensikan/diarahkan.*/
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }

    /**
     * Sebuah method getter (accessor) yang bernama getId untuk mendapatkan/mengembalikkan data id.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return id jadi mengembalikkan nilai yang ada didalam variable id
     */
    public int getId(){
        return id;
    }
    
    /**
     * Sebuah method getter (accessor) yang bernama getIdJob untuk mendapatkan/mengembalikkan data idJob.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return idJob jadi mengembalikkan nilai yang ada didalam variable idJob
     */
    public int getIdJob(){
        return idJob;
    }
    
    /**
     * Sebuah method getter (accessor) yang bernama getDate untuk mendapatkan/mengembalikkan data tanggal (date). 
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return date jadi mengembalikkan nilai yang ada didalam variable date
     */
    public String getDate(){
        return date;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getTotalFee untuk mendapatkan/mengembalikkan data totalFee.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return totalFee jadi mengembalikkan nilai yang ada didalam variable totalFee
     */
    public int getTotalFee(){
        return totalFee;
    }
    
    /**
     * Sebuah method getter (accessor) yang bernama getJobseeker untuk mendapatkan/mengembalkikan data jobseeker.
     * Return type dari method ini adalah Jobseeker (yang merupakan class atau object).
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return jobseeker jadi mengembalikkan nilai yang ada didalam variable jobseeker
     */
    public Jobseeker getJobseeker(){
        return jobseeker;
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setId untuk menetapkan/mengisi nilai dari variable id.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu id.
     * Access modifier pada method berjenis public.
     * 
     * @param id digunakan sebagai inputan untuk variable id
     */
    public void setId(int id){
        this.id = id;  //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setIdJob untuk menetapkan/mengisi nilai dari variable idJob.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu idJob.
     * Access modifier pada method berjenis public
     * 
     * @param idJob digunakan sebagai inputan untuk variable idJob
     */
    public void setIdJob(int idJob){
        this.idJob = idJob; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    /**
     * Sebuah method setter (mutator) yang bernama setDate untuk menetapkan/mengisi nilai dari variable date.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu date.
     * Access modifier pada method berjenis public.
     * 
     * @param date digunakan sebagai inputan untuk variable date
     */
    public void setDate(String date){
        this.date = date; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setTotalFee untuk menetapkan/mengisi nilai dari variable totalFee.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu totalFee.
     * Access modifier pada method berjenis public.
     * 
     * @param totalFee digunakan sebagai inputan untuk variable totalFee
     */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setJobseeker untuk menetapkan/mengisi nilai dari variable jobseeker.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu jobseeker.
     * Access modifier pada method berjenis public.
     * 
     * @param jobseeker digunakan sebagai inputan untuk variable jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    /**
     * Sebuah method yang bernama prinData dengan return type void.
     * Tidak ada instruksi yang dideclare didalam method tersebut.
     * Sepertinya nanti akan digunakan untuk melakukan print data isi suatu variable.
     * Access Modifier pada method berjenis public.
     */
    public void printData()
    {
        System.out.println(getTotalFee());
    }
}