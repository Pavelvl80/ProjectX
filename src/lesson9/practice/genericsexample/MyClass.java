package lesson9.practice.genericsexample;

/**
 * Created by Edvard Piri on 01.10.2016.
 */
public class MyClass<T, B> {

    T doSomething(T t) {
        System.out.println("doSnome test method");
        return t;
    }

    B test(B b) {
        System.out.println("test 2");
        return b;
    }


}
