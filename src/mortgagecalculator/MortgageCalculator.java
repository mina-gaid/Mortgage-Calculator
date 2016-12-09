package mortgagecalculator;

public class MortgageCalculator {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MortgageEntryUI().setVisible(true);
            }
        });
    }
    
}
