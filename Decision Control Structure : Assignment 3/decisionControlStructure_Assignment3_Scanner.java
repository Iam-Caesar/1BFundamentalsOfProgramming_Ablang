import java.util.Scanner;
import java.util.InputMismatchException;

public class decisionControlStructure_Assignment3_Scanner {
    public static void main (String[] args){
        Scanner scholarship = new Scanner(System.in);
        int parentSalary;
        int NSAT;
        int entranceExam;

        try{
            System.out.print("Please enter your parent's monthly salary: ");
            parentSalary = (scholarship.nextInt());
            System.out.print("Please enter your NSAT score: ");
            NSAT = (scholarship.nextInt());
            System.out.print("Please enter your entrance exam score: ");
            entranceExam = (scholarship.nextInt());

            if(parentSalary > 10000 || NSAT < 90 || entranceExam < 85){
                System.out.println("Your application is REJECTED.");
            }else if (parentSalary <= 3500 && ((NSAT+entranceExam)/2) >= 91){
                System.out.println("Congratulations! Your applications is ACCEPTED!");
            }else{
                System.out.println("Your application is submitted for further study.");
            }

        }catch (InputMismatchException e){
            System.out.print("Please try again.");
        }
    }
}
