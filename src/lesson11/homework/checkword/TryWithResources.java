package lesson11.homework.checkword;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Edvard Piri on 11.10.2016.
 */
public class TryWithResources {

    int checkWord(String word) {
        int i = 0;
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Edvard Piri/Desktop/test.txt"))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                String[] words;

                while (line != null) {

                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                words = sb.toString().split("\r\n");
                for (String s : words) {
                    if (s.equals(word)) i++;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return i;
    }
}
