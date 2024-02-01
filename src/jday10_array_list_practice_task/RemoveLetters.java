package jday10_array_list_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$','A','B','1','c','d','@','!','3','4'));
        list.removeIf(character -> Character.isLetter(character));
        System.out.print(list);
    }
}
