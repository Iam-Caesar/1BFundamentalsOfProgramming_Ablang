import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loopingAssignment1_bufferedReader {
    public static void main (String[] args) throws IOException {
        BufferedReader inputNumbers = new BufferedReader(new InputStreamReader(System.in));

        int maxNumber = Integer.MIN_VALUE;
        int leastNumber = Integer.MAX_VALUE;
        int dynamicNumber;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ":");
            dynamicNumber = Integer.parseInt(inputNumbers.readLine());

            if (dynamicNumber > maxNumber) {
                maxNumber = dynamicNumber;
            }

            if (dynamicNumber < leastNumber){
                leastNumber = dynamicNumber;
            }
        }

            System.out.println("");
            System.out.println("HIGHEST NUMBER: " + maxNumber);
            System.out.println("LOWEST NUMBER: " + leastNumber);
        }

    }
