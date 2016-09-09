package lesson3.homeWork2.homeWork2_2;

import java.util.Date;

/**
 * Created by Edvard Piri on 09.09.2016.
 */
public class Course {
    private int startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(int startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }
}
