package jday10_array_list_practice_task;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        String isLetter = "";
        String isNumber = "";
        String isUniq = "";


        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)){
                isLetter += c;


            } else if (Character.isDigit(c)) {
                isNumber += c;

            } else {
                isUniq += c ;

            }
        }

        System.out.println("letters: " + isLetter + "\n Digits: " + isNumber + "\n" + "SpecialCharacter: " + isUniq);





    }
}
