package lesson9.practice.genericsexample;

/**
 * Created by Edvard Piri on 01.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyClass<Foo, Boo> myClass = new MyClass<Foo, Boo>();

        Foo foo = new Foo();
        Foo foo2 = myClass.doSomething(foo);

        if(foo2 != null) System.out.println("success");

        Boo boo = new Boo();

        myClass.test(boo);
    }
}
