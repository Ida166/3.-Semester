package session9.B_CustomExceptions;

public class LargeDepositException extends RuntimeException {

    private int amount;

    public LargeDepositException(int Amount) {
        //Because LargeDepositException extends RuntimeException, it inherits functionality from RuntimeException
        super("You must justify the origin of 250000 kr.");
        this.amount = Amount;
    }

    public int getAmount() {
        return amount;
    }
}
