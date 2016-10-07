package lesson10.Practice;

import java.io.IOException;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[2] = 10;

        //java.lang.ArrayIndexOutOfBoundsException: 3
        //Sys.out.println(array[2]);

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //Sys.out.println(10 / array[2]);

        try {
            dangerous();
            dangerous1();
        } catch (IOException e) {
            System.out.println("file not found");
        } finally {
            System.out.println("finished");
        }
    }

    //try catch
//    static void dangerous() {
//        try {
//            Scanner scanner = new Scanner(new File("/path"));
//            Sys.out.println("file changed and saved");
//        } catch (Exception e) {
//            Sys.out.println("file not fond");
//        }
//
//        Sys.out.println("logic continue...");
//    }
//
    static void dangerous() throws IOException {
//        Scanner scanner = new Scanner(new File("/path"));
        System.out.println("file changed and saved");


        System.out.println("logic continue...");
    }

    static void dangerous1() throws IOException {
//        Scanner scanner = new Scanner(new File("/path"));
        System.out.println("file changed and saved");


        System.out.println("logic continue...");
    }
}
