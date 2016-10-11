package lesson11.homework;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/Edvard Piri/Desktop/1.txt"));
        String line = "";
        String fileContent = "";
        String nl = System.getProperty("line.separator");
        while ((line = br.readLine()) != null) {
            fileContent = fileContent + line + nl;
        }
        br.close();
        fileContent = fileContent.replaceAll("(H|h)(E|e)(L|l)(L|l)(O|o)",
                "1234");
        System.out.println(fileContent);
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Edvard Piri/Desktop/1.txt"));
        bw.write(fileContent);
        bw.close();
    }
}