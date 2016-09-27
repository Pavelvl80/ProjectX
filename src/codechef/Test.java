package codechef;

import java.util.Scanner;

/**
 * Created by Edvard Piri on 26.09.2016.
 */

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (n != 42) {
            if (scanner.nextInt() >= 0 && scanner.nextInt() < 100) {
                n = scanner.nextInt();
                System.out.println(n);
            }
        }
    }
}
