import java.util.Scanner;
import java.util.InputMismatchException;

public class decisionControlStructure_Assignment2_Scanner {
    public static void main (String[] args){
        Scanner readSalary = new Scanner(System.in);
        double hourlyPayRate;
        double hoursWorked;
        try{
            System.out.print("Enter your hourly pay: ");
            hourlyPayRate = (readSalary.nextDouble());

            System.out.print("Enter your hours worked: ");
            hoursWorked = (readSalary.nextDouble());

            double grossPay = hourlyPayRate*hoursWorked;

            if(grossPay <= 2000.00){
                System.out.println("Your gross pay is: " + grossPay + ". the withholding tax amounts to " + (grossPay*0.10) + ". Your net pay is " + (grossPay-(grossPay*0.10)));
            } else if (2001.00 <= grossPay && grossPay <= 4000.00){
                System.out.println("Your gross pay is: " + grossPay + ". the withholding tax amounts to " + (grossPay*0.12) + ". Your net pay is " + (grossPay-(grossPay*0.12)));
            } else if (4001.00 <= grossPay && grossPay <= 10000.00){
                System.out.println("Your gross pay is: " + grossPay + ". the withholding tax amounts to " + (grossPay*0.15) + ". Your net pay is " + (grossPay-(grossPay*0.15)));
            } else{
                System.out.println("Your gross pay is: " + grossPay + ". the withholding tax amounts to " + (grossPay*0.20) + ". Your net pay is " + (grossPay-(grossPay*0.20)));
            }

        }catch (InputMismatchException e){
            System.out.print("Please try again.");
        }
    }
}
