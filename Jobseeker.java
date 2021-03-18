/**
 * Write a description of class Jobseeker here.
 *
 * @author Helmi Arrazy
 * @version 18-03-2021
 */
public class Jobseeker
{
    // instance variables
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor untuk objects dari class Jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, 
    String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
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
    public String getEmail()
    {
        return this.email;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getJoinDate()
    {
        return this.joinDate;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String Name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
    public void printData()
    {
        System.out.println(getName());
    }
}