import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class decisionControlStructure_Assignment2_BufferedReader {
    public static void main (String[] args){
        BufferedReader salaryReader = new BufferedReader(new InputStreamReader(System.in));
        double hourlyPayRate;
        double hoursWorked;
        try{
            System.out.print("Enter your hourly pay: ");
            hourlyPayRate = Integer.parseInt(salaryReader.readLine());

            System.out.print("Enter your hours worked: ");
            hoursWorked = Integer.parseInt(salaryReader.readLine());

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

        }catch (IOException | NumberFormatException e){
            System.out.print("Error. Please try again.");
        }

    }
}
