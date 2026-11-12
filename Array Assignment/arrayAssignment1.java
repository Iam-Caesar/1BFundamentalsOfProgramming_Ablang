    import java.util.Arrays; // import ng Arrays utility para gamitin sa program

    public class arrayAssignment1 { // Pangalan ng program (starting class ng program na ito)
        public static void main (String [] args){ // Dito magsisimula ang pag execute ng program
            String [][]seats = { // Pag initialize ng 2D array. Gumamit tayo ng dalawang [] para mag initialize ng dalawa.
                    {"Alice", "Bob", "Charlie"}, // nilagyan natin ng pangalan ang row 1
                    {"David", "Emma", "Frank"} // nilagyan nating ng pangalan ang row 2
            }; // sinasara ang array block
            System.out.println("Second row, third column: " + seats[1][2]); // ipriprint natin ang second row, third column na si Frank
            seats[0][1] = "Vacant"; // papalitan natin ang value ng [0][1] "Bob" at gagawing Vacant
            System.out.print(Arrays.deepToString(seats)); // ipri-print lahat ng Array sa isang line, gagamit tayo ng Arrays.deeptoString para mabasa ang 2D array.

        } // close ng main method
    } // end ng program
