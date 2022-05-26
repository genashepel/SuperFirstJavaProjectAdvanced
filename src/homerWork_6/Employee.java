package homerWork_6;

public class Employee extends Person {
    int salery;

    public Employee(String name, int age, char gender, int salery) {
        super(name, age, gender);
        this.salery = salery;
    }

    boolean isSameName(Employee employee, String name){
        return employee.getName().equals(name);
    }
}
