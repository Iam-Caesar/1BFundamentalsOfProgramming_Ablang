public class arraysAssignment2 { // pangalan ng program
    public static void main (String [] args) { // main method ng program
        double temperatures[] = new double[5]; // pag initialize ng array na may limang 'container'
        temperatures[0] = 32.5; // paglagay ng value sa index 0
        temperatures[1] = 34.0; // paglagay ng value sa index 1
        temperatures[2] = 31.8; // paglagay ng value sa index 2
        temperatures[3] = 33.2; // paglagay ng value sa index 3
        temperatures[4] = 35.1; // paglagay ng value sa index 4

        for (int i = 0; i < temperatures.length; i++){ // pag set up ng for loop, ibabangga natin sa length ng array (bilang ng containers sa aray) yung counting ng for loop para
            // sakto sa bilang ng index
            System.out.println("Day " + (i+1) + " temperature: " + temperatures[i]); // printing ng day to day temperature galing sa mga nilagay dineclare nating value ng mga
            // index
        } // closing ng for block
        temperatures[2] = 32.0; // pagpalit ng value ng index 2
        System.out.println(); // lipat lang yung line para sa susunod na line yung pag print ng next para malinis tignan
        System.out.print("Updated Day 3 temperature: " + temperatures[2]); // pag print ng updated na index 2 (temperature day 3)

    } // close ng main method
} // end ng program
