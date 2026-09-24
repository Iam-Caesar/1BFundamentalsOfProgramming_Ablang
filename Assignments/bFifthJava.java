import java.util.Scanner;
import java.util.InputMismatchException; // Import specific exception

public class bFifthJava {
    public static void main(String[] args) {

        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);

        try
        {
            System.out.print("Please enter your name:");
            name = inputDevice.nextLine();

            System.out.print("Please enter your age:");
            age = inputDevice.nextInt();

            System.out.println("Your name is " + name + " and you are " + age + " years old.");

        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: Age must be a number.");
        }
        finally
        {
            inputDevice.close();
        }
    }
}