import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loopingAssignment3_bufferedReader {
    public static void main (String [] args) throws IOException {
        BufferedReader bank = new BufferedReader(new InputStreamReader(System.in));
        int initial = 20000;
        int addMinus;

        System.out.printf("""
                Please enter transaction.
                Positive number = DEPOSIT.
                Negative number = WITHDRAW.
                Enter "0" to end the transaction.
                CURRENT BALANCE: %d \n""", initial);

        do {
            System.out.print("AMOUNT: ");
            addMinus = Integer.parseInt(bank.readLine());

            if (addMinus > 0){
                initial = initial + addMinus;
                System.out.println("CURRENT BALANCE: " + initial);
            }

            if (addMinus < 0) {
                if (initial + addMinus >= 0) {
                    initial = initial + addMinus;
                    System.out.println("CURRENT BALANCE: " + initial);
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

        } while (addMinus != 0);

    }
}
