package additinoal_tasks_week;
import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pinNumber = 12345;
        double accountBalance = 5000;
        int acceptedAttempt = 0;

        while (acceptedAttempt < 3) {

            System.out.println("Enter your pin number : ");
            int customerPin = scanner.nextInt();

            if (customerPin != pinNumber){
                System.err.println("incorrect Pin number Try again");
                acceptedAttempt++;
            }
            if (customerPin == pinNumber){
                System.out.println("1- Check Balance\n"+"2- Deposit Money\n"+"3- Withdraw Money\n");
                int selectedOption = scanner.nextInt();
                if (selectedOption == 1){
                    checkBalance(accountBalance);
                } else if (selectedOption == 2) {
                    System.out.println("How much Would you like to deposit? : ");
                    double enteredDeposit = scanner.nextDouble();
                    if ( enteredDeposit <= 0){
                        System.err.println("Deposited amount cannot be 0 or negative please try again later.");
                        return;
                    }else {
                        accountBalance += enteredDeposit;
                        checkBalance(accountBalance);
                    }
                } else if (selectedOption == 3) {
                    System.out.println("How much Would you like to Withdraw? : ");
                    double enterWithdraw = scanner.nextDouble();
                    if ( enterWithdraw <= 0){
                        System.err.println("Withdraw amount cannot be 0 or negative please try again later.");
                        return;
                    } else if (enterWithdraw > accountBalance) {
                        System.out.println("Insufficient funds. Withdrawal failed.");
                        return;
                    } else {
                        accountBalance -= enterWithdraw;
                        checkBalance(accountBalance);
                    }

                } else {
                    System.out.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
                }
                return;
            }
        }
        System.out.println("Your card is locked. Please contact with your local bank");
        scanner.close();

    }

    public static void checkBalance(double balance){
        System.out.println("Your current balance is : " + balance);
    }
}
/*
1. Create a class named ATMSimulation. Write a program with the following requirements:

   1. Given the following variables:
      - pinNumber: contains the correct pin number of the card
      - accountBalance: current account balance of the card

   2. Ask the user to enter their pin number.
      If the user-entered pin number does not match the correct pin number, give 2 more attempts for user to re-enter.
      		"Incorrect Pin Number, Please re-enter:"

      If all the attempts are failed, then the program should be terminated with the following error message:
      	"Your card is locked. Please contact with your local bank"

   3. If user entered the valid pin number, Ask the user to select from one of the three following options:
      	3.1 Check Balance:
          Displays the available balance.

      	3.2 Deposit Money:
          Asks the user to enter the amount to deposit and displays the new available balance.

          If the user enters an invalid amount (0 or negative), then the program should
          be terminated with the following error message:
          	"Depositing amount cannot be zero or negative, please try again later."

      	3.3 Withdraw Money:
          Asks the user to enter the amount to withdraw and displays the new available balance.

          If the user enters an invalid amount (0 or negative), then the program should
          be terminated with the following error message:
          	"Cannot withdraw zero or negative amount, please try again later."

          If the user-entered amount is greater than the available balance, then the program
          should be terminated with the following error message:
          	"Insufficient funds. Withdrawal failed."

	   	3.4 If the user does not select one of the three options above, then the following
   			error message should be displayed on the console:
	      		"Invalid choice. Exiting the ATM. Thank you for using our services!"


 */