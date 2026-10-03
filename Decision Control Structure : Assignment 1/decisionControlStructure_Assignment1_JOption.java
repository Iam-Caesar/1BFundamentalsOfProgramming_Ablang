import javax.swing.JOptionPane;

public class decisionControlStructure_Assignment1_JOption {
    public static void main (String[] args){
        try {
            int year;
            year = Integer.parseInt(JOptionPane.showInputDialog("Please enter the year: "));

            if((year %4 == 0 && year %100 != 0) || (year %400 == 0)){
                JOptionPane.showMessageDialog(null, "LEAP YEAR!");
            }
            else{
                JOptionPane.showMessageDialog(null,"NOT A LEAP YEAR!");
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error! Please enter a year!");
        }
    }
}