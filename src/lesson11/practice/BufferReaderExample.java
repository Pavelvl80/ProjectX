package lesson11.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Edvard Piri on 08.10.2016.
 */
public class BufferReaderExample {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        try {
            while (count != 42) {
                String input = br.readLine();
                System.out.println("The string " + input + " is read");
                try {
                    count = Integer.valueOf(input);
                } catch (NumberFormatException e) {
                    System.out.println("it is not integer value");
                }
            }
        } catch (IOException e) {
            System.out.println("read error...");
        }

        System.out.println("finished");

        try {
            br.close();
        } catch (IOException e) {
            System.out.println();
        }

    }
}
