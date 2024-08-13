package pas.au.snyk.se;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pas.au.snyk.se.domain.Employee;
import pas.au.snyk.se.repository.EmployeeRestResource;

@Slf4j
@Configuration
public class LoadDatabase {

    private EmployeeRestResource employeeRestResource;

    @Autowired
    public LoadDatabase(EmployeeRestResource employeeRestResource) {
        this.employeeRestResource = employeeRestResource;
    }

    @Bean
    public CommandLineRunner initDB(EmployeeRestResource employeeRestResource) {
        return args -> {
            log.info("pre loading " + employeeRestResource.save(new Employee("pas", "M", "HR")));
            log.info("pre loading " + employeeRestResource.save(new Employee("lucia", "F", "MARKETING")));
            log.info("pre loading " + employeeRestResource.save(new Employee("lucas", "M", "LEGAL")));
            log.info("pre loading " + employeeRestResource.save(new Employee("lucas", "M", "LEGAL")));
        };
    }
}
