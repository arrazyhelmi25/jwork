package helmiarrazy.jwork;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 * Kelas BankPayment, dalam kelas ini terdapat beberapa method acessor (get) mutator (set) yang di Override dari Superclassnya.
 * Kelas ini digunakan untuk mengatur data terkait pembayaran.
 * Kelas ini merupakan Subclass dari kelas Invoice. 
 * Sehingga adanya penggunaan keyword 'extends' yang mempunyai arti mewarisi (inheritance) method dari Superclassnya.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * @author Helmi Arrazy
 * @version 04-03-2021
 */
public class BankPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Constructor untuk object dari class BankPayment
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        super(id, jobs, jobseeker);
    }

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee) {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee;
    }

    /**
     * method getPaymentType, berfungsi sebagai getter untuk mengambil value
     * PAYMENT_TYPE.BankPayment
     *
     * @return PAYMENT_TYPE.BankPayment
     */
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    /**
     * method getAdminFee, berfungsi sebagai getter untuk mengambil value adminFee
     *
     * @return adminFee
     */
    public int getAdminFee() {
        return adminFee;
    }

    /**
     * method setAdminFee, berfungsi sebagai setter untuk mengisi value adminFee
     *
     * @param adminFee
     */
    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }

    /**
     * method setTotalFee, berfungsi sebagai setter untuk mengisi value totalFee
     *
     */
    public void setTotalFee() {
        ArrayList<Job> jobs = getJobs();

        for (Job job : jobs) {
            int fee = job.getFee();

            if (adminFee != 0) {
                super.totalFee += fee - adminFee;
            } else {
                super.totalFee += fee;
            }
        }
    }

    /**
     * method toString, berfungsi untuk mencetak instance variable ke layar
     */
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        String res = "";
        for (Job job : getJobs()) {
            if (adminFee != 0) {
                res = res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date
                        + "\nJob Seeker = " + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = "
                        + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            } else {
                res = res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date
                        + "\nJob Seeker = " + getJobseeker().getName() + "\nTotal Fee = " + getTotalFee()
                        + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            }
        }
        return res;
    }
}