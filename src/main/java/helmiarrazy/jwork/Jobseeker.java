package helmiarrazy.jwork;

//Melakukan import beberapa utilitas, method, atau kelas yang dibutuhkan.
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Kelas Jobseeker, dalam kelas ini terdapat beberapa method acessor (get) dan mutator (set).
 * Serta adanya sebuah method yang bertipe void untuk melakukan printData.
 * Sesuai dengan nama kelasnya (Jobseeker) yang berarti pencari kerja, sepertinya akan digunakan untuk mengatur segala data yang terkait dengan detail orang pencari kerja.
 * Didalam kelas ini juga ada beberapa access modifier (public dan private) yang digunakan pada variable, method, atau constructor.
 * Access Modifier bersifat public berarti dapat diakses oleh kelas dari mana saja termasuk subclass.
 * Access Modifier bersifat private berarti hanya dapat diakses didalam kelas itu sendiri saja.
 * 
 * @author Helmi Arrazy
 * @version 18-03-2021
 */
public class Jobseeker
{
    // Deklarasi beberapa instance variables yang akan digunakan.
    // Access Modifier variable di set private.
    private int id;
    private String name;
    private String email;
    private String password;
    public Calendar joinDate;

    /**
     * Sebuah Constructor yang bernama Jobseeker.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param id merupakan nilai inputan untuk variable id
     * @param name  merupakan nilai inputan untuk variable name
     * @param email  merupakan nilai inputan untuk variable email
     * @param password merupakan nilai inputan untuk variable password
     * @param joinDate merupakan nilai inputan untuk variable joinDate
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        /* Digunakan sebuah keyword 'this'.Tujuaanya untuk menyatakan atau mereferensikan variable yang ada didalam class itu sendiri, 
         * yaitu variable instance pada class Jobseeker yang ada diatas. 
         * Agar sistem komputer tidak bingung ketika menetapkan nilai variablenya, 
         * karena nama variable instance dan nama parameter dalam konstruktor sama, jadi harus direferensikan/diarahkan.*/
        this.id = id;
        this.name = name;
        
        /* Memanggil method setEmail, untuk dicocokan terlebih dahulu apakah email yang diinputkan user sudah sesuai atau tidak 
         * dengan kriteria format email (regex) yang ditentukan, jika sudah maka baru akan disimpan ke variable email.
         */
        setEmail(email); 
        
        /* Memanggil method setPassword, untuk dicocokan terlebih dahulu apakah password yang diinputkan user sudah sesuai atau tidak 
         * dengan kriteria password (regex) yang ditentukan, jika sudah maka baru akan disimpan ke variable password.
         */
        setPassword(password);
        
