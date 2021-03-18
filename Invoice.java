/**
 * Kelas Invoice
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
     * Sebuah method getter untuk mendapatkan data id terkait dengan sebuah invoice
     * @return method ini mengembalikan id
     */
    public int getId(){
        return this.id;
    }
    
    /**
     * Sebuah method getter untuk mendapatkan data idJob
     * @return method ini mengembalikan idJob
     */
    public int getIdJob(){
        return this.idJob;
    }
    
    /**
     * Sebuah method getter untuk mendapatkan data tanggal (date)
     * @return method ini mengembalikan date
     */
    public String getDate(){
        return this.date;
    }
    
    
    /**
     * Sebuah method getter untuk mendapatkan data total biaya
     * @return method ini mengembalikan totalFee
     */
    public int getTotalFee(){
        return this.totalFee;
    }
    
    /**
     * Sebuah method getter untuk mendapatkan data job seeker
     * @return method ini mengembalikan jobseeker
     */
    public Jobseeker getJobseeker(){
        return this.jobseeker;
    }
    
    
    /**
     * Sebuah method setter untuk menetapkan data id
     * 
     */
    public void setId(int id){
        this.id = id;
    }
    
    
    /**
     * Sebuah method setter untuk menetapkan data idJobs
     * 
     */
    public void setIdJobs(int idJobs){
        this.idJob = idJob;
    }
    
    /**
     * Sebuah method setter untuk menetapkan data date
     * 
     */
    public void setDate(String date){
        this.date = date;
    }
    
    
    /**
     * Sebuah method setter untuk menetapkan data totalFee
     * 
     */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
    
    
    /**
     * Sebuah method setter untuk menetapkan data jobseeker
     * 
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }
    
    /**
     * Sebuah method void dari printdata
     * 
     */
    public void printData(){
    }
}