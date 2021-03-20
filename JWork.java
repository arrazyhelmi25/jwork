
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
        Location location2 = new Location ("DKI Jakarta", "Jakarta", "Rumah");
        Recruiter recruiter1 = new Recruiter(1, "Helmi", "helmi@gmail.com", "1234", location1);
        Recruiter recruiter2 = new Recruiter(123, "Helmi Arrazy", "helmiarrazy25@gmail.com", "085774110665", location2);
        Job job1 = new Job(1, "Arrazy", recruiter1, 111111, "tech");
        Job job2 = new Job(345, "Arrazy", recruiter2, 1000, "tech");
        Jobseeker jobseeker1 = new Jobseeker(1, "Helmi", "helmi@test.com", "123", "December 2021");
        Jobseeker jobseeker2 = new Jobseeker(567, "Jack", "jack@gmail.com", "oop123", "13 December 2021");
        Invoice invoice1 = new Invoice(1, 2, "November", 2, jobseeker1);
        Invoice invoice2 = new Invoice(298, 300, "19 November 2021", 2000, jobseeker2);
        
        System.out.println (recruiter2.getName());
        recruiter2.setName("Harry");
        System.out.println (recruiter2.getName());
        job2.printData();
    }
}
