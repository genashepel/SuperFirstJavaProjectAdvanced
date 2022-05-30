package homework_7_2;

import static  homework_7_2.MonthUtils.*;

public class HW7_2 {
    public static void main(String[] args) {

        Employee7_2 employee1 = new Employee7_2("Gennadiy", 46, 'M', 250);
        Employee7_2 employee2 = new Employee7_2("Maryna", 49, 'F', 230);

        System.out.println(employee1.getSalary(getMonthArray()));
    }
}
