package homework_7;

import java.lang.reflect.Array;
import java.util.Arrays;

import static helpUtilites.HelpUtilites.findNameArrays;

public class HW_7_1 {
    public static void main(String[] args){

        Employee7_1 employee1 = new Employee7_1("Gennadiy", 1000);
        Employee7_1 employee2 = new Employee7_1("Maryna", 500);
        Employee7_1 employee3 = new Employee7_1("Anna", 700);

        Employee7_1[] arrOfEmployee = {employee1, employee2, employee3};

        Employee7_1 nameFromArrayOfEmployee = findNameArrays(arrOfEmployee, "Anna");

        System.out.println(nameFromArrayOfEmployee.getName()
                + " has salary "
                + nameFromArrayOfEmployee.getSalary());

//        Manager7_1 manager1 = new Manager7_1("Gena", 1000, 25);
//
//        System.out.println(manager1.getSalary());
//
//        Director7_1 director1 = new Director7_1("Gena", 1000, 7);
//
//        System.out.println(director1.getSalary());



    }
}
