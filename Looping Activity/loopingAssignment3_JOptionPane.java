import javax.swing.JOptionPane;

public class loopingAssignment3_JOptionPane {
    public static void main(String[] args) {
        int initial = 20000;
        int addMinus;

        JOptionPane.showMessageDialog(null, """
                Please enter transaction.
                Positive number = DEPOSIT.
                Negative number = WITHDRAW.
                Enter "0" to end the transaction.
                """, "INSTRUCTIONS", JOptionPane.INFORMATION_MESSAGE);

        do {
            addMinus = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                    CURRENT BALANCE: %d
                                                                    AMOUNT:
                                                                        """.formatted(initial)));

            if (addMinus > 0) {
                initial = initial + addMinus;
                JOptionPane.showMessageDialog(null, "CURRENT BALANCE: " + initial);
            }

            if (addMinus < 0) {
                if (initial + addMinus >= 0) {
                    initial = initial + addMinus;
                    JOptionPane.showMessageDialog(null, "CURRENT BALANCE: " + initial);
                } else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT BALANCE!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
            }

        } while (addMinus != 0);
        JOptionPane.showMessageDialog(null, "TRANSACTION ENDED", "END", JOptionPane.INFORMATION_MESSAGE);
    }
}