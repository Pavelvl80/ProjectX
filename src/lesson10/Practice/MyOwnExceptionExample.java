package lesson10.Practice;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class MyOwnExceptionExample {
    public static void main(String[] args) throws Exception{
        String str = "system";
//        try {
            checkString(str);
//        } catch (Exception e) {
//            System.out.println("bad string");
            //send error ticket to admin
//        }
    }

    static void checkString(String string) throws Exception {
        if (string.equals("system"))
            System.out.println("happy");
        else throw new Exception("String is not equal Sys");
    }
}
