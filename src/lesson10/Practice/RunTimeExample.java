package lesson10.Practice;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class RunTimeExample {
    public static void main(String[] args) {
        int[] array = new int[3];

//        //java.lang.ArrayIndexOutOfBoundsException: 3
//        Sys.out.println(array[3]);
//
//        Sys.out.println(111);
//
//        //Exception in thread "main" java.lang.ArithmeticException: / by zero
//        Sys.out.println(10 / array[2]);

        String item = "phone";
        Sys sys = null;

        if(item.equals("test")) {
            sys = new Sys("test");
        }
        if(sys != null) sys.getName();
        else System.out.println();

        sys.getName();
    }
}
