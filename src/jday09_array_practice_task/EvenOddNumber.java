package jday09_array_practice_task;

public class EvenOddNumber {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,};
        int countOdd = 0;
        int countEven = 0;

        for (int i : array) {

            if (i % 2 == 0){
                countEven++;
            }else {
                countOdd++;
            }
        }
        System.out.println("the array has " + countOdd +" odd numbers and " + countEven + " numbers");

    }
}

/*
3. Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.
 */
