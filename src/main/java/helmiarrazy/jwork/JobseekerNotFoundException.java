package helmiarrazy.jwork;


/**
 * Kelas JobseekerNotFoundException merupakan sebuah class yang digunakan untuk menangani kesalahan (error) pada jobseeker, jika jobseeker yang diinputkan ternyata tidak ada di Database Jobseeker
 *
 * @author Helmi Arrazy
 * @version 06-05-2021
 */
public class JobseekerNotFoundException extends Exception {
    // Instance Variable
    private int jobseeker_error;


    /**
     * Constructor default kelas JobseekerNotFoundException.
     *
     * @param jobseeker_input merupakan nilai inputan untuk variable jobseeeker_input yang berisi id dari jobseeker
     */
    public JobseekerNotFoundException(int jobseeker_input)
    {
        super("Jobseeker ID: ");
        this.jobseeker_error = jobseeker_input;
    }


    /**
     * Method getter (accessor) yang bernama getMessage, berfungsi untuk print informasi dari error handlingnya
     *
     * @return pesan informasi dari error handlingnya
     */
    @Override
    public String getMessage()
    {
        return super.getMessage() + jobseeker_error + " not found";
    }
}
