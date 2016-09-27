package lesson1.homework;

/**
 * Created by Edvard Piri on 27.08.2016.
 */
public class FindSecondLargest {
    //TODO use methods from Array utils that you've made in lesson 6

    public static int secondLargest(int array[]) {
        int maxInt = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
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
