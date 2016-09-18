package lesson6.prictice;

/**
 * Created by Edvard Piri on 18.09.2016.
 */
public class Company {
    private long id;
    private String name;
    private static String country;

    static {
       country = "USA";
    }

    public Company(long id) {
        this.id = id;
    }

    void nameEditor() {
        System.out.println("Company name is " + name);
    }

    static void countryEditor() {
        country = "Empty";
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
