import javax.swing.JOptionPane;

public class decisionControlStructure_Assingment4_JOption {
    public static void main (String [] args){
        String reco;
        String citizen;
        int Age;
        int Height;

        try {
            do {
                reco =JOptionPane.showInputDialog("RECOMMENDATION CODE: ");

                if (!reco.equalsIgnoreCase("R") && !reco.equalsIgnoreCase("N")) {
                    JOptionPane.showMessageDialog(null, "Enter correct recommendation code.");
                }
            }
            while (!reco.equalsIgnoreCase("R") && !reco.equalsIgnoreCase("N"));
            if (reco.equalsIgnoreCase("r")) {
                JOptionPane.showMessageDialog(null, "Accepted.");
            } else if (reco.equalsIgnoreCase("n")) {
                do {
                    citizen = JOptionPane.showInputDialog("CITIZENSHIP CODE:");

                    if (!citizen.equalsIgnoreCase("C") && !citizen.equalsIgnoreCase("N")) {
                        JOptionPane.showMessageDialog(null,"Enter correct citizen code. ");
                    }
                }
                while (!citizen.equalsIgnoreCase("C") && !citizen.equalsIgnoreCase("N"));
                Height = Integer.parseInt(JOptionPane.showInputDialog("HEIGHT (in cm): "));
                Age = Integer.parseInt(JOptionPane.showInputDialog("AGE: "));

                if (Height >= 200 && Age >= 21 && Age <= 25 && citizen.equalsIgnoreCase("c")) {
                    JOptionPane.showMessageDialog(null,"Accepted.");
                } else {
                    JOptionPane.showMessageDialog(null,"Rejected.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
        }
    }
}

