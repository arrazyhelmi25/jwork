/**
 * Kelas Enum JobCategory, mendefiniskan data kategori dari pekerjaan.
 * Enum type merupakan sebuah tipe data khusus yang membuat suatu variable 
 * menjadi sekumpulan konstanta yang telah ditentukan sebelumnya.
 * Jadi sederhananya Kelas Enum  merupakan sekumpulan variable yang 
 * didefinisikan menjadi tipe data konstanta (konstan). 
 *
 * @author Helmi Arrazy
 * @version 25-03-2021
 */

public enum JobCategory
{
    //Tipe data enum yang sudah diset dengan nilai String konstan
    /** Tipe data enum yang bernama Web Developer dengan nilai konstan sebuah String "Web Developer" 
       */
    WebDeVeloper("Web Developer"),
    /** Tipe data enum yang bernama Frontend dengan nilai konstan sebuah String "Front End" */
    Frontend("Front End"), 
    /** Tipe data enum yang bernama Backend dengan nilai konstan sebuah String "Back End" */
    Backend("Back End"), 
    /** Tipe data enum yang bernama UI dengan nilai konstan sebuah String "UI" */
    UI("UI"), 
    /** Tipe data enum yang bernama UX dengan nilai konstan sebuah String "UX" */
    UX("UX"), 
    /** Tipe data enum yang bernama Devops dengan nilai konstan sebuah String "Devops" */
    Devops("Devops"), 
    /** Tipe data enum yang bernama DataScientist dengan nilai konstan sebuah String "Data Scientist" */
    DataScientist("Data Scientist"), 
    /** Tipe data enum yang bernama DataAnalyst dengan nilai konstan sebuah String "Data Analyst" */
    DataAnalyst("Data Analyst"); 
    
    
    /*Instance Variable.
     *Diatur dengan access modifier private
     *Tipe data variablenya adalah String*/
    private String category;
    
    /**
     * Sebuah Constructor class Enum yang bernama JobCategory.
     * Access Modifier pada constrcutor ini berjenis private.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param category merupakan nilai inputan untuk variable jobcategory
     * 
     */
    private JobCategory(String category)
    {
        this.category = category; //Digunakan lagi keyword 'this', karena nama parameter pada constructor sama dengan nama pada instance variable class.
    }
    
    /**
     * Sebuah method yang bernama toString.
     * Method tersebut digunakan untuk merepresentasikan sebuah objek, kedalam tipe String.
     * Return type dari method bertipe String.
     * Access Modifier diatur public.
     * Jadi ketika data enum yang sudah dideklarasikan diatas dipanggil pada kelas lain untuk di print,
     * maka data yang diprint adalah nilai konstan string yang sudah diset pada masing - masing data enum tersebut.
     * 
     * @return category jadi mengembalikkan nilai atau data yang ada didalam variable jobcategory
     * 
     */
    @Override
    public String toString() {
        return category;
    }
    
}
