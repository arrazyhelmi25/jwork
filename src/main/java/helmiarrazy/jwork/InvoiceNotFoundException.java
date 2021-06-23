package helmiarrazy.jwork;

/**
 * Kelas InvoiceNotFoundException merupakan sebuah class yang digunakan untuk menangani kesalahan (error) pada invoice, jika invoice yang diinputkan ternyata tidak ada di Database Invoice
 *
 * @author Helmi Arrazy
 * @version 08-05-2021
 */
public class InvoiceNotFoundException extends Exception{
    // Instance Variable
    private int invoice_error;


    /**
     * Constructor default kelas InvoiceNotFoundException.
     *
     * @param invoice_input merupakan nilai inputan untuk variable invoice_input yang berisi id dari invoice
     */
    public InvoiceNotFoundException (int invoice_input)
    {
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }


    /**
     * Method getter (accessor) yang bernama getMessage, berfungsi untuk print informasi dari error handlingnya
     *
     * @return pesan informasi dari error handlingnya
     */
    @Override
    public String getMessage()
    {
        return super.getMessage() + invoice_error + " not found";
    }
}
