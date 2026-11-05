import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class loopingAssignment2_bufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader hello = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter \"START\": ");
        String start = hello.readLine();

        if (start.equalsIgnoreCase("start")){
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
        } else {
                System.out.println("Goodbye. :)");
        }
    }
}