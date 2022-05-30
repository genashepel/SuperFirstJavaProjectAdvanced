package helpUtilites;

import homework_7.Director7_1;
import homework_7.Employee7_1;
import homework_7.Manager7_1;

import java.util.ArrayList;
import java.util.List;

public class HelpUtilites {

    public static  void printLine(){
        System.out.println("____________________________________________");
    }

    public static  List <Employee7_1> findNameFromName(Employee7_1[] arr, String name){
        if(arr == null || name == null){
            return null;
        }
        List<Employee7_1> listOfEmployee = new ArrayList<>();
        for (Employee7_1 list : listOfEmployee){
            if(list.getName().contains(name)){
                listOfEmployee.add(list);
            }
        }
        return listOfEmployee;
    }

    public static  List <Employee7_1> findNameFromSubString(Employee7_1[] arr, String subString){
        if(arr == null || subString == null){
            return null;
        }
        List<Employee7_1> listOfEmployee = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().contains(subString)){
                listOfEmployee.add(arr[i]);
            }
        }
        return listOfEmployee;
    }

    public static  List <Manager7_1> findNameFromSubString(Manager7_1[] arr, String subString){

        if(arr == null || subString == null || subString.equals("")){
            return null;
        }
        List<Manager7_1> listOfManager = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().contains(subString)){
                listOfManager.add(arr[i]);
            }
        }
        return listOfManager;
    }

    public static  int sumSalaryOfAllEmployee(Employee7_1[] arr){
        int sum = 0;
        if(arr == null){
            return  sum;
        }

        for(Employee7_1 arrOfEmployee : arr){
            sum = sum + arrOfEmployee.getSalary();
        }
        return sum;
    }
    public static  int sumSalaryOfAllEmployee(Manager7_1[] arr){
        int sum = 0;
        if(arr == null){
            return  sum;
        }

        for(Manager7_1 arrOfEmployee : arr){
            sum = sum + arrOfEmployee.getSalary();
        }
        return sum;
    }
    public static  int sumSalaryOfAllEmployee(Director7_1[] arr){
        int sum = 0;
        if(arr == null){
            return  sum;
        }

        for(Director7_1 arrOfEmployee : arr){
            sum = sum + arrOfEmployee.getSalary();
        }
        return sum;
    }

    public  static int returnSmallestSalary(Employee7_1[] arr){
        int smallestSalary = 0;
        if(arr == null){
            return smallestSalary;
        }

        smallestSalary = arr[0].getSalary();
        for(Employee7_1 arrOfEmployee : arr){
            if(arrOfEmployee.getSalary() < smallestSalary){
                smallestSalary = arrOfEmployee.getSalary();
            }
        }
        return smallestSalary;
    }
    public  static int returnSmallestSalary(Manager7_1[] arr){
        int smallestSalary = 0;
        if(arr == null){
            return smallestSalary;
        }

        smallestSalary = arr[0].getSalary();
        for(Manager7_1 arrOfEmployee : arr){
            if(arrOfEmployee.getSalary() < smallestSalary){
                smallestSalary = arrOfEmployee.getSalary();
            }
        }
        return smallestSalary;
    }
    public  static int returnSmallestSalary(Director7_1[] arr){
        int smallestSalary = 0;
        if(arr == null){
            return smallestSalary;
        }

        smallestSalary = arr[0].getSalary();
        for(Director7_1 arrOfEmployee : arr){
            if(arrOfEmployee.getSalary() < smallestSalary){
                smallestSalary = arrOfEmployee.getSalary();
            }
        }
        return smallestSalary;
    }

    public  static int returnBiggestSalary(Employee7_1[] arr){
        int biggestSalary = 0;
        if(arr == null){
            return biggestSalary;
        }

        biggestSalary = arr[0].getSalary();

        for(Employee7_1 arrOfEmployee : arr){
            if(arrOfEmployee.getSalary() > biggestSalary){
                biggestSalary = arrOfEmployee.getSalary();
            }
        }
        return biggestSalary;
    }
    public  static int returnBiggestSalary(Manager7_1[] arr){
        int biggestSalary = 0;
        if(arr == null){
            return biggestSalary;
        }

        biggestSalary = arr[0].getSalary();
        for(Manager7_1 arrOfEmployee : arr){
            if(arrOfEmployee.getSalary() > biggestSalary){
                biggestSalary = arrOfEmployee.getSalary();
            }
        }
        return biggestSalary;
    }
    public  static int returnBiggestSalary(Director7_1[] arr){
        int biggestSalary = 0;
        if(arr == null){
            return biggestSalary;
        }

        biggestSalary = arr[0].getSalary();
        for(Director7_1 arrOfEmployee : arr){
            if(arrOfEmployee.getSalary() > biggestSalary){
                biggestSalary = arrOfEmployee.getSalary();
            }
        }
        return biggestSalary;
    }

    public static int returnSmallestEmployeeFromManager(Manager7_1[] arr){
        int result = 0;
        if(arr == null){
            return result;
        }
        result = arr[0].getNumberOfSubordinates();
        for(Manager7_1 resultArr : arr){
            if(result > resultArr.getNumberOfSubordinates() ){
                result = resultArr.getNumberOfSubordinates();
            }
        }
        return result;
    }

    public static int returnBiggestEmployeeFromManager(Manager7_1[] arr){
        int result = 0;
        if(arr == null){
            return result;
        }
        result = arr[0].getNumberOfSubordinates();
        for(Manager7_1 resultArr : arr){
            if(result < resultArr.getNumberOfSubordinates() ){
                result = resultArr.getNumberOfSubordinates();
            }
        }
        return result;
    }

    public static  int searchHighestMarkup(Manager7_1[] arr){
        int result = 0;
        if (arr == null){
            return result;
        }
        result = arr[0].getSalary() - arr[0].getBaseSalary();
        for(Manager7_1 arrOfManagers : arr){
            if(result < arrOfManagers.getSalary() - arrOfManagers.getBaseSalary()){
                result = arrOfManagers.getSalary() - arrOfManagers.getBaseSalary();
            }
        }
        return result;
    }
    public static  int searchLowersttMarkup(Manager7_1[] arr){
        int result = 0;
        if (arr == null){
            return result;
        }
        result = arr[0].getSalary() - arr[0].getBaseSalary();
        for(Manager7_1 arrOfManagers : arr){
            if(result > arrOfManagers.getSalary() - arrOfManagers.getBaseSalary()){
                result = arrOfManagers.getSalary() - arrOfManagers.getBaseSalary();
            }
        }
        return result;
    }
}
