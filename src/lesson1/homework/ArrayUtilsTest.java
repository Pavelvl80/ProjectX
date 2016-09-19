package lesson1.homework;

import com.sun.org.apache.xpath.internal.SourceTree;
import lesson6.homework.arrayutils.ArrayUtils;

/**
 * Created by Edvard Piri on 19.09.2016.
 */
public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] array = {1, 12, 56, 123, -2233, 3434, 1, 6, 8,};

        test(ArrayUtils.findEvenElements(array));
        test(ArrayUtils.reverse(array));
        System.out.println(ArrayUtils.min(array));
        System.out.println(ArrayUtils.max(array));
        System.out.println(ArrayUtils.maxPositive(array));
        System.out.println(ArrayUtils.modulus(array));
        System.out.println(ArrayUtils.multiplication(array));
        System.out.println(ArrayUtils.secondLargest(array));
        System.out.println(ArrayUtils.sum(array));


    }

    static void test(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }
}
