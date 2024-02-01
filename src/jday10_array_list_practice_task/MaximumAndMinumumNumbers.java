package jday10_array_list_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaximumAndMinumumNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int maxs = Collections.max(list);
        System.out.println(maxs);

        int min = Collections.min(list);
        System.out.println(min);

    }
}
