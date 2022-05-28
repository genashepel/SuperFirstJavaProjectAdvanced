package homework_7;

public class Worker7_1 extends Employee7_1 {

    public Worker7_1(String name, int baseSalary) {
        super(name,  baseSalary);
    }

    @Override
    public int getSalary() {
        return super.getBaseSalary();
    }
}
