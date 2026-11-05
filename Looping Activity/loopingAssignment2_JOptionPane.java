import javax.swing.JOptionPane;

public class loopingAssignment2_JOptionPane {
    public static void main(String[] args) {
        String start = JOptionPane.showInputDialog("Please enter \"START\": ");
        if (start != null && start.equalsIgnoreCase("start")) {
            String message = "";
            for (int i = 2; i <= 100; i += 2) {
                message += i + " ";
                if (i % 20 == 0) {
                    message += "\n";
                }
            }
            JOptionPane.showMessageDialog(null, message,"EVEN NUMBERS",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Goodbye. :)");
        }
    }
}