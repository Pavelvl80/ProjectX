package lesson11.homework.replacer;

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

        //TODO null pointer can be here, change it please
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

            //TODO null pointer can be here, change it please
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("can't close reader");
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            everything = everything.replaceAll((String) entry.getKey(), (String) entry.getValue());
        }
        try {
            bw = new BufferedWriter(new FileWriter("C:/Users/Edvard Piri/Desktop/test.txt"));
        } catch (IOException e) {
            System.out.println("File not found");
        }
        try {

            //TODO null pointer can be here, change it please
            bw.write(everything);
        } catch (IOException e) {
            System.out.println("Write failed");
        } finally {
            try {
                //TODO null pointer can be here, change it please
                bw.close();
            } catch (IOException e) {
                System.out.println("can't close writer");
            }
        }


        return everything;
    }

}
