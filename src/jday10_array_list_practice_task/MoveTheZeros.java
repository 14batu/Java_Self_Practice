package jday10_array_list_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0){
                list.remove(list.get(i));
                list.add(0);
            }
        }
        System.out.println(list);


    }



}
