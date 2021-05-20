package helmiarrazy.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Kantor");
        Location location2 = new Location("Jawa Barat", "Bekasi", "Rumah");
        Location location3 = new Location("Jambi", "Jambi", "Hotel");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Helmi", "helmi@gmail.com", "12345", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Arrazy", "arrazy@gmail.com", "678910", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Hary", "hary@gmail.com", "1456732", location3));
        try {
            DatabaseJob.addJob(new Job(14, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.Backend));
            DatabaseJob.addJob(new Job(15, "Backend Engineer", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.Backend));
            DatabaseJob.addJob(new Job(16, "Frontend Engineer", DatabaseRecruiter.getRecruiterById(3), 10000, JobCategory.Frontend));
            DatabaseJob.addJob(new Job(17, "UI Engineer", DatabaseRecruiter.getRecruiterById(3), 10000, JobCategory.UI));
        }
        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }
        SpringApplication.run(JWork.class, args);
    }

}
