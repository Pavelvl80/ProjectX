package lesson3.practice.example2Inheritance;

/**
 * Created by Edvard Piri on 04.09.2016.
 */
public class CollengeStudent extends Student {
     private String colledgeName;
     private int collegesCount;

    public CollengeStudent(String name, int group, int age, Course[] courses, String colledgeName) {
        super(name, group, age, courses);
        this.colledgeName = colledgeName;
        this.collegesCount = 0;
    }

    public String getColledgeName() {
        return colledgeName;
    }

    public void setColledgeName(String colledgeName) {
        this.colledgeName = colledgeName;
        collegesCount++;
    }

    public int getCollegesCount() {
        return collegesCount;
    }
}


