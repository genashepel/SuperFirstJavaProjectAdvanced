package homerWork_6;

public class Employee extends Person {
    int salery;
    Employee(String name, int age, String pol, int salery) {
        super(name, age, pol);
        this.salery = salery;
    }

    boolean isSameName(Employee employee,String name){
        String name1 = employee.getName();
        return name1.equals(name);
    }
}
