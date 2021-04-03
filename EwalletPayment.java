/**
 * Kelas abstract EwalletPayment, dalam kelas ini terdapat beberapa method acessor (get) mutator (set) yang di Override dari Superclassnya.
 * Kelas ini merupakan Subclass dari kelas Invoice. 
 * Sehingga adanya penggunaan keyword 'extends' yang mempunyai arti mewarisi (inheritance) method dari Superclassnya.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * Pada kelas ini juga menerapkan konsep polymorp
 * 
 * @author Helmi Arrazy
 * @version 01-04-2021
 */
public class EwalletPayment extends Invoice
{
    /* Deklarasi instance variables yang digunakan.
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
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        //Keyword Super dibawah digunakan untuk memanggil variable yang ada pada Superclassnya.
        super(id, job, date, jobseeker, invoiceStatus);
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
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus, Bonus bonus){
        //Keyword Super dibawah digunakan untuk memanggil variable yang ada pada Superclassnya.
        super(id, job, date, jobseeker, invoiceStatus);
        this.setBonus(bonus);
    }
    
    @Override
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public Bonus getBonus(){
        return bonus;
    }
    
    public void setBonus(Bonus bonus){
        this.bonus=bonus;
    }
    
    @Override
    public void setTotalFee(){
        if(bonus!=null&&(bonus.getActive()==true)&&(getJob().getFee() > bonus.getMinTotalFee())){
            super.totalFee = getJob().getFee() + bonus.getExtraFee();
        }
        else{
            super.totalFee = getJob().getFee();
        }
    }
    
    @Override
    public void printData(){
        System.out.println("===================== INVOICE =====================");
        System.out.println("ID: " + getId());
        System.out.println("Job: " + getJob().getName());
        System.out.println("Date: " + getDate());
        System.out.println("Job Seeker: " + getJobseeker().getName());
        setTotalFee();
        if (bonus != null && (bonus.getActive() == true) && super.totalFee > bonus.getMinTotalFee()) {
            System.out.println("Referral Code: " + bonus.getReferralCode());
        }
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + getPaymentType());
    }
}