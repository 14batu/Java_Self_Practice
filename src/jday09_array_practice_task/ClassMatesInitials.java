package jday09_array_practice_task;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {

        String[] classmate = {"Batuhan","Emir","Aysun","Zulfiye","Ergin","Mustafa","Ahmet","Koray","Zeytin","John"};
        String[] initial = new String[classmate.length];


        System.out.println(Arrays.toString(classmate));

        for (int i = 0; i < classmate.length; i++) {
            initial[i] = classmate[i].charAt(0) + ".";
        }
        System.out.println(Arrays.toString(initial));

    }
}

/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */
