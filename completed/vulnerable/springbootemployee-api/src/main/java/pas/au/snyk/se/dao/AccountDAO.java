package pas.au.snyk.se.dao;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AccountDAO {
    private final DataSource dataSource;
    private final EntityManager em;

    public AccountDAO(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

    public List<AccountDTO> unsafeFindAccountsByCustomerId(String customerId) {

        String sql = "select " + "customer_id,acc_number,branch_id,balance from Accounts where customer_id = '" + customerId + "'";

        try (Connection c = dataSource.getConnection();
             ResultSet rs = c.createStatement()
                     .executeQuery(sql)) {
            List<AccountDTO> accounts = new ArrayList<>();
            while (rs.next()) {
                AccountDTO acc = AccountDTO.builder()
                        .customerId(rs.getString("customer_id"))
                        .branchId(rs.getString("branch_id"))
                        .accNumber(rs.getString("acc_number"))
                        .balance(rs.getBigDecimal("balance"))
                        .build();

                accounts.add(acc);
            }

            return accounts;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<AccountDTO> unsafeJpaFindAccountsByCustomerId(String customerId) {
        String jql = "from Account where customerId = '" + customerId + "'";
        TypedQuery<Account> q = em.createQuery(jql, Account.class);
        return q.getResultList()
                .stream()
                .map(a -> AccountDTO.builder()
                        .accNumber(a.getAccNumber())
                        .balance(a.getBalance())
                        .branchId(a.getAccNumber())
                        .customerId(a.getCustomerId())
                        .build())
                .collect(Collectors.toList());
    }

}
