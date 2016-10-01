package lesson9.practice.genericsexample;

/**
 * Created by Edvard Piri on 01.10.2016.
 */
public class GenericMethodExample {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'O', 'L'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
