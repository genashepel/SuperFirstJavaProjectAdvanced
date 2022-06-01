package homeWork_13;

import java.util.*;

public class Main_HW13 {
    public static void main(String[] args) {

        List<String> collors = new ArrayList<>();
        collors.add("White.");
        collors.add("Tan.");
        collors.add("Yellow.");
        collors.add("Black.");
        collors.add("Orange.");
        collors.add("Red.");
        collors.add("Pink.");
        collors.add("Black");
        collors.add("Purple.");
        collors.add("Blue.");


       //ArrayList<String> collors2 = new ArrayList<>(Arrays.asList("White", "Tan"));
        System.out.println(collors);
        System.out.println(collors.size());

        //Version1
        for (int i = collors.size(); --i > 0;) {
            if (collors.get(i).toLowerCase().contains("l")) {
                collors.remove(i);
            }
        }

        //Version2
//        for (int i = 0; i < collors.size(); i++) {
//            if (collors.get(i).toLowerCase().contains("l")) {
//                collors.remove(i);
//                i--;
//            }
//        }
        //Version3
//        collors.removeIf(i -> i.toLowerCase().contains("l"));

        System.out.println(collors);
        System.out.println("\n");

        //Task_2
        List <Integer> arrayOfInteger = new ArrayList<>();
        for(int i = 100; i <= 1000; i++) {
            arrayOfInteger.add(i);
        }
        //System.out.println("List from 100 to 1000: " + arrayOfInteger);

//        for(int i = 0; i < arrayOfInteger.size(); i++){
//            if(arrayOfInteger.get(i) % 2 == 0){
//                arrayOfInteger.remove(i);
//                i--;
//            }
//        }
//        System.out.println("List only odd " + arrayOfInteger);

//        //Task_3
//        List <Integer> arrayOfInteger_Task3 = new ArrayList<>();
//        for(int i = 100; i <= 1000; i++) {
//            arrayOfInteger_Task3.add(i);
//        }
//        System.out.println("List from 100 to 1000: " + arrayOfInteger_Task3);
//        System.out.println(arrayOfInteger_Task3.size());
//
//        for(int i = 0; i < arrayOfInteger_Task3.size(); i++){
//            if(arrayOfInteger_Task3.get(i) % 2 != 0){
//                arrayOfInteger_Task3.remove(i);
//                //i--;
//            }
//        }
//        System.out.println("List only odd " + arrayOfInteger_Task3);


        List<Integer> toRemove = new ArrayList();

        for(Integer i = 0; i < arrayOfInteger.size(); i++){
            if(arrayOfInteger.get(i) % 2 == 0) {
                toRemove.add(arrayOfInteger.get(i));
            }
        }
        arrayOfInteger.removeAll(toRemove);
        System.out.println(arrayOfInteger);


    }

}