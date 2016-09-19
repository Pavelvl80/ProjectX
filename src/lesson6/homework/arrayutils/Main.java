package lesson6.homework.arrayutils;

import lesson5.homework.hotel.Controller;

import java.util.Arrays;

/**
 * Created by Edvard Piri on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, 5, -6, 0};
        int[] arr2;

        arr2 = ArrayUtils.findEvenElements(arr);

        //ArrayUtils.reverse(arr);
        //ArrayUtils.findEvenElements(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println();
    }
}
