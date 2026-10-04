import javax.swing.JOptionPane;

public class decisionControlStructure_Assignment2_JOption {
    public static void main (String[] args){
        double hourlyPayRate;
        double hoursWorked;
        try{
            hourlyPayRate = Double.parseDouble(JOptionPane.showInputDialog("Enter your hourly pay: "));

            hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter your hours worked: "));

            double grossPay = hourlyPayRate*hoursWorked;

            if(grossPay <= 2000.00){
                JOptionPane.showMessageDialog(null,"Your gross pay is: " + grossPay + ". The withholding tax amounts to " + (grossPay*0.10) + ". Your net pay is " + (grossPay-(grossPay*0.10)) + ".");
            } else if (grossPay <= 4000.00){
                JOptionPane.showMessageDialog(null,"Your gross pay is: " + grossPay + ". The withholding tax amounts to " + (grossPay*0.12) + ". Your net pay is " + (grossPay-(grossPay*0.12)) + ".");
            } else if (grossPay <= 10000.00){
                JOptionPane.showMessageDialog(null,"Your gross pay is: " + grossPay + ". The withholding tax amounts to " + (grossPay*0.15) + ". Your net pay is " + (grossPay-(grossPay*0.15)) + ".");
            } else{
                JOptionPane.showMessageDialog(null,"Your gross pay is: " + grossPay + ". The withholding tax amounts to " + (grossPay*0.20) + ". Your net pay is " + (grossPay-(grossPay*0.20)) + ".");
            }

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error. Please try again.");
        }
    }
}
