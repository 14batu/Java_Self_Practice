package additional_week_tasks;
import java.util.Scanner;

public class CoffeeOrderApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double blackCoffeePrice = 5.6;
        double lattePrice = 6.2;
        double cappuccinoPrice = 5.2;
        double totalPrice = 0;

        while (true) {
            System.out.println("\tWelcome to the Coffee Order App!" + "\nWould you like to order coffee? (yes/no)");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("yes")) {
                while (true) {
                    System.out.println("\t\t\tCoffee Options:\n" +
                            "\t\t\t\t1. Black Coffee - $" + blackCoffeePrice + "\n" +
                            "\t\t\t\t2. Latte - $" + lattePrice + "\n" +
                            "\t\t\t\t3. Cappuccino - $" + cappuccinoPrice + "\n");
                    System.out.println("Select your coffee (1, 2, or 3): ");
                    String userCoffeeChoose = scanner.nextLine();

                    switch (userCoffeeChoose) {
                        case "1":
                            System.out.println("Added Black Coffee to Your Order.");
                            totalPrice += blackCoffeePrice;
                            break;
                        case "2":
                            System.out.println("Added Latte to Your Order.");
                            totalPrice += lattePrice;
                            break;
                        case "3":
                            System.out.println("Added Cappuccino to Your Order.");
                            totalPrice += cappuccinoPrice;
                            break;
                        default:
                            System.out.println("Invalid selection. Please choose 1, 2, or 3.");
                            continue;
                    }

                    System.out.println("Do you want to add another coffee to your order? (yes/no)");
                    String anotherCoffeeAsk = scanner.nextLine();

                    if (anotherCoffeeAsk.equalsIgnoreCase("no")) {
                        System.out.println("Your total is: $" + totalPrice);
                        return;
                    } else if (!anotherCoffeeAsk.equalsIgnoreCase("yes")) {
                        System.out.println("Invalid response. Please answer yes or no.");
                    }
                }
            } else if (userInput.equalsIgnoreCase("no")) {
                System.out.println("Thanks for using our service!");
                return;
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no':");
            }
        }
    }
}


/*

2. Create a class named CoffeeOrderApp with the following variables:

        - blackCoffeePrice: the price of black coffee
        - lattePrice: the price of a latte
        - cappuccinoPrice: the price of a cappuccino
        - totalPrice: the total cost of the user's order

    Create a straightforward coffee ordering application with these steps:

        Step 1. Ask the user if they want to order coffee.

            	Welcome to the Coffee Order App!

            Would you like to order coffee?


            If they say "yes", proceed to step #2. If they say "no", display "Thanks for using our service!"

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

        Step 2. Display the coffee options on the console:

            Coffee Options:
                1. Black Coffee - $blackCoffeePrice
                2. Latte - $lattePrice
                3. Cappuccino - $cappuccinoPrice

        Step 3. Ask the user to pick a coffee:

            3.1 If they choose 1, display "Added Black Coffee to Your Order."

            3.2 If they choose 2, display "Added Latte to Your Order."

            3.3 If they choose 3, display "Added Cappuccino to Your Order."

            3.4 If their choice is invalid, the application should ask the user to re-enter until the user provides a valid entry.


        Step 4. Ask if they want another order:

            If they say "yes," repeat from step #2.

            If they say "no," display the total cost of their order: "Your total is: $total."

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

 */
