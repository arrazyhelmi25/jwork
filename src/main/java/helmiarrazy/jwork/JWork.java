package helmiarrazy.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Kelas JWork, merupakan kelas utama (main) untuk memulai program.
 *
 * @author Helmi Arrazy
 * @version 25-03-2021
 */
@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Kantor");

        DatabaseRecruiterPostgre.addRecruiter(new Recruiter(DatabaseRecruiterPostgre.getLastRecruiterId() + 1, "Helmi", "helmi@gmail.com", "12345", location1));
        try {
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "Backend Engineer", DatabaseRecruiterPostgre.getRecruiterById(1), 10000, JobCategory.Backend));
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "Frontend Engineer", DatabaseRecruiterPostgre.getRecruiterById(1), 10000, JobCategory.Frontend));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        SpringApplication.run(JWork.class, args);
    }

}
