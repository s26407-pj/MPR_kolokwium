package pl.pjatk.s26407Bank;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountService {
    private final AccountStorage accountStorage;

    public AccountService(AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }

    public void newAccount(int id, User user, int balance) {
        accountStorage.getAccountList().add(new Account(id, user, balance));

        System.out.println("Nowy klient został dodany");
        System.out.println("Inię: " + user.getUserName() + ", Stan konta: " + balance);
        System.out.println("--------------------------");
    }

    public void showAccount(int id) {
        List<Account> accountList = accountStorage.getAccountList();

        for (Account account : accountList) {
            if (id == account.getId()) {

                System.out.println("Konto o ID = " + id);
                System.out.println("Klient: " + account.getUser().getUserName() + ", stan konta: " + account.getBalance());
                System.out.println("--------------------------");
            }
        }
    }

    public void transferIn(int id, int amount) {
        Status status = null;

        List<Account> accountList = accountStorage.getAccountList();

        for (Account account : accountList) {
            if (id == account.getId()) {

                int balance = account.getBalance();
                int newBalance = balance + amount;

                account.setBalance(newBalance);
                status = Status.ACCEPTED;

                System.out.println("Konto o ID = " + id + " zostało zasilone kwotą: " + amount);
                System.out.println("Klient: " + account.getUser().getUserName() + ", aktualny stan konta: " + account.getBalance());
                System.out.println("--------------------------");
            }
        }
    }

    public void transferOut(int id, int amount) {
        Status status = null;

        List<Account> accountList = accountStorage.getAccountList();

        for (Account account : accountList) {
            if (id == account.getId()) {

                int balance = account.getBalance();
                int newBalance = balance - amount;

                if (newBalance < 0) {
                    System.out.println("Nie można wykonać przelewu. Niewystarczająca ilość środków.");
                    status = Status.DECLINED;
                } else {
                    account.setBalance(newBalance);
                    status = Status.ACCEPTED;

                    System.out.println("Z konta o ID = " + id + " został wykonany przelew na kwotę: " + amount);
                    System.out.println("Klient: " + account.getUser().getUserName() + ", aktualny stan konta: " + account.getBalance());
                    System.out.println("--------------------------");
                }
            }
        }
    }
}
