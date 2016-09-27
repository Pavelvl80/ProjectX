package lesson1.homework;

/**
 * Created by Edvard Piri on 27.08.2016.
 */
public class FindBiggerNumm {
    //TODO use methods from Array utils that you've made in lesson 6

    //метод поиска наименьшего числа
    public static int min(int array[]) {
        int minInt = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minInt >= array[i]) {
                minInt = array[i];
            }
        }
        return minInt;
    }

    //метод поиска наибольшего числа
    public static int max(int array[]) {
        int maxInt = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxInt <= array[i]) {
                maxInt = array[i];
            }
        }
        return maxInt;
    }
    //метод поиска наибольше позитивного числа
    public static int maxPositive(int array[]) {
        int maxPInt = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxPInt <= array[i]) {
                maxPInt = array[i];
            }
        }
        return maxPInt;
    }
}

