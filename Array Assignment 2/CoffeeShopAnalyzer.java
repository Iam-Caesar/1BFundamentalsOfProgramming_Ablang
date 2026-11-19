public class CoffeeShopAnalyzer { // simula ng program
    public static void main (String [] args){ // simula ng main method
        int weeklySales[] = {120, 145, 130, 155, 180, 210, 195}; // pag gawa ng variable para i hold ang data ng weekly sales gamit ng array
        String daysOfWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; // pag gawa ng variable para i hold ang araw ng linggo gamit ng array
        System.out.println("---Daily Sales---"); // pag print ng title para sa data
        for (int i = 0; i < weeklySales.length; i++){ // loop para iprint yung data ng sales na nakatabi sa kung anong araw siya nangyare
         System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]); // pag print ng loop data
        } // pag close ng loop

        int totalSales = 0; // pag initiliize ng total sales variable
        for (int dailySale : weeklySales){ // loop para i add ang daily sales automatically
            totalSales += dailySale;
        } // pag close ng for loop

        double averageSales = (double) totalSales / weeklySales.length; // pag initiliaze ng average sales variable, gumagamit ng double accurate ang printing
        // dinidivide neto ang total sales sa bilang ng araw sa isang linggo (7) gamit ng .lenght
        System.out.println(); // print ng bagong line para maayos yung format ng output
        System.out.println("---Weekly Sales---"); // title ng weekly sales
        System.out.println("Total sales: " + totalSales + " cups"); // paggamit ng totalSales variable para mapakita kung ilan ang total sales
        System.out.println("Average sale: " + averageSales + " cups"); // pag gamit averageSales variable para mapakita kung ilan ang average sales

        int maxSales = weeklySales[0]; // pag initialize ng maxSales variable
        int minSales = weeklySales[0]; // pag initialize ng minSales variable
        String bestDay = daysOfWeek[0]; // pag initialize ng bestDay variable
        String worstDay = daysOfWeek[0]; // pag intialize ng worstDay variable
        // naka default itong mga to sa index 0 by design kasi papalitan to ng value ng mga susunod na loop

        for (int i = 1; i < weeklySales.length; i++){ // pag simula ng loop na ibinabangga sa bilang ng weeklySales gaming ng .lenght
            if(weeklySales[i] > maxSales){ // dito na icocompara yung maxSales value, na kung mas mataas ang weeklySales, yun na ang magiging value ng
                // maxSales, at dahil konektado dito ang araw, iu-update din ang bestDay variable
                maxSales = weeklySales[i]; bestDay = daysOfWeek[i]; // pag update ng maxSales at bestDay
            } // pag close ng if

            if(weeklySales[i] < minSales){ // dito naman sa if na to idedetermine ang minSales at worstDay, kung mas mababa ang minSales sa weeklySales, yun na ang magiging value
                // ng min sales, at dahil konektado dito ang araw, iu-update din ang worstDay value
                minSales = weeklySales[i]; worstDay = daysOfWeek[i]; // pag update ng minSales at worstDay
            } // pag close ng if
        } // pag close ng for loop

        System.out.println("\n--- Bests and Worsts ---"); // pag print ng header ng best and worst days
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups."); // pag print ng data kung anong araw may pinaka malakas na benta
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups."); // pag print ng data kung anong araw ang pinakamahinang benta
    } // pag close ng main method
} // pag close ng program
