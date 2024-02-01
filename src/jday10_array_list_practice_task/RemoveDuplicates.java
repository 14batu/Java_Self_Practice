package jday10_array_list_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));

        ArrayList<Integer> list2 = new ArrayList<>();

        for (Integer i : list) {
            if (!list2.contains(i)){
                list2.add(i);
            }
        }

        System.out.println(list2);


    }
}
