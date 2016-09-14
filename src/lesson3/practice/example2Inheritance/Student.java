package lesson3.practice.example2Inheritance;

/**
 * Created by Edvard Piri on 04.09.2016.
 */
public class Student {
    private String name;
    private int group;
    private int age;
    private Course[] courses;

    public Student() {
    }

    public Student(String name, int group, int age, Course[] courses) {
        this.name = name;
        this.group = group;
        this.age = age;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
