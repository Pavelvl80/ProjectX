package lesson3.homeWork2.homeWork2_2;

/**
 * Created by Edvard Piri on 09.09.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Course course1 = new Course(14, "Java");
        Course course2 = new Course("C++", 300, "Vlad");
        Course course3 = new Course(13, "python");
        Course course4 = new Course("Ruby", 100, "Alex");
        Course course5 = new Course(6, "C");

        Course[] courses = {course1, course3};

        Student student1 = new Student("Jonny", "Power", 7);
        Student student2 = new Student("ford", courses);

        CollegeStudent collegeStudent1 = new CollegeStudent("Ivan", "Durak", 7);
        CollegeStudent collegeStudent2 = new CollegeStudent("Zadornov", courses);
        CollegeStudent collegeStudent3 = new CollegeStudent("Alexey", "Alybert", 9, courses, "Super wander college №1", 1, 767895);

        SpecialStudent specialStudent1 = new SpecialStudent("Ilius", "Overmagus", 9);
        SpecialStudent specialStudent2 = new SpecialStudent("Royko", courses);
        SpecialStudent specialStudent3 = new SpecialStudent("Vitalik", "Goncharov", 10, courses, 1283823828);
    }
}
