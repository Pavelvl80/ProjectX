package lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Edvard Piri on 08.10.2016.
 */
public class FileReaderJava7Example {
    public static void main(String[] args) throws Exception {
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Edvard Piri/Desktop/doce.txt"))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    System.out.println(line);
                    line = br.readLine();
                }
                String everything = sb.toString();
                System.out.println(everything);
            }
        } catch (IOException e) {
            System.out.println("read failed");
        }
    }
}
