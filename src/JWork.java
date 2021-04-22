import java.util.GregorianCalendar;
import java.util.ArrayList;

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
        /*Location location1 = new Location("Jakarta", "Jakarta", "kota");
        Location location2 = new Location ("DKI Jakarta", "Jakarta", "Rumah");
        Recruiter recruiter1 = new Recruiter(1, "Helmi", "helmi@gmail.com", "1234", location1);
        Recruiter recruiter2 = new Recruiter(123, "Helmi Arrazy", "helmiarrazy25@gmail.com", "085774110665", location2);
        Jobseeker jobseeker1 = new Jobseeker(1, "Helmi", "helmi@test.com", "123", "December 2021");
       /Jobseeker jobseeker2 = new Jobseeker(567, "Jack", "jack@gmail.com", "oop123", "13 December 2021");
        
    
        
        
        
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

        Job job1 = new Job (1, "Senior", recruiter2, 10000, category7);
        Job job2 = new Job (2, "Junior", recruiter2, 1000, category6);
        Bonus bonus1 = new Bonus (1, "ABCD", 10000, 10000000, true);
        Bonus bonus2 = new Bonus (1, "DEFG", 1000000, 1, true);*/
        
        //EwalletPayment payment1 = new EwalletPayment(1, job1, "3 December 2021", jobseeker2, InvoiceStatus.OnGoing);
        
        //EwalletPayment payment3 = new EwalletPayment(3, job1, "3 December 2021", jobseeker2, InvoiceStatus.OnGoing, bonus2);
        
        
        //BankPayment bankpayment1 = new BankPayment (1, job1, "20 Maret 2020", jobseeker2, InvoiceStatus.Finished);
        
        
        
        
        /*PaymentType type1 = PaymentType.BankPayment;
        PaymentType type2 = PaymentType.EwalletPayment;
        System.out.println(type1);
        System.out.println(type2);
        
        InvoiceStatus status1 = InvoiceStatus.OnGoing;
        InvoiceStatus status2 = InvoiceStatus.Finished;
        InvoiceStatus status3 = InvoiceStatus.Cancelled;
        System.out.println(status1);
        System.out.println(status2);
        System.out.println(status3);*/
        
        //Invoice invoice2 = new Invoice(job1.getId(), 300, "19 November 2021", job1.getFee(), jobseeker2, type1, status2);
        
        //System.out.println("\n");
        //job1.printData();
        
        
        //System.out.println("\n");
        //invoice2.printData();
        
        //System.out.println("\n");
        //payment1.printData();
        //System.out.println("\n");
        //payment2.printData();
        //System.out.println("\n");
        //payment3.printData();
        //System.out.println("\n");
        //System.out.println("\n");
        //bankpayment1.printData();
        //bankpayment2.printData();
        
        /*Jobseeker jobseeker1 = new Jobseeker(1, "Helmi", "..helmi.arrazy@ui.ac.id", "helmi", new GregorianCalendar(2000, 10, 25));
        Jobseeker jobseeker2 = new Jobseeker(2, "Helmi", "helmi.arrazy@ui.ac.id", "HelmiArrazy1", 2021, 04, 8);
        Jobseeker jobseeker3 = new Jobseeker(3, "Helmi", "helmi.arrazy@ui.ac.id", "HelmiArrazy1");
        System.out.println("\n");
        System.out.println(jobseeker1);
        System.out.println("\n");
        System.out.println(jobseeker2);
        System.out.println("\n");
        System.out.println(jobseeker3);
        jobseeker1.setEmail("helmi@ui.ac.id");
        jobseeker1.setPassword("Arrazy1"); 
        System.out.println("\n");
        System.out.println(jobseeker1);
        System.out.println("\n");
        EwalletPayment payment2 = new EwalletPayment(1, job1, jobseeker2, InvoiceStatus.OnGoing, bonus2);
        BankPayment bankpayment2 = new BankPayment (1, job1, jobseeker2, InvoiceStatus.Finished,1000);
        
        payment2.setTotalFee();
        bankpayment2.setTotalFee();
        
        System.out.println("\n");
        System.out.println(payment2);
        System.out.println("\n");
        System.out.println(bankpayment2);*/
        //JobCategory category2 = JobCategory.Frontend;
        //JobCategory category3 = JobCategory.Backend;





                Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Gambir");
                DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Helmi", "helmiarrazy25@gmail.com", "123654", location1));
                DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Helmi", "helmi.arrazy@ui.ac.id", "HelmiArrazy123", 2021, 02, 22));
                DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Helmi", "helmi.arrazy@ui.ac.id", "HelmiArrazy123", 2021, 03 ,22));
                DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1 , "Hary", "Hary@ui.ac.id", "HarryTest12345", 2021, 04, 22));
                System.out.println("\n=====================Jobseeker Database====================\n");
                System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
                DatabaseJob.addJob(new Job(1, "FrontEnd Engineer TokoA", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.Frontend));
                DatabaseJob.addJob(new Job(1, "FrontEnd", DatabaseRecruiter.getRecruiterById(1), 20000, JobCategory.Frontend));
                DatabaseJob.addJob(new Job(1, "Data Scientist TokoC", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.DataScientist));
                System.out.println("\n=====================Job Database By Category====================\n");
                System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));
}}
