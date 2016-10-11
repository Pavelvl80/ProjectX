package lesson11.practice;

import java.util.Scanner;

/**
 * Created by Edvard Piri on 08.10.2016.
 */
public class ReadFromKeyboardExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            System.out.println(scanner.next());

        }

        scanner.close();
    }
}
