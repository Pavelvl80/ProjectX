package codechef;

/**
 * Created by Edvard Piri on 28.09.2016.
 */
public class ATM {
    public static void main(String[] args) throws java.lang.Exception {
        java.util.Scanner r = new java.util.Scanner(System.in);
        double x = r.nextDouble();
        double y = r.nextDouble();

        if (x % 5 == 0 && x + 0.50 < y) {
            System.out.println(y - x - 0.50);
        } else {
            System.out.println(y);
        }
    }

}
