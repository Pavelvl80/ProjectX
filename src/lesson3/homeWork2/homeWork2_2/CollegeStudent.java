package lesson3.homeWork2.homeWork2_2;

/**
 * Created by Edvard Piri on 09.09.2016.
 */
public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;

    public CollegeStudent () {

    }
    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
