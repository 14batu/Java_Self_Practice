package jd08_string_practice_task;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Split No Split");
        String splitOrNot = scanner.next().trim();

        if (splitOrNot.equalsIgnoreCase("yes")) {

            System.out.println("Enter the number of people: ");
            int splitOfPeople = scanner.nextInt();

            System.out.println("Enter the check amount : ");
            double checkAmount = scanner.nextDouble();

            System.out.println("How was the service quality (Excellent/Great/Good/Fair/Poor)");
            String serviceQuality = scanner.next();

            scanner.close();

            calculation(splitOfPeople, checkAmount, serviceQuality);

        } else if (splitOrNot.equalsIgnoreCase("no")) {
            System.out.println("thank you so much");

        } else {
            return;
        }
    }

    public static void calculation(int splitPeople, double check, String quality) {
        double excellent = 0.25;
        double great = 0.20;
        double good = 0.15;
        double fair = 0.10;
        double poor = 0.05;
        double totalTip = 0;
        double perPeronTip = 0;
        double totalPerPerson = 0;
        double totalPay = 0;

        if (quality.equalsIgnoreCase("excellent")) {
            totalTip = (check * excellent);
            totalPay = totalTip + check;
            perPeronTip = totalTip / splitPeople;
            totalPerPerson = totalPay / splitPeople;
        } else if (quality.equalsIgnoreCase("great")) {
            totalTip = (check * great);
            totalPay = totalTip + check;
            perPeronTip = totalTip / splitPeople;
            totalPerPerson = totalPay / splitPeople;
        } else if (quality.equalsIgnoreCase("good")) {
            totalTip = (check * good);
            totalPay = totalTip + check;
            perPeronTip = totalTip / splitPeople;
            totalPerPerson = totalPay / splitPeople;
        } else if (quality.equalsIgnoreCase("fair")) {
            totalTip = (check * fair);
            totalPay = totalTip + check;
            perPeronTip = totalTip / splitPeople;
            totalPerPerson = totalPay / splitPeople;
        } else if (quality.equalsIgnoreCase("poor")) {
            totalTip = (check * poor);
            totalPay = totalTip + check;
            perPeronTip = totalTip / splitPeople;
            totalPerPerson = totalPay / splitPeople;
        }

        System.out.println("Number of people : " + splitPeople + "\n" + "Total to pay : " + totalPay + "\n" + "Total Tip : " + totalTip + "\n" + "Total per person : " + totalPerPerson + "\n" + "Tip per person : " + perPeronTip);
    }
}

