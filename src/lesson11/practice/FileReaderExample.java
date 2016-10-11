package lesson11.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Edvard Piri on 08.10.2016.
 */
public class FileReaderExample {
    public static void main(String[] args) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Edvard Piri/Desktop/test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } catch (IOException e) {
            System.out.println("read failed");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("can't close reader");
            }
        }
    }
}
