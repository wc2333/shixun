package hr.Entity;

public class User {
    private int uid;
    private String username;
    private String password;
    private String gender;
    private String phone;

    public User(int uid, String username, String password, String gender, String phone) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
