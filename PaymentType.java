/**
 * Kelas Enum PaymentType
 * Kelas Enum  merupakan sekumpulan variable yang didefinisikan menjadi tipe data konstanta (konstan).
 * Kelas ini mendefiniskan data tipe pembayaran.
 * 
 * @author Helmi Arrazy
 * @version 25-03-2021
 */
public enum PaymentType
{
    BankPayment("Bank Payment"),
    EwalletPayment("E-Wallet payment");
    
    //Instance Variable.
    //Diatur dengan access modifier private
    //Tipe data variablenya adalah String
    private String paymenttype;
    
    
    /**
     * Sebuah Constructor class Enum yang bernama PaymentType.
     * Access Modifier pada constrcutor ini berjenis private.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param paymenttype merupakan nilai inputan untuk variable paymenttype
     * 
     */
    private PaymentType(String paymenttype)
    {
        this.paymenttype=paymenttype;
    }
    
    /**
     * Sebuah method yang bernama toString.
     * Method tersebut digunakan untuk merepresentasikan sebuah objek, kedalam tipe String.
     * Return type dari method bertipe String
     * Access Modifier diatur public
     * 
     * Return paymenttype jadi mengembalikkan nilai atau data yang ada didalam variable paymenttype
     * 
     */
    @Override
    public String toString() {
        return paymenttype;
    }
}
