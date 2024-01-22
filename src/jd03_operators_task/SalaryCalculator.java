package jd03_operators_task;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxes = 6; //percentage
        double federalTaxes = 26; //percentage

        double salaryBeforeTax = (hourlyRate * weeklyHours) * 52;
        double stateTax = (salaryBeforeTax * stateTaxes) / 100;
        double federalTax = (salaryBeforeTax * federalTaxes) / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: " + "$" + salaryBeforeTax + "\nFederal tax is: " + "$" + federalTax + "\nState tax is: "
        + "$" + stateTax + "\nTotal tax is: " + "$" + totalTax + "\nNet income is: " + "$" + salaryAfterTax);




    }
}