        this.joinDate = joinDate;
    }
    
    
    /**
     * Sebuah Constructor yang bernama Jobseeker.
     * Constructor ini menerapkan konsep polymorphism, karena mempunyai nama yang sama dengan constructor lain, namun mempunyai parameter yang berbeda.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param id merupakan nilai inputan untuk variable id
     * @param name  merupakan nilai inputan untuk variable name
     * @param email  merupakan nilai inputan untuk variable email
     * @param password merupakan nilai inputan untuk variable password
     * @param year merupakan nilai inputan untuk variable year
     * @param month merupakan nilai inputan untuk variable month
     * @param dayOfMonth merupakan nilai inputan untuk variable dayOfMonth
     * 
     */
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        /* Digunakan sebuah keyword 'this'.Tujuaanya untuk menyatakan atau mereferensikan variable yang ada didalam class itu sendiri, 
         * yaitu variable instance pada class Jobseeker yang ada diatas. 
         * Agar sistem komputer tidak bingung ketika menetapkan nilai variablenya, 
         * karena nama variable instance dan nama parameter dalam konstruktor sama, jadi harus direferensikan/diarahkan.*/
        this.id = id;
        this.name = name;
        
        /* Memanggil method setEmail, untuk dicocokan terlebih dahulu apakah email yang diinputkan user sudah sesuai atau tidak 
         * dengan kriteria format email (regex) yang ditentukan, jika sudah maka baru akan disimpan ke variable email.
         */
        setEmail(email);
        
        /* Memanggil method setPassword, untuk dicocokan terlebih dahulu apakah password yang diinputkan user sudah sesuai atau tidak 
         * dengan kriteria password (regex) yang ditentukan, jika sudah maka baru akan disimpan ke variable password.
         */
        setPassword(password);
        
        //Menyimpan hasil format tanggal Gregorian Calendar kedalam variable joinDate.
        this.joinDate = new GregorianCalendar(year, month - 1, dayOfMonth);
    }
    
    
    
    /**
     * Sebuah Constructor yang bernama Jobseeker.
     * Constructor ini menerapkan konsep polymorphism, karena mempunyai nama yang sama dengan constructor lain, namun mempunyai parameter yang berbeda.
     * Access Modifier pada constrcutor ini berjenis public.
     * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
     * Ada beberapa parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
     * 
     * @param id merupakan nilai inputan untuk variable id
     * @param name  merupakan nilai inputan untuk variable name
     * @param email  merupakan nilai inputan untuk variable email
     * @param password merupakan nilai inputan untuk variable password
     * 
     */
    public Jobseeker(int id, String name, String email, String password)
    {
        /* Digunakan sebuah keyword 'this'.Tujuaanya untuk menyatakan atau mereferensikan variable yang ada didalam class itu sendiri, 
         * yaitu variable instance pada class Jobseeker yang ada diatas. 
         * Agar sistem komputer tidak bingung ketika menetapkan nilai variablenya, 
         * karena nama variable instance dan nama parameter dalam konstruktor sama, jadi harus direferensikan/diarahkan.*/
        this.id = id;
        this.name = name;
        
        /* Memanggil method setEmail, untuk dicocokan terlebih dahulu apakah email yang diinputkan user sudah sesuai atau tidak 
         * dengan kriteria format email (regex) yang ditentukan, jika sudah maka baru akan disimpan ke variable email.
         */
        setEmail(email);
        
        /* Memanggil method setPassword, untuk dicocokan terlebih dahulu apakah password yang diinputkan user sudah sesuai atau tidak 
         * dengan kriteria password (regex) yang ditentukan, jika sudah maka baru akan disimpan ke variable password.
         */
        setPassword(password);

        this.joinDate = Calendar.getInstance();
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getId untuk mendapatkan/mengembalikkan data id.
     * Return type dari method ini adalah int.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return id jadi mengembalikkan nilai yang ada didalam variable id
     */
    public int getId()
    {
        return id;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getName untuk mendapatkan/mengembalikkan data name.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return name jadi mengembalikkan nilai yang ada didalam variable name
     */
    public String getName()
    {
        return name;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getEmail untuk mendapatkan/mengembalikkan data email.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return email jadi mengembalikkan nilai yang ada didalam variable email
     */
    public String getEmail()
    {
        return email;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getPassword untuk mendapatkan/mengembalikkan data password.
     * Return type dari method ini adalah String.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return password jadi mengembalikkan nilai yang ada didalam variable password
     */
    public String getPassword()
    {
        return password;
    }
    
    
    /**
     * Sebuah method getter (accessor) yang bernama getJoinDate untuk mendapatkan/mengembalikkan data joinDate.
     * Return type dari method ini adalah Calendar.
     * Tidak ada parameter yang digunakan pada method ini.
     * Access modifier pada method berjenis public.
     * 
     * @return joinDate jadi mengembalikkan nilai yang ada didalam variable joinDate
     */
    public Calendar getJoinDate()
    {
        return joinDate;
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setId untuk menetapkan/mengisi nilai dari variable id.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu id.
     * Access modifier pada method berjenis public.
     * 
     * @param id digunakan sebagai inputan untuk variable id
     */
    public void setId(int id)
    {
        this.id = id; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setName untuk menetapkan/mengisi nilai dari variable name.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu name.
     * Access modifier pada method berjenis public.
     * 
     * @param name digunakan sebagai inputan untuk variable name
     */
    public void setName(String Name)
    {
        this.name = name; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setEmail untuk menetapkan/mengisi nilai dari variable email.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu email.
     * Access modifier pada method berjenis public.
     * 
     * @param email digunakan sebagai inputan untuk variable email
     */
    public void setEmail(String email){
        String regex = "[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)"; //Membuat regrex sebagai kriteria format email yang harus dipenuhi.
        Pattern pattern = Pattern.compile(regex); //Mengcompile regex
        Matcher matcher = pattern.matcher(email); //Melakukan pencocokan antara email yang diinputkan oleh user dengan regex (kriteria format email)
        if(matcher.matches()) //Jika cocok atau semua kriteria format email sudah dipenuhi, maka email tersebut akan disimpan.
        {
            this.email = email;
        }
        else //Jika tidak cocok atau tidak terpenuhi kriteria format emailnya, maka string kosong yang akan disimpan sebagai email.
        {
                this.email = "";
        }
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setPassword untuk menetapkan/mengisi nilai dari variable password.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu password.
     * Access modifier pada method berjenis public.
     * 
     * @param password digunakan sebagai inputan untuk variable password
     */
    public void setPassword(String password)
    {
        String regexP = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$"; //Membuat regrex sebagai kriteria password yang harus dipenuhi.
        Pattern pattern = Pattern.compile(regexP); //Mengcompile regex
        Matcher matcher = pattern.matcher(password); //Melakukan pencocokan antara password yang diinputkan oleh user dengan regex (kriteria password)
        if (matcher.matches()) //Jika cocok atau semua kriteria password sudah dipenuhi, maka password tersebut akan disimpan.
        {   
            this.password = password;
        }
        else //Jika tidak cocok atau tidak terpenuhi kriteria passwordnya, maka string kosong yang akan disimpan sebagai password.
        {   
            this.password = "";
        }
    }
    
    /**
     * Sebuah method setter (mutator) yang bernama setJoinDate untuk menetapkan/mengisi nilai dari variable joinDate.
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini, yaitu joinDate.
     * Access modifier pada method berjenis public.
     * 
     * @param joinDate digunakan sebagai inputan untuk variable joinDate
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = new GregorianCalendar(); //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    
    
    /**
     * Sebuah method setter (mutator) yang bernama setJoinDate, dimana method ini menerapkan konsep polymorphism,
     * karena mempunyai nama yang sama dengan method sebelumnya, namun mempunyai parameter yang berbeda.
     * Access modifier pada method berjenis public.     
     * Return type dari method ini adalah void.
     * Ada parameter yang digunakan pada method ini.
     * 
     * @param year digunakan sebagai inputan untuk variable tahun (year)
     * @param month digunakan sebagai inputan untuk variable bulan (month)
     * @param dayOfMonth digunakan sebagai inputan untuk variable hari (day)
     * 
     */
    public void setJoinDate(int year, int month, int dayOfMonth){
        this.joinDate = new GregorianCalendar(year, month - 1, dayOfMonth);
    }


    /**
     * Sebuah method yang bernama toString.
     * Method tersebut digunakan untuk merepresentasikan sebuah objek, kedalam tipe String.
     * Sehingga jika objek dipanggil maka akan mengembalikkan (return) sebuah data string yang sudah ditentukan.
     * Return type dari method bertipe String.
     * Access Modifier diatur public.
     *
     * @return id, name, email, password, date jadi mengembalikkan atau menampilkan semua data yang ada di instance variable jika variable joinDate tidak kosong.
     * @return id, name, email, password jadi hanya mengembalikkan keempat data variable tersebut jika variable joinDate kosong.
     */
    @Override
    public String toString() {
        if (this.joinDate == null) { //Jika variable joinDate kosong, maka data yang akan ditampilkan atau dikembalikkan (return) hanya nama, email, password.
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = " + getPassword();
        } 
        else { //Jika variable joinDate tidak kosong, maka data yang akan ditampilkan atau dikembalikkan (return) semua instance variable yang ada di kelas ini.
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd MMMM yyyy"); //Membuat format tanggal dengan urutan hari (dd), bulan (MMMM), dan tahun (yyyy), menggunakan SimpleDateFormat.
            String date = formattedDate.format(getJoinDate().getTime()); //Membuat variable baru bernama date dengan tipe datanya String, isi variable ini merupakan hasil perubahan data joinDate kedalam bentuk SimpleDateFormat.
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = " + getPassword() + "\nJoin Date = " + date;
        }

    }
}