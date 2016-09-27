package lesson8.practice;

/**
 * Created by Edvard Piri on 25.09.2016.
 */
public class InterfaceObjectExample {
    public static void main(String[] args) {
        TestInterface  testInterface = new TestInterface() {
            @Override
            public String test(String s) {
                return null;
            }
        };
    }

}
