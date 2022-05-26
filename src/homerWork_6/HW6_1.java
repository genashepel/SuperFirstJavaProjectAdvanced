package homerWork_6;

public class HW6_1 {
    public static void main(String[] args) {
        Person person1 = new Person("Marina", 34, 'M');
        Person person2 = new Person("Gennadiy", 46, 'F');

        Person[] arrPerson = {person1, person2};

        Employee employeeGennadiy = new Employee("Gennadiy", 46, 'M', 3000);
        Employee employeeMarina = new Employee("Marina", 34, 'F', 6000);

        Employee[] arr = {employeeMarina, employeeGennadiy};

        System.out.println(employeeGennadiy.isSameName(employeeGennadiy, "Mr.Gennadiy"));
        System.out.println(person1.getName());

        Salary salary = new Salary();
        System.out.println(salary.getSum(arr));

        System.out.println(person1.minAgePerson(arrPerson).getAge());


    }
}
