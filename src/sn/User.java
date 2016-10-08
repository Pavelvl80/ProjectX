package sn;

import java.util.Date;
import java.util.List;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class User {
    private long id;
    private String name;
    private int age;
    private String password;
    private List<User> friends;
    private Gender gender;
    private String city;
    private Date dateRegistered;
    private Date dateLogin;

    private boolean isActive;

    public User(String name, String password, Gender gender, String city) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.city = city;

        this.dateRegistered = this.dateLogin = new Date();
        this.isActive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Date getDateLogin() {
        return dateLogin;
    }

    public void setDateLogin(Date dateLogin) {
        this.dateLogin = dateLogin;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        if (id != user.id) return false;
        if (age != user.age) return false;
        if (isActive != user.isActive) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (friends != null ? !friends.equals(user.friends) : user.friends != null) return false;
        if (gender != user.gender) return false;
        if (city != null ? !city.equals(user.city) : user.city != null) return false;
        if (dateRegistered != null ? !dateRegistered.equals(user.dateRegistered) : user.dateRegistered != null)
            return false;
        return dateLogin != null ? dateLogin.equals(user.dateLogin) : user.dateLogin == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (friends != null ? friends.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (dateRegistered != null ? dateRegistered.hashCode() : 0);
        result = 31 * result + (dateLogin != null ? dateLogin.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
