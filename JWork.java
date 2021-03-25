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
        Jobseeker jobseeker1 = new Jobseeker(1, "Helmi", "helmi@test.com", "123", "December 2021");
        Jobseeker jobseeker2 = new Jobseeker(567, "Jack", "jack@gmail.com", "oop123", "13 December 2021");
        Invoice invoice1 = new Invoice(1, 2, "November", 2, jobseeker1);
        Invoice invoice2 = new Invoice(298, 300, "19 November 2021", 2000, jobseeker2);
        
        
        
        
        JobCategory category1 = JobCategory.WebDeVeloper;
        JobCategory category2 = JobCategory.Frontend;
        JobCategory category3 = JobCategory.Backend;
        JobCategory category4 = JobCategory.UI;
        JobCategory category5 = JobCategory.UX;
        JobCategory category6 = JobCategory.Devops;
        JobCategory category7 = JobCategory.DataScientist;
        JobCategory category8 = JobCategory.DataAnalyst;
        System.out.println(category1);
        System.out.println(category2);
        System.out.println(category3);
        System.out.println(category4);
        System.out.println(category5);
        System.out.println(category6);
        System.out.println(category7);
        System.out.println(category8);
        
        Job job1 = new Job (1, "Senior Designer", recruiter2, 1000, category7);
        
        
        PaymentType type1 = PaymentType.BankPayment;
        PaymentType type2 = PaymentType.EwalletPayment;
        System.out.println(type1);
        System.out.println(type2);
        
        System.out.println("\n");
        job1.printData();
        
    
    }
}
