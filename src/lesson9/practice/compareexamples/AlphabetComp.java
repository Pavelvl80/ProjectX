package lesson9.practice.compareexamples;

import java.util.Comparator;

/**
 * Created by Edvard Piri on 01.10.2016.
 */
public class AlphabetComp implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
