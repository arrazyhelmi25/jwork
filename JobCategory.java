/**
 * Kelas Enum JobCategory.
 * Kelas Enum  merupakan sekumpulan variable yang didefinisikan menjadi tipe data konstanta (konstan).
 * Kelas ini mendefiniskan data kategori dari pekerjaan.
 *
 * @author Helmi Arrazy
 * @version 25-03-2021
 */
public enum JobCategory
{
    WebDeVeloper("Web Developer"),
    Frontend("Front End"),
    Backend("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist"),
    DataAnalyst("Data Analyst");
    
    //Instance Variable.
    //Diatur dengan access modifier private
    //Tipe data variablenya adalah String
    
    private String jobcategory;
    
    /**
     * Sebuah Constructor class Enum yang bernama JobCategory.
     * Access Modifier pada constrcutor ini berjenis private.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param jobcategory merupakan nilai inputan untuk variable jobcategory
     * 
     */
    private JobCategory(String jobcategory)
    {
        this.jobcategory = jobcategory;
    }
    
    /**
     * Sebuah method yang bernama toString.
     * Method tersebut digunakan untuk merepresentasikan sebuah objek, kedalam tipe String.
     * Return type dari method bertipe String
     * Access Modifier diatur public
     * 
     * Return jobcategory jadi mengembalikkan nilai atau data yang ada didalam variable jobcategory
     * 
     */
    @Override
    public String toString() {
        return jobcategory;
    }
    
}
