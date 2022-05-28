package helpUtilites;

import homework_7.Employee7_1;

public class HelpUtilites {

    public static  void printLine(){
        System.out.println("____________________________");
    }

     public static Employee7_1 findNameArrays(Employee7_1[] arr, String name){
        Employee7_1 returnEmployee = null;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().equals(name)){
                returnEmployee = arr[i];
            }
        }
        return returnEmployee;
    }
}
