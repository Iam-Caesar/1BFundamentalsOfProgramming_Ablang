import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class decisionControlStructure_Assingment4_BufferedReader {
    public static void main(String[] args) {
        BufferedReader darth = new BufferedReader(new InputStreamReader(System.in));
        String reco;
        String citizen;
        int Age;
        int Height;

        try {
            do {
                System.out.print("RECOMMENDATION CODE: ");
                reco = darth.readLine();

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
                    citizen = darth.readLine();

                    if (!citizen.equalsIgnoreCase("C") && !citizen.equalsIgnoreCase("N")) {
                        System.out.println("Enter correct citizen code. ");
                    }
                }
                while (!citizen.equalsIgnoreCase("C") && !citizen.equalsIgnoreCase("N"));
                System.out.print("HEIGHT (in cm): ");
                Height = Integer.parseInt(darth.readLine());
                System.out.print("AGE: ");
                Age = Integer.parseInt(darth.readLine());

                if (Height >= 200 && Age >= 21 && Age <= 25 && citizen.equalsIgnoreCase("c")) {
                    System.out.print("Accepted.");
                } else {
                    System.out.print("Rejected.");
                }

            }
        } catch (IOException | NumberFormatException e) {
            System.out.print("Please try again.");
        }
    }
}
