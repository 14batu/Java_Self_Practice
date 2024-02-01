package jday10_array_list_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipOddNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i < list.size(); i++) {
           int number =  list.get(i);
            if (number % 2 != 0) {

                list.set(i,number * 2);

            }
        }
        System.out.println(list);
    }
}
