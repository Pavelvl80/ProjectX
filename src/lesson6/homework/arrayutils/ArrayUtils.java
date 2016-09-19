package lesson6.homework.arrayutils;

/**
 * Created by Edvard Piri on 19.09.2016.
 */
public final class ArrayUtils {
    //метод поиска наименьшего числа
    public static final int min(int array[]) {
        int minInt = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minInt >= array[i]) {
                minInt = array[i];
            }
        }
        return minInt;
    }

    //метод поиска наибольшего числа
    public static final int max(int array[]) {
        int maxInt = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxInt <= array[i]) {
                maxInt = array[i];
            }
        }
        return maxInt;
    }

    //метод поиска наибольше позитивного числа
    public static final int maxPositive(int array[]) {
        int maxPInt = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxPInt <= array[i]) {
                maxPInt = array[i];
            }
        }
        return maxPInt;
    }

    public static final int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static final long multiplication(int array[]) {
        long mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        return mult;
    }

    public static final int modulus(int array[]) {
        int size = array.length - 1;
        int mod = array[0] % array[size];
        return mod;
    }

    public static final int secondLargest(int array[]) {
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

    public static final int[] reverse(int[] array) {
        int[] reversed = array;
        int size = reversed.length - 1;
        int a = 0;
        for (int i = 0; i < size / 2; i++) {
            a = reversed[i];
            reversed[i] = reversed[size - i];
            reversed[size - i] = a;
        }
        return reversed;
    }

    public static final int[] findEvenElements(int[] array) {
        int[] evenArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < evenArray.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                evenArray[j] = array[i];
                j++;
            }
        }
        return evenArray;
    }
}
