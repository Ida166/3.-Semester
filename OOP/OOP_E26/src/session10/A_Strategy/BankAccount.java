package session10.A_Strategy;

/**
 * A bank account that holds its interest as a strategy. It gets an
 * InterestStrategy in its constructor, and BankAccount.accrueInterest hands
 * the calculation to it, so the same class serves every kind of account.
 */
public class BankAccount {

    private double balance;
    private InterestStrategy interestStrategy;
    private AccountFeeStrategy accountFeeStrategy;

    public BankAccount(double balance, InterestStrategy interestStrategy, AccountFeeStrategy accountFeeStrategy) {
        this.balance = balance;
        this.interestStrategy = interestStrategy;
        this.accountFeeStrategy = accountFeeStrategy;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void accrueInterest() {
        this.balance = this.balance + interestStrategy.calculateInterest(this.balance);
    }

    public void applyFee() { this.balance = this.balance + accountFeeStrategy.calculateFee(); }
}
