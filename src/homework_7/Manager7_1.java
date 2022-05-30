package homework_7;

public class Manager7_1 extends Worker7_1 {
    int numberOfSubordinates;

    public Manager7_1(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return getBaseSalary();
        }
        return (int) (getBaseSalary() + ((getBaseSalary() * (numberOfSubordinates / 100.0 * 3))));
    }
}
