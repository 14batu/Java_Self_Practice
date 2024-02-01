package jday10_array_list_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.addAll(list);

        System.out.println(list);
    }
}
