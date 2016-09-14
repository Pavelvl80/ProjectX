package lesson1.homewrok;

/**
 * Created by Edvard Piri on 28.08.2016.
 */
public class HomeWork3 {
    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int multiplication(int array[]) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        return mult;
    }

    public static int modulus(int array[]) {
        int size = array.length - 1;
        int mod = array[0] % array[size];
        return mod;
    }
}