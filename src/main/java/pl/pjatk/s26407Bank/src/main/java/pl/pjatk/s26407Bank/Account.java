package pl.pjatk.s26407Bank;

public class Account {

    private int id;
    private User user;
    private int balance;

    public Account(int id, User user, int balance) {
        this.id = id;
        this.user = user;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", user=" + user +
                ", balance=" + balance +
                '}';
    }
}
