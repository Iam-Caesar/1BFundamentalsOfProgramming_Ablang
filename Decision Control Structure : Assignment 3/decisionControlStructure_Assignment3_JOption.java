import javax.swing.JOptionPane;

public class decisionControlStructure_Assignment3_JOption {
    public static void main (String[] args){
        int parentSalary;
        int NSAT;
        int entranceExam;

        try{
            parentSalary = Integer.parseInt(JOptionPane.showInputDialog("Please enter your parent's salary: "));
            NSAT = Integer.parseInt(JOptionPane.showInputDialog("Please enter your NSAT score: "));
            entranceExam = Integer.parseInt(JOptionPane.showInputDialog("Please enter your entrance exam score: "));

            if(parentSalary > 10000 || NSAT < 90 || entranceExam < 85){
                JOptionPane.showMessageDialog(null,"Your application is REJECTED.");
            }else if (parentSalary <= 3500 && ((NSAT+entranceExam)/2) >= 91){
                JOptionPane.showMessageDialog(null,"Congratulations! Your applications is ACCEPTED!");
            }else{
                JOptionPane.showMessageDialog(null,"Your application is submitted for further study.");
            }

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Please try again.");
        }
    }
}
