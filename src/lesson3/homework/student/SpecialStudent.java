package lesson3.homework.student;

/**
 * Created by Edvard Piri on 09.09.2016.
 */
public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, long secretKey) {
        this.secretKey = secretKey;
    }
}
