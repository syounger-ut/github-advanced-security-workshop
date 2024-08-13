package pas.au.snyk.se.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/accounts")
public class AccountRestController {

    private AccountDAO accountDAO;

    @Autowired
    public AccountRestController(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @GetMapping (value = "/{customerId}")
    public List<AccountDTO> findAccountsByCustomerId (@PathVariable String customerId) {
        return accountDAO.unsafeJpaFindAccountsByCustomerId(customerId);
    }
}
