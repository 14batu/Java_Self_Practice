package jd04_selection_statements_task;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection = 3;

        if (selection == 1) {
            System.out.println("hello, thank you for your call");
        } else if (selection == 2) {
            System.out.println("Hola, gracias por llamar");
        } else if (selection == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (selection == 4) {
            System.out.println("sadsadsadsa");
        } else if (selection == 5) {
            System.out.println("Merci, pour votre appel");
        } else {
            System.out.println("Wrong input");
        }
    }
}
