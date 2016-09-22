package lesson7.practice;

/**
 * Created by Edvard Piri on 21.09.2016.
 */
public class User {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, int age, String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
}