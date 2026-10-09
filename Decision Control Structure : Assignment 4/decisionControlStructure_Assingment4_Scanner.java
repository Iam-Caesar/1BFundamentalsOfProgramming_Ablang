import java.util.Scanner;
import java.util.InputMismatchException;

public class decisionControlStructure_Assingment4_Scanner {
    public static void main(String[] args) {
        Scanner darth = new Scanner(System.in);
        String reco;
        String citizen;
        int Age;
        int Height;

        try {
            do {
                System.out.print("RECOMMENDATION CODE: ");
                reco = darth.nextLine();

                if (!reco.equalsIgnoreCase("R") && !reco.equalsIgnoreCase("N")) {
                    System.out.println("Enter correct recommendation code.");
                }
            }
            while (!reco.equalsIgnoreCase("R") && !reco.equalsIgnoreCase("N"));
            if (reco.equalsIgnoreCase("r")) {
                System.out.print("Accepted.");
            } else if (reco.equalsIgnoreCase("n")) {
                do {
                    System.out.print("CITIZENSHIP CODE:");
                    citizen = darth.nextLine();

                    if (!citizen.equalsIgnoreCase("C") && !citizen.equalsIgnoreCase("N")) {
                        System.out.println("Enter correct citizen code. ");
                    }
                }
                while (!citizen.equalsIgnoreCase("C") && !citizen.equalsIgnoreCase("N"));
                System.out.print("HEIGHT (in cm): ");
                Height = darth.nextInt();
                System.out.print("AGE: ");
                Age = darth.nextInt();

                if (Height >= 200 && Age >= 21 && Age <= 25 && citizen.equalsIgnoreCase("c")) {
                    System.out.print("Accepted.");
                } else {
                    System.out.print("Rejected.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.print("Please try again.");
        }
    }
}