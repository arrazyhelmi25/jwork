/**
 * Kelas Enum InvoiceStatus, mendefiniskan data status dari suatu Invoice.
 * Enum type merupakan sebuah tipe data khusus yang membuat suatu variable 
 * menjadi sekumpulan konstanta yang telah ditentukan sebelumnya.
 * Jadi sederhananya Kelas Enum  merupakan sekumpulan variable yang 
 * didefinisikan menjadi tipe data konstanta (konstan).
 * 
 *
 * @author Helmi Arrazy
 * @version 27-03-2021
 */

public enum InvoiceStatus
{
    //Tipe data enum yang sudah diset dengan nilai String konstan
    /** Tipe data enum yang bernama OnGoing dengan nilai konstan sebuah String "Ongoing" */
    OnGoing("Ongoing"), 
    /** Tipe data enum yang bernama Finished dengan nilai konstan sebuah String "FInished" */
    Finished("Finished"), 
    /** Tipe data enum yang bernama Cancelled dengan nilai konstan sebuah String "Cancelled" */
    Cancelled("Cancelled"); 
    
    
    /*Instance Variable.
     *Diatur dengan access modifier private
     *Tipe data variablenya adalah String*/
    private String status;
    
    /**
     * Sebuah Constructor class Enum yang bernama InvoiceStatus.
     * Access Modifier pada constrcutor ini berjenis private.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param status merupakan nilai inputan untuk variable status
     * 
     */
    private InvoiceStatus(String status){
        this.status = status; //Digunakan lagi keyword 'this', karena nama parameter pada constructor sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method yang bernama toString.
     * Method tersebut digunakan untuk merepresentasikan sebuah objek, kedalam tipe String.
     * Return type dari method bertipe String.
     * Access Modifier diatur public.
     * Jadi ketika data enum yang sudah dideklarasikan diatas dipanggil pada kelas lain untuk di print,
     * maka data yang diprint adalah nilai konstan string yang sudah diset pada masing - masing data enum tersebut.
     * 
     * @return status jadi mengembalikkan nilai atau data yang ada didalam variable status
     * 
     */
    @Override
    public String toString() {
        return status;
    }
}

