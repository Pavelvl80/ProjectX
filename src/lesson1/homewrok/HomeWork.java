package lesson1.homewrok;

/**
 * Created by Edvard Piri on 27.08.2016.
 */
public class HomeWork {
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

