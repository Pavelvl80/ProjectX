package lesson11.homework.checkword;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Edvard Piri on 11.10.2016.
 */
public class UsualTry {
    int checkWord(String word) {
        BufferedReader br = null;
        int i = 0;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Edvard Piri/Desktop/test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
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
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return i;
    }
}
