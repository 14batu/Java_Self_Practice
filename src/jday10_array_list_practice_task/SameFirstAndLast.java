package jday10_array_list_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).toLowerCase().charAt(0) == list.get(i).charAt(list.get(i).length() - 1)) {
                list.remove(list.get(i));
                i--; // this ensures that we don't skip any element
            }
        }

        System.out.println(list); // [Canada, Lan, Ebrahim, Farida]
    }
}
