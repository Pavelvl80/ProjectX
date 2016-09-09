package lesson3.example1Inheritance;

/**
 * Created by Edvard Piri on 04.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.sing();
        System.out.println(bird.legsCount);

        Parrot parrot = new Parrot();

    }
}
