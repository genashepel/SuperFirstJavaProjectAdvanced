package homerWork_6;

public class Salary {

    int getSum(Employee[] employeeArray){
        int sumAllsalary = 0;
        for (int i = 0; i < employeeArray.length; i++){
            sumAllsalary = sumAllsalary + employeeArray[i].salery;
        }
        return sumAllsalary;
    }
}
