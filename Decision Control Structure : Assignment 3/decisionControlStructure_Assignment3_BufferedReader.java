import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class decisionControlStructure_Assignment3_BufferedReader {
    public static void main (String[] args){
        BufferedReader scholarship = new BufferedReader(new InputStreamReader(System.in));
        int parentSalary;
        int NSAT;
        int entranceExam;

        try{
            System.out.print("Please enter your parent's monthly salary: ");
            parentSalary = Integer.parseInt(scholarship.readLine());

            System.out.print("Please enter NSAT score: ");
            NSAT = Integer.parseInt(scholarship.readLine());

            System.out.print("Please enter your entrance exam score: ");
            entranceExam = Integer.parseInt(scholarship.readLine());

            if(parentSalary > 10000 || NSAT < 90 || entranceExam < 85){
                System.out.println("Your application is REJECTED.");
            }else if (parentSalary <= 3500 && ((NSAT+entranceExam)/2) >= 91){
                System.out.println("Congratulations! Your applications is ACCEPTED!");
            }else{
                System.out.println("Your application is submitted for further study.");
            }

        }catch(IOException | NumberFormatException e){
            System.out.print("Please try again.");}

    }
}
