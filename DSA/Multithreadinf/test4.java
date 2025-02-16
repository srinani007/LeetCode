package Multithreadinf;

import java.util.List;

public class test4 {
    public void iterateLoop(List<Integer> list){

        // For loop
        for(int i = 0; i < list.size(); i++) System.out.println("For Loop: "+list.get(i));

        // While loop
        int j = 0;
        while(j < list.size()){
            System.out.println("While Loop: "+list.get(j));
            j++;
        }

        // Enhanced for loop
        for(Integer i : list) System.out.println("Enhanced Loop: "+i);
    }

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // Create an object of test4 class
        test4 obj = new test4();

        // Call the iterateLoop method
        obj.iterateLoop(list);
    }


}