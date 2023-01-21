package pl.pjatk.s26407Bank;

public class User {
    private String userName;

    public User (String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
