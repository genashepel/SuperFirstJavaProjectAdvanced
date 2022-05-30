package homework_7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static helpUtilites.HelpUtilites.*;

public class HW_7_1 {
    public static void main(String[] args){

        Employee7_1 employee1 = new Employee7_1("Gennadiy", 1000);
        Employee7_1 employee2 = new Employee7_1("Maryna", 500);
        Employee7_1 employee3 = new Employee7_1("Anna", 700);

        Manager7_1 manager1 = new Manager7_1("Gennadiy", 1000, 5);
        Manager7_1 manager2 = new Manager7_1("Maryna", 500, 10);
        Manager7_1 manager3 = new Manager7_1("Anna", 700, 18);

        Manager7_1[] arrOfManager = {manager1, manager2, manager3};
        List<Manager7_1> listOfManagers = findNameFromSubString(arrOfManager, "Ge");

        Employee7_1[] arrOfEmployee = {employee1, employee2, employee3};
        List<Employee7_1> listOfEmployee = findNameFromSubString(arrOfEmployee, "na");


        for(Employee7_1 list : listOfEmployee){
            System.out.println("Employee " + list.getName() + " has salary ---> " + list.getSalary());
        }

        printLine();

        for(Manager7_1 list : listOfManagers){
            System.out.println("Manager " + list.getName() + " has salary ---> " + list.getSalary());
        }
//        System.out.println(listOfEmployee.get(0).getName());
//        System.out.println(listOfEmployee.get(1).getName());

        //Employee7_1 nameFromArrayOfEmployee = findNameArrays(arrOfEmployee, "Anna");
        //Employee7_1 nameFromArrayOfEmployee1 = findNameFromSubString(arrOfEmployee, "enn");

//        System.out.println(nameFromArrayOfEmployee1.getName()
//                + " has salary "
//                + nameFromArrayOfEmployee1.getSalary());


//        Manager7_1 manager1 = new Manager7_1("Gena", 1000, 25);
//
//        System.out.println(manager1.getSalary());
//
//        Director7_1 director1 = new Director7_1("Gena", 1000, 7);
//
//        System.out.println(director1.getSalary());



    }
}
