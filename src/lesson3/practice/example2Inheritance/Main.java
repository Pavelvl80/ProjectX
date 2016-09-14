package lesson3.practice.example2Inheritance;

/**
 * Created by Edvard Piri on 04.09.2016.
 */

class Main {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Course courseJava = new Course();
        Course courseC = new Course();
        Course[] courses = {courseJava, courseC};

        CollengeStudent student = new CollengeStudent("Pasha", 7, 17, courses, "Queen College");

        printer(student);

        student.setColledgeName("York");
        student.setGroup(7000);

        printer(student);

    }

    private static void printer(CollengeStudent student) {
        System.out.println(student.getColledgeName());
        System.out.println(student.getCollegesCount());
        System.out.println(student.getGroup());
    }
}
