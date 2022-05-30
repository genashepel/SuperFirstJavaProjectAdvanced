package homework_7_1;

public class Director7_1 extends Manager7_1 {

    public Director7_1(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public  int getSalary(){

        if(numberOfSubordinates == 0){
            return getBaseSalary();
        }
        return (int)(getBaseSalary() + ((getBaseSalary() * (numberOfSubordinates / 100.0 * 9))));
    }
}
