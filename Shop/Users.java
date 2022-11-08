package Shop;

public enum Users {
    USER1("user1", "1234"),
    USER2("user2", "tyoma");
    private String login;
    private String password;

    Users(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}
