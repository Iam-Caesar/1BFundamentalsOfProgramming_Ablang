import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class decisionControlStructure_Assignment1_BufferedReader {
    public static void main (String[] args){
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in)); // names BufferedReader
        try {
            System.out.print("Please enter the year: ");
            int year = Integer.parseInt(reader1.readLine());

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){ // condition for leap year
                System.out.println("LEAP YEAR!");
            }
            else{
               System.out.println("NOT A LEAP YEAR!");
            }
        }catch (IOException | NumberFormatException e) {
            System.out.print("Error! Please enter a year!");
        }

    }
}
