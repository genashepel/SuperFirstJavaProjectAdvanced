package homeWork_13;

import java.util.*;

public class Main_HW13 {
    public static void main(String[] args) {

        List<String> collors = new ArrayList();
        collors.add("White");
        collors.add("Tan");
        collors.add("Yellow");
        collors.add("Orange");
        collors.add("Red");
        collors.add("Pink");
        collors.add("Purple");
        collors.add("Blue");

        System.out.println(collors);

        for (int i = 0; i < collors.size(); i++) {
            if (collors.get(i).contains("l") || collors.get(i).contains("L")) {
                collors.remove(i);
            }
        }
        System.out.println(collors);

        //Task_2
        List <Integer> arrayOfInteger = new ArrayList<>();
        for(int i = 100; i <= 1000; i++) {
            arrayOfInteger.add(i);
        }

        System.out.println("List from 100 to 1000: " + arrayOfInteger);

        for(Integer i = 0; i < arrayOfInteger.size(); i++){
            if(arrayOfInteger.get((int)i) % 2 == 0){
                arrayOfInteger.remove((int)i);
            }
        }
        System.out.println("List only odd " + arrayOfInteger);
    }
}
