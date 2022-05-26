package homerWork_6;

public class HW6_1 {
    public static void main(String[] args) {
        Person person1 = new Person("Marina", 49, "Mrs");
        Person person2 = new Person("Gennadiy", 46, "Mrs");



        Employee employeeGennadiy = new Employee("Gennadiy", 46, "Mr", 3000 );
        Employee employeeMarina = new Employee("Marina", 49, "Mrs", 6000);

        Employee[] arr = {employeeMarina, employeeGennadiy};

        System.out.println(employeeGennadiy.isSameName(employeeGennadiy, "Mr.Gennadiy"));
        System.out.println(person1.getName());

        Salary salary = new Salary();
        System.out.println(salary.getSum(arr));


    }
}
