package jday10_array_list_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5));
        list.removeIf(character -> list.indexOf(character) != list.lastIndexOf(character));
        System.out.println(list);
    }
}
