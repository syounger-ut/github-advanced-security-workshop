package pas.au.snyk.se.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseServiceController {
    private DatabaseService databaseService;

    @Autowired
    public DatabaseServiceController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @GetMapping ("/password")
    public String showPassword () {
        return databaseService.getPassword();
    }
}
