package helmiarrazy.jwork;

/**
 * Kelas EmailAlreadyExistsException merupakan sebuah class yang digunakan untuk menangani kesalahan (error) jika adanya invoice baru yang statusnya OnGoing, sementara invoice dengan status tersebut sudah ada di dalam Database Invoice
 *
 * @author Helmi Arrazy
 * @version 08-05-2021
 */
public class OngoingInvoiceAlreadyExistsException extends Exception {
    // Instance Variable
    private Invoice invoice_error;


    /**
     * Constructor default kelas OngoingInvoiceAlreadyExistsException.
     *
     * @param invoice_input merupakan nilai inputan untuk variable invoice_input yang berisi status dari invoice baru yang terdeteksi mempunyai status OnGoing
     */
    public OngoingInvoiceAlreadyExistsException (Invoice invoice_input)
    {
        super("Ongoing Invoice: ");
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
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists.";
    }
}
