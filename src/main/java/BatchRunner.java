import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lisner on 10/5/2015.
 */
// @SpringBootApplication
public class BatchRunner {
    public static void main(String [] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(
                BatchConfiguration.class, args)));
    }
}
