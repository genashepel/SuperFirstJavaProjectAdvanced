package homework_7;

import java.util.List;


import static helpUtilites.HelpUtilites.*;

public class HW_7_1 {
    public static void main(String[] args){

        Employee7_1 employee1 = new Employee7_1("Gennadiy", 1000);
        Employee7_1 employee2 = new Employee7_1("Maryna", 500);
        Employee7_1 employee3 = new Employee7_1("Anna", 700);

        Manager7_1 manager1 = new Manager7_1("Gennadiy", 1000, 5);
        Manager7_1 manager2 = new Manager7_1("Maryna", 500, 32);
        Manager7_1 manager3 = new Manager7_1("Anna", 700, 18);

        Manager7_1[] arrOfManager = {manager1, manager2, manager3};
        List<Manager7_1> listOfManagers = findNameFromSubString(arrOfManager, "na");

        Employee7_1[] arrOfEmployee = {employee1, employee2, employee3};
        List<Employee7_1> listOfEmployee = findNameFromSubString(arrOfEmployee, "na");


        for(Employee7_1 list : listOfEmployee){
            System.out.println("Employee " + list.getName() + " has salary ---> " + list.getSalary());
        }

        printLine();

        for(Manager7_1 list : listOfManagers){
            System.out.println("Manager " + list.getName() + " has salary ---> " + list.getSalary());
        }

        printLine();

        System.out.println("бюджета для всех Managers " + sumSalaryOfAllEmployee(arrOfManager));
        System.out.println("бюджета для всех Employees " + sumSalaryOfAllEmployee(arrOfEmployee));

        printLine();

        System.out.println("Smallest salary from all Managers is " + returnSmallestSalary(arrOfManager));
        System.out.println("Smallest Salary from all Employees is " + returnSmallestSalary(arrOfEmployee));

        printLine();
        System.out.println("Biggest salary from all Managers is " + returnBiggestSalary(arrOfManager));
        System.out.println("Biggest Salary from all Employees is " + returnBiggestSalary(arrOfEmployee));

        printLine();
        System.out.println("Smallest Number of subordinates from all Managers is "
                            + returnSmallestEmployeeFromManager(arrOfManager));

        printLine();
        System.out.println("Biggest Number of subordinates from all Managers is "
                + returnBiggestEmployeeFromManager(arrOfManager));

        printLine();
        System.out.println("Higest markup from all Managers is "  + searchHighestMarkup(arrOfManager));

        printLine();
        System.out.println("Higest markup from all Managers is "  + searchLowersttMarkup(arrOfManager));
    }
}
