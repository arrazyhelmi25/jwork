import java.text.SimpleDateFormat;
/**
 * Kelas EwalletPayment, dalam kelas ini terdapat beberapa method acessor (get) mutator (set) yang di Override dari Superclassnya.
 * Kelas ini digunakan untuk mengatur data terkait pembayaran.
 * Kelas ini merupakan Subclass dari kelas Invoice. 
 * Sehingga adanya penggunaan keyword 'extends' yang mempunyai arti mewarisi (inheritance) method dari Superclassnya.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * @author Helmi Arrazy
 * @version 01-04-2021
 */
public class EwalletPayment extends Invoice
{
    /* 
     * Deklarasi instance variables yang digunakan.
     * Access Modifier variable di set private.
     * variable static mempunyai arti variable yang dimiliki kelas dan diinisialisasi hanya sekali pada awal eksekusi
     * Keyword final digunakan untuk membuat variable tersebut mempunyai nilai konstan yang sudah ditentukan, dan tidak dapat ubah lagi,
     * atau nilai variable tersebut tidak bisa ditetapkan ulang.
     * 
     */
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;
    
    /**
     * Sebuah Constructor yang bernama EwalletPayment.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang mengikuti parameter constructor pada Superclassnya.
     * 
     * @param id merupakan nilai inputan untuk variable id
     * @param job  merupakan nilai inputan untuk variable job
     * @param date  merupakan nilai inputan untuk variable date (tanggal)
     * @param jobseeker merupakan nilai inputan untuk variable jobseeker
     * @param invoiceStatus merupakan nilai inputan untuk variable status
     */
    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        //Keyword Super dibawah digunakan untuk memanggil variable yang ada pada Superclassnya.
        super(id, job, jobseeker, invoiceStatus);
    }
    
    
    /**
     * Sebuah Constructor yang bernama EwalletPayment.
     * Constructor ini menerapakan konsep Polymorphism, karena mempunyai nama yang sama seperti constructor sebelumnya, tetapi mempunyai parameter yang berbeda.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param id merupakan nilai inputan untuk variable id
     * @param job  merupakan nilai inputan untuk variable job
     * @param date  merupakan nilai inputan untuk variable date (tanggal)
     * @param jobseeker merupakan nilai inputan untuk variable jobseeker
     * @param invoiceStatus merupakan nilai inputan untuk variable status
     * @param bonus merupakan nilai inputan untuk variable bonus
     */
    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus, Bonus bonus){
        //Keyword Super dibawah digunakan untuk memanggil variable yang ada pada Superclassnya.
        super(id, job, jobseeker, invoiceStatus);
        //Digunakan keyword 'this', karena nama parameter pada constructor sama dengan nama pada instance.
        this.bonus = bonus;
    }
    
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getPaymentType untuk mendapatkan/mengembalikkan data PAYMENT_TYPE.
     * Return type dari method ini adalah PaymentType (yang merupakan kelas).
     * Digunakan keyword Override karena method ini mempunyai nama dan struktur yang sama percis dengan yang ada di superclasnya,
     * sehingga untuk membuat ulang method ini diperlukan keyword tersebut.
     * Intinya keyword override ini kita dapat membuat method dengan nama atau struktur yang sama percis di superclass nya,
     * namun mempunyai instruksi di dalamnya yang berbeda, sehingga program menjadi tidak bingung ketika ingin dieksekusi.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return PAYMENT_TYPE jadi mengembalikkan nilai yang ada didalam variable PAYMENT_TYPE
     */
    @Override
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getBonus untuk mendapatkan/mengembalikkan data bonus.
     * Return type dari method ini adalah Bonus (yang merupakan kelas).
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return bonus jadi mengembalikkan nilai yang ada didalam variable bonus
     */
    public Bonus getBonus(){
        return bonus;
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setBonus untuk menetapkan/mengisi nilai dari variable bonus.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu bonus.
     * Access modifier pada method berjenis public.
     * 
     * @param bonus digunakan sebagai inputan untuk variable bonus
     */
    public void setBonus(Bonus bonus){
        this.bonus=bonus;
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setTotalFee untuk menetapkan/mengisi nilai dari variable bonus.
     * Return type dari method ini adalah void.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * Digunakan keyword Override karena method ini mempunyai nama dan struktur yang sama percis dengan yang ada di superclasnya,
     * sehingga untuk membuat ulang method ini diperlukan keyword tersebut.
     * Selalin itu method ini pada superclassnya dibuat dalam bentuk abstrak, sehingga pada subclass ini dibuat dalam bentuk konkritnya,
     * yaitu maksudnya ada implementasi instruksi didalam method.
     * 
     */
    @Override
    public void setTotalFee(){
        /* Jika isi variable bonus tidak kosong, isi variable active pada kelas Bonus diset dengan true, dan isi variable fee pada kelas Job lebih besar
         * dibandingkan isi variable minTotalFee yang ada di kelas Bonus, maka isi variable totalFee pada superclass akan di set dengan pertambahan
         * variable fee pada kelas Job dan variable extraFee pada kelas Bonus.
         */
        if(bonus!=null&&(getBonus().getActive()==true)&&(getJob().getFee() > getBonus().getMinTotalFee())){
            super.totalFee = getJob().getFee() + getBonus().getExtraFee();
        }
        
        /* Jika kondisinya sebaliknya seperti yang sudah disebutkan diatas, maka variable totalFee pada superclass akan di set dengan nilai yang sama
         * yang ada didalam variable fee pada kelas Job.
         */
        else{
            super.totalFee = getJob().getFee();
        }
    }
    
    
    /**
     * Sebuah method yang bernama prinData dengan return type void.
     * Ada instruksi yang dideclare didalam method ini,
     * yaitu instruksi untuk melakukan print isi data instance variable yang dideclare pada kelas ini atau kelas lain.
     * Method ini dipanggil melalui method main pada kelas JWork.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * Digunakan keyword Override karena method ini mempunyai nama dan struktur yang sama percis dengan yang ada di superclasnya,
     * sehingga untuk membuat ulang method ini diperlukan keyword tersebut.
     * Selain itu method ini pada superclassnya dibuat dalam bentuk abstrak, sehingga pada subclass ini dibuat dalam bentuk konkritnya,
     * yaitu maksudnya ada implementasi instruksi didalam method.
     * 
     */
   @Override
    public String toString()
    {
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = formattedDate.format(getDate().getTime());
        if ((bonus != null) && (bonus.getActive() == true) && (getJob().getFee() > bonus.getMinTotalFee()))
        {
            return ("Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                + getJobseeker().getName() + "Referral Code = " + bonus.getReferralCode() + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }else
        {
            return ("Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                + getJobseeker().getName()+ "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }
    }
}