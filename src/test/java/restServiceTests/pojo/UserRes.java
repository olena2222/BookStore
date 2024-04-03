package restServiceTests.pojo;

public class UserRes {
    private String userID;
    private String username;

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    private String[] books;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserRes(String userID, String username, String[] books) {
        this.userID = userID;
        this.username = username;
        this.books = books;
    }

    public UserRes() {
    }
}
