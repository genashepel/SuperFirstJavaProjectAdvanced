package helpUtilites;

import homework_7.Employee7_1;
import homework_7.Manager7_1;

import java.util.ArrayList;
import java.util.List;

public class HelpUtilites {

    public static  void printLine(){
        System.out.println("____________________________________________");
    }

     public static Employee7_1 findNameFromName(Employee7_1[] arr, String name){
        Employee7_1 returnEmployee = null;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().equals(name)){
                returnEmployee = arr[i];
            }
        }
        return returnEmployee;
    }

    public static  List <Employee7_1> findNameFromSubString(Employee7_1[] arr, String subString){
        //Employee7_1 returnEmployee = null;
        List<Employee7_1> listOfEmployee = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().contains(subString)){
                listOfEmployee.add(arr[i]);
            }
        }
        return listOfEmployee;
    }

    public static  List <Manager7_1> findNameFromSubString(Manager7_1[] arr, String subString){

        List<Manager7_1> listOfManager = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().contains(subString)){
                listOfManager.add(arr[i]);
            }
        }
        return listOfManager;
    }
}
