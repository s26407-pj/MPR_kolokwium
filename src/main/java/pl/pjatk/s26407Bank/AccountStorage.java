package pl.pjatk.s26407Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountStorage {
    private List<Account> accountList = new ArrayList<>();

    public List<Account> getAccountList() {
        return accountList;
    }

    public AccountStorage() {
        accountList.add(new Account(1, new User("Agnieszka"), 5000));
        accountList.add(new Account(2, new User("Łukasz"), 10000));
    }
}
