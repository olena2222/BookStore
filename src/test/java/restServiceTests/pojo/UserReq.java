package restServiceTests.pojo;

public class UserReq {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserReq(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    public UserReq() {
    }
}
