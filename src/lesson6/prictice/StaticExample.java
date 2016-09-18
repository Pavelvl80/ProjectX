package lesson6.prictice;

/**
 * Created by Edvard Piri on 18.09.2016.
 */
public class StaticExample {
    public static void main(String[] args) {
        Company company1 = new Company(1001);
        Company company2 = new Company(1002);

        System.out.println(company1);
        System.out.println(company2);

        company1.setCountry("Ukraine");
        company2.setCountry("Poland");


        System.out.println(company1);
        System.out.println(company2);

        Company.countryEditor();

        System.out.println(company1);

    }
}
