package lesson11.homework;

import java.io.*;
import java.util.Map;

/**
 * Created by Edvard Piri on 10.10.2016.
 */
public class Replacer {


    String replacer(Map<String, String> map) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String everything = null;

        try {
            br = new BufferedReader(new FileReader("C:/Users/Edvard Piri/Desktop/test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (IOException e) {
            System.out.println("Read failed");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("can't close reader");
            }
            String[] words = everything.split(" ");
            for (Map.Entry entry : map.entrySet()) {
                everything = everything.replaceAll((String) entry.getKey(), (String) entry.getValue());
            }
            try {
                bw = new BufferedWriter(new FileWriter("C:/Users/Edvard Piri/Desktop/test.txt"));
            } catch (IOException e) {
                System.out.println("File not found");
            }
            try {
                bw.write(everything);
            } catch (IOException e) {
                System.out.println("Write failed");
            } finally {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("can't close writer");
                }
            }
        }

        return everything;
    }

}
