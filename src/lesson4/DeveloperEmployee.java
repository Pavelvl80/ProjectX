package lesson4;

/**
 * Created by Edvard Piri on 10.09.2016.
 */
public class DeveloperEmployee extends Employee {
    private int daysOfWork;
    private int hoursADay;
    private int hourlyRate;

    public DeveloperEmployee(int id, String name, int age, int balance, int daysOfWork, int hoursADay, int hourlyRate) {
        super(id, name, age, balance);
        this.daysOfWork = daysOfWork;
        this.hoursADay = hoursADay;
        this.hourlyRate = hourlyRate;
    }

    @Override
    int calculateSalary() {
        return daysOfWork * hoursADay * hourlyRate;
    }

    @Override
    void paySalary() {
        setBalance(getSalary());
    }

}
