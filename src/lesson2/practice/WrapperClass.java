package lesson2.practice;


public class WrapperClass {
    static int a = 5;
    static Integer c = 5;

    static long b = 10L;
    static Long k = 10L;

    //List<int> list = new ArrayList<>();


    static void test(Integer var) {
        //int - > Integer
        System.out.println(var);
    }

    static void test(int  var) {
        //Integer -> int
        System.out.println(var);
    }

    public static void main(String[] args) {
        test(a);
        test(c);

        //long test = a;

        //Integer.



    }
}