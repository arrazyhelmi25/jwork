/**
 * Write a description of class Invoice here.
 *
 * @author Helmi Arrazy
 * @version 18-03-2021
 */
public class Invoice
{
    // instance variables
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

    /**
     * Constructor untuk objects dari class Invoice
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker 
    jobseeker)
    {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId(){
        return this.id;
    }
    
    public int getIdJob(){
        return this.idJob;
    }
    
    public String getDate(){
        return this.date;
    }
    
    public int getTotalFee(){
        return this.totalFee;
    }
    
    public Jobseeker getJobseeker(){
        return this.jobseeker;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setIdJobs(int idJobs){
        this.idJob = idJob;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
    
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }
    
    public void printData(){
    }
}