/**
 * Kelas Bonus, dalam kelas ini terdapat beberapa method acessor (get) dan mutator (set).
 * Serta adanya sebuah method yang bertipe void untuk melakukan printData nilai dari instance variables.
 * Sesuai dengan nama kelasnya (Bonus), akan digunakan untuk mengatur segala data yang terkait dengan bonus pada suatu pekerjaan.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 *
 * @author Helmi Arrazy
 * @version 01-04-2021
 */
public class Bonus {
    // Deklarasi beberapa instance variables yang akan digunakan.
    // Access Modifier variable di set private.
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;
    
    
    /**
     * Sebuah Constructor default yang bernama Bonus.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param id merupakan nilai inputan untuk variable id
     * @param referralCode merupakan nilai inputan untuk variable referralCode
     * @param extraFee merupakan nilai inputan untuk variable extraFee
     * @param minTotalFee merupakan nilai inputan untuk variable minTotalFee
     * @param active merupakan nilai inputan untuk variable active ('True' or 'False)
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active) {
        /* Digunakan sebuah keyword 'this'.Tujuaanya untuk menyatakan atau mereferensikan variable yang ada didalam class itu sendiri, 
         * yaitu variable instance pada class Job yang ada diatas. 
         * Agar sistem komputer tidak bingung ketika menetapkan nilai variablenya, 
         * karena nama variable instance dan nama parameter dalam konstruktor sama, jadi harus direferensikan/diarahkan.*/
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }

    
    /**
     * Sebuah method getter (accessor) yang bernama getId untuk mendapatkan/mengembalikkan data id.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return id jadi mengembalikkan nilai yang ada didalam variable id
     */
    public int getId() {
        return id;
    }

    
    /**
     * Sebuah method getter (accessor) yang bernama getReferralCode untuk mendapatkan/mengembalikkan data referralCode.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return referralCode jadi mengembalikkan nilai yang ada didalam variable referralCode
     */
    public String getReferralCode() {
        return referralCode;
    }

    
    /**
     * Sebuah method getter (accessor) yang bernama getExtraFee untuk mendapatkan/mengembalikkan data extraFee.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return extraFee jadi mengembalikkan nilai yang ada didalam variable extraFee
     */
    public int getExtraFee() {
        return extraFee;
    }

    
    /**
     * Sebuah method getter (accessor) yang bernama getMinTotalFee untuk mendapatkan/mengembalikkan data minTotalFee.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return minTotalFee jadi mengembalikkan nilai yang ada didalam variable minTotalFee
     */
    public int getMinTotalFee() {
        return minTotalFee;
    }

    
    /**
     * Sebuah method getter (accessor) yang bernama getActive untuk mendapatkan/mengembalikkan data id.
     * Return type dari method ini adalah boolean.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return active jadi mengembalikkan nilai yang ada didalam variable active ('True' or 'False')
     */
    public boolean getActive() {
        return active;
    }

    
    /**
     * Sebuah method setter (mutator) yang bernama setId untuk menetapkan/mengisi nilai dari variable id.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu id.
     * Access modifier pada method berjenis public.
     * 
     * @param id digunakan sebagai inputan untuk variable id
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /**
     * Sebuah method setter (mutator) yang bernama setReferralCode untuk menetapkan/mengisi nilai dari variable referralCode.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu referralCode.
     * Access modifier pada method berjenis public.
     * 
     * @param referralCode digunakan sebagai inputan untuk variable referralCode
     */
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    
    /**
     * Sebuah method setter (mutator) yang bernama setExtraFee untuk menetapkan/mengisi nilai dari variable extraFee.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu extraFee.
     * Access modifier pada method berjenis public.
     * 
     * @param extraFee digunakan sebagai inputan untuk variable extraFee
     */
    public void setExtraFee(int extraFee) {
        this.extraFee = extraFee;
    }

    
    /**
     * Sebuah method setter (mutator) yang bernama setMinTotalFee untuk menetapkan/mengisi nilai dari variable minTotalFee.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu minTotalFee.
     * Access modifier pada method berjenis public.
     * 
     * @param minTotalFee digunakan sebagai inputan untuk variable minTotalFee
     */
    public void setMinTotalFee(int minTotalFee) {
        this.minTotalFee = minTotalFee;
    }

    
    
    /**
     * Sebuah method setter (mutator) yang bernama setActive untuk menetapkan/mengisi nilai dari variable active.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu active.
     * Access modifier pada method berjenis public.
     * 
     * @param active digunakan sebagai inputan untuk variable active ('True' or 'False')
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    
    
    /**
     * Sebuah method yang bernama prinData dengan return type void.
     * Ada instruksi yang dideclare didalam method ini,
     * yaitu instruksi untuk melakukan print isi data instance variable yang dideclare pada kelas ini.
     * Access Modifier pada method berjenis public.
     */
    public void printData() {
        System.out.println("ID: " + getId());
        System.out.println("Referral Code: " + getReferralCode());
        System.out.println("Extra Fee: " + getExtraFee());
        System.out.println("Min Total Fee: " + getMinTotalFee());
        System.out.println("Active: " + getActive());
    }

}