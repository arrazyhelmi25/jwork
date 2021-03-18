
/**
 * Write a description of class Job here.
 *
 * @author Helmi Arrazy
 * @version 18-03-2021
 */
public class Job
{
    // instance variables
    private int id;
    private String name;
    private int fee;
    private String category;
    private Recruiter recruiter;
    
    /**
     * Constructor untuk objects dari class Job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String category)
    {
        this.id = id;
        this.recruiter = recruiter;
        this.name = name;
        this.fee = fee;
        this.category = category;
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public int getFee()
    {
        return this.fee;
    }
    public String getCategory()
    {
        return this.category;
    }
    public Recruiter getRecruiter()
    {
        return this.recruiter;
    }
    public void setId(int id)
    {
       this.id = id;
    }
    public void setName(String name)
    {
       this.name = name;
    }
    public void setRecruiter(Recruiter recruiter)
    {
       this.recruiter = recruiter;
    }
    public void setFee(int fee)
    {
        this.fee = fee;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public void printData()
    {
        
    }
    
}
