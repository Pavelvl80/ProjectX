package lesson5.foreachtest;

/**
 * Created by Edvard Piri on 15.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int index = 0;

        //for (int i = 0; i < arr.length; i++) {
        //    arr[i] = i;
        //    Sys.out.print(i);
       // }

        System.out.println("\b");
        for (int i : arr) {
            i = index;
            index++;
            System.out.print(i);
        }
    }
}
