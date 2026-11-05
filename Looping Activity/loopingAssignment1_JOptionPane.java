import javax.swing.*;

public class loopingAssignment1_JOptionPane {
        public static void main (String[] args) {

            int maxNumber = Integer.MIN_VALUE;
            int leastNumber = Integer.MAX_VALUE;
            int dynamicNumber;

            for (int i = 1; i <= 10; i++) {
                dynamicNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter number " + i + ":"));

                if (dynamicNumber > maxNumber) {
                    maxNumber = dynamicNumber;
                }

                if (dynamicNumber < leastNumber) {
                    leastNumber = dynamicNumber;
                }
            }

            String output = String.format("""
                    HIGHEST NUMBER: %d
                    LOWEST NUMBER: %d
                    """, maxNumber, leastNumber);

            JOptionPane.showMessageDialog(null,output,"SUCCESS!",JOptionPane.INFORMATION_MESSAGE);
        }


    }
