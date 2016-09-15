package lesson1.homework;

/**
 * Created by Edvard Piri on 27.08.2016.
 */
public class HomeWork2 {
    public static int secondLargest(int array[]) {
        int maxInt = -2147483648;
        int secLar = -2147483648;
        for (int i = 0; i < array.length; i++) {
            if (maxInt < array[i]) {
                maxInt = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < maxInt && array[i] > secLar) {
                secLar = array[i];
            }
        }
        return secLar;
    }
}
