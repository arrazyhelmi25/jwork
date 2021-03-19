
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    // instance variables - replace the example below with your own
    public static void main (String [] args) 
    {
        Location location1 = new Location("Jakarta", "Jakarta", "kota");
        Recruiter recruiter1 = new Recruiter(1, "Helmi", "helmi@gmail.com", "1234", location1);
        Job job1 = new Job(1, "Arrazy", recruiter1, 111111, "tech");
        Jobseeker jobseeker1 = new Jobseeker(1, "Helmi", "helmi@test.com", "123", "December 2021");
        Invoice invoice1 = new Invoice(1, 2, "November", 2, jobseeker1);
    }
}
