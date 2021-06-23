package helmiarrazy.jwork;
import java.util.ArrayList;

/**
 * Kelas DatabaseInvoice, digunakan untuk mengatur segala data terkait suatu invoice, atau database invoice dari suatu pekerjaan.
 *
 * @author Helmi Arrazy
 * @version 24-04-2021
 */
public class DatabaseInvoice {
    // Instance Variables
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId;


    /**
     * Method getter (accessor) yang bernama getInvoiceDatabase, berfungsi untuk mengambil isi list data INVOICE_DATABASE;
     *
     * @return INVOICE_DATABASE mengembalikkan semua isi data INVOICE_DATABASE
     */
    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }


    /**
     * Method getter (accessor) yang bernama getLastId, berfungsi untuk mendapatkan Id dari Invoice terakhir
     *
     * @return lastId mengembalikkan isi variable lastId
     */
    public static int getLastId() {
        return lastId;
    }


    /**
     * Method getter (accessor) yang bernama getInvoiceById, berfungsi untuk mendapatkan data Invoice berdasarkan Id nya
     *
     * @param id yaitu menggunakan inputan id dari invoice untuk mendapaatkan data invoice yang sesuai
     * @return temp sebagai objek dari Invoice
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException {
        Invoice temp = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                temp = invoice;
            } else {
                temp = null;
            }
        }
        if (temp == null){
            throw new InvoiceNotFoundException(id);
        }

        return temp;
    }


    /**
     * Method getter (accessor) yang bernama getInvoiceByJobseeker, berfungsi untuk mendapatkan data Invoice berdasarkan Id Jobseeker
     *
     * @param jobseekerId yaitu menggunakan inputan id jobseeker untuk menampilkan invoice yang sesuai
     * @return temp sebagai objek dari data list Invoice
     */
    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId) {
        ArrayList<Invoice> temp = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (jobseekerId == invoice.getJobseeker().getId()) {
                if (temp == null) {
                    temp = new ArrayList<Invoice>();
                }
                temp.add(invoice);
            }
        }
        return temp;
    }


    /**
     * Method addInvoice, berfungsi untuk menambahkan data Invoice baru kedalam Database Invoice
     *
     * @param invoice sebagai inputan data invoice baru yang akan ditambahkan ke Database Invoice
     * @return booelan untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice element : INVOICE_DATABASE) {
            if (element.getInvoiceStatus() == InvoiceStatus.OnGoing && element.getId() == invoice.getId()) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }


    /**
     * Method changeInvoiceStatus, berfungsi untuk mengubah status dari invoice yang ada di dalam Database Invoice
     *
     * @param id sebagai inputan id untuk invoice yang akan diubah statusnya
     * @param invoiceStatus yaitu jenis status baru yang akan ditetapkan kepada status invoice yang akan diubah
     * @return booelan untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {
        boolean temp = true;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId() && invoice.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                invoice.setInvoiceStatus(invoiceStatus);
                temp = true;
            } else {
                temp = false;
            }
        }
        return temp;
    }


    /**
     * Method removeInvoice, berfungsi untuk menghapus invoice yang ada pada Database Invoice
     *
     * @param id sebagai inputan id untuk invoice yang akan dihapus
     * @return boolean untuk menunjukkan keberhasilan dari method ini
     */
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException {
        boolean temp = false;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                INVOICE_DATABASE.remove(invoice);
                temp = true;
            } else {
                temp = false;
            }
        }
        if (!temp){
            throw new InvoiceNotFoundException(id);
        }

        return temp;
    }

}