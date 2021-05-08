import java.util.ArrayList;
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author Helmi Arrazy
 * @version 24-04-2021
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId;


    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;

    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        Invoice temp = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                temp = invoice;
                return temp;
            }
        }
        if (temp == null){
            throw new InvoiceNotFoundException(id);
        }
        return temp;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId)
    {
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (Invoice invoice : INVOICE_DATABASE) {
            if (jobseekerId == invoice.getJobseeker().getId()) {
                temp.add(invoice);
            } else {
                return null;
            }
        }
        return temp;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice invoicee : INVOICE_DATABASE) {
            if (invoicee.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice (int id) throws InvoiceNotFoundException
    {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == invoice.getId()) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}
