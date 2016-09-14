package lesson5.practice.interfaces;

/**
 * Created by Edvard Piri on 14.09.2016.
 */
public class ForEachLoopExample {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};

        for (int item : array) {
            System.out.println(item);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
