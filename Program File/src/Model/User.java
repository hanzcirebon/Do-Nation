package Model;


public class User {

    public User(int UserPK, String Username, String Password) {
        this.UserPK = UserPK;
        this.Username = Username;
        this.Password = Password;
    }
    private String Username;
    private String Password;
    private int UserPK;
    
    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getUserPK() {
        return UserPK;
    }

    public void setUserPK(int UserPK) {
        this.UserPK = UserPK;
    }
}
