package lesson8.homework.listtest;

/**
 * Created by Edvard Piri on 27.09.2016.
 */
public class Test {
    public static void main(String[] args) {
//        String n = "42";
//        Sys.out.println(n);
//        String b = (String) n;
//        Sys.out.println(b);

        String b = null;
        for (int i = 0; i < 10; i++) {
            b = Integer.toString(i);
        }
        System.out.println(b);
    }
}
