package Assignment1;

public class Expense {

    private char expenseType;
    private Flatmate expensePayer;
    private int expenseAmount;
    private String expenseDescription;

    public Expense(char type, Flatmate payerName, int amount, String description) {
        this.expenseType = type;
        this.expensePayer = payerName;
        this.expenseAmount = amount;
        this.expenseDescription = description;
    }

    /** How an expense of this type is split, for the printed lines. */
    protected static String typeName(char type) {
        switch (type) {
            case 'E':
                return "split equally";
            case 'P':
                return "for one flatmate";
            case 'R':
                return "split by room size";
            default:
                return "?";
        }
    }

    /** One expense of the history as a line of text. */
    String expenseLine() {
        return expensePayer.getName() + " paid " + expenseAmount + " kr: "
                + expenseDescription + " (" + typeName(expenseType) + ")";
    }
}
