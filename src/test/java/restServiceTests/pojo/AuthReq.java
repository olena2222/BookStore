package restServiceTests.pojo;

public class AuthReq {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public AuthReq(String username, String password) {
        this.userName = username;
        this.password = password;
    }
}
