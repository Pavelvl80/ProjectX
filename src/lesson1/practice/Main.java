package lesson1.practice;

/**
 * Created by Edvard Piri on 27.08.2016.
 */
public class Main {
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
    public static void main(String[] args) {

        //тестовый массив
        int[] array = {-1, -2, -1, -1};

        //вывод результатов
        System.out.print(secondLargest(array));
    }
}
