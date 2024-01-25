package additional_week_tasks;
import java.util.Scanner;

public class RoomReservationApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\t\t\tWelcome to the Cydeo Skyline Inn!\n"+ "Agent : Would you like to reserve a room? (Yes/No)");
            String userInput = scanner.next().trim();
            if (userInput.equalsIgnoreCase("yes")){
                    int totalCost = 0;
                    System.out.println("Agent : What is your name: ");
                    String userName = scanner.next();
                    System.out.println("Agent : What is your Last name: ");
                    String userLastName = scanner.next();
                    System.out.println("Agent : What is your age: ");
                    int userAge = scanner.nextInt();
                    System.out.println("\t\t\t\t\t\t Choose room type : \n"+
                            "\t\t\t\t\t\t Single Bed ==> $100\n" +
                            "\t\t\t\t\t\t Queen Bed  ==> $120\n" +
                            "\t\t\t\t\t\t King Bed   ==> $160");
                    String roomType = scanner.next().toLowerCase();
                    System.out.println("Agent : How money day will you be staying ? ");
                    int userStayDay = scanner.nextInt();
                    System.out.println("Agent : Are you Veteran (yes/no) ");
                    String veteranStatus = scanner.next();

                    switch (roomType){
                        case "single" -> totalCost = 100 * userStayDay;
                        case "queen" -> totalCost = 120 * userStayDay;
                        case "king" -> totalCost = 160 * userStayDay;
                        default -> totalCost = 0;
                    }
                    if (userAge >= 64){
                        totalCost = (totalCost - (totalCost * 10 / 100));
                        System.out.println("You are eligible for a senior discount (10%).");
                    }
                    if (veteranStatus == "yes"){
                        totalCost = (totalCost - (totalCost * 15 / 100));
                        System.out.println("You are eligible for a Veteran discount (15%).");
                    }
                System.out.println("\t\t\t\t\t\tHello "+ userName + ","+ "You have selected " + roomType + "Bed for " + userStayDay + " nights to stay.\n" +
                        "\t\t\t\t\t\tRoom fee: $" + totalCost +"\n" +
                        "\t\t\t\t\t\tTax is: $"+ totalCost * 0.08+"\n" +
                        "\n" +
                        "\t\t\t\t\t\tYour grand total is: $" + (totalCost + (totalCost * 0.08)));
                    return;

            } else if (userInput.equalsIgnoreCase("no")) {
                System.out.println("You have a wonderful day!");
                return;
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no':");
            }
        }


    }
}

/*
Create a class named RoomReservationApplication and write a program with the following requirements:

	1. Display the following welcome message on the console:
			"Welcome to the Cydeo Skyline Inn!"

	2. Ask the user, "Would you like to reserve a room? (Yes/No)"

	3. If the user enters "No," then display the following message:


	4. the user enters "Yes," then gather the following information:
		4.1 Ask the user's first name
		4.2 Ask the user's last name
		4.3 Ask the user's age
		4.4 Display the available room types and ask which type of room the user would like to reserve
		4.5 Ask how many nights the user wants to stay
		4.6 Ask if the user is a veteran

	5. For any other inputs, the application should ask the user to re-enter until the user provides a valid entry.

	6. Calculate the total price based on the selected room type and the number of nights the user is staying.
	Room types and their prices:
						Single Bed ==> $100
						Queen Bed  ==> $120
						King Bed   ==> $160

	7. Calculate the tax and grand total, assuming the sales tax is 8%.

	8. Calculate the total discount the user is eligible for:
		If the user is a senior (at least 64 years old), they are eligible for a senior discount (10%).
		If the user is a veteran, they are eligible for a veterans discount (15%).

	9. Display the user's first name, total cost, tax, total discounts, and grand total in the following format on the console:

				Example 1:
								Welcome to the Cydeo Skyline Inn!

					Agent: Would you like to reserve a room? (Yes/No)
					User: No

					Output:
						You have a wonderful day!


				Example 2:
								Welcome to the Cydeo Skyline Inn!

					Agent: Would you like to reserve a room? (Yes/No)
					User: Yes

					Agent: Please enter your first name:
					User: Jimmy

					Agent: Please enter your last name:
					User: Joe

					Agent: Please enter your age:
					User: 55

					Agent: Here are our available rooms and their prices:
									 King Bed   ===== $160
									 Queen Bed  ===== $120
									 Single Bed ===== $100

							Which room would you like to reserve? (King/Queen/Single)
					User: King

					Agent: How many nights would you like to stay?
					User: 3

					Agent: Are you a veteran? (Yes/No)
					User: No

					Output:
						Hello Jimmy, You have selected King Bed for 3 nights to stay.
						Room fee: $480.00
						Tax is: $38.40

						Your grand total is: $518.40


 */
