package lesson11.homework.checkword;

/**
 * Created by Edvard Piri on 11.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        TryWithResources twr = new TryWithResources();
        UsualTry ut = new UsualTry();

        //System.out.println(twr.checkWord("in"));
        System.out.println(ut.checkWord("fall"));

    }
}
