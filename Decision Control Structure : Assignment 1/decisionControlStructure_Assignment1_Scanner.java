import java.util.Scanner;
import java.util.InputMismatchException;

public class decisionControlStructure_Assignment1_Scanner {
    public static void main (String[]args){
        int year;
        Scanner inputYear = new Scanner(System.in);

        try{
            System.out.print("Please enter the year: ");
            year = inputYear.nextInt();

            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.print("LEAP YEAR!");
            }
            else{
                System.out.print("NOT A LEAP YEAR!");
            }
        }
        catch (InputMismatchException e) {
            System.out.print("Error! Please enter a year!");
        }
        finally {
            inputYear.close();
        }
    }
}
