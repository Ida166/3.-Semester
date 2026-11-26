package session10.A_Strategy;

public class SavingsAccountFee implements AccountFeeStrategy{
    @Override
    public double calculateFee() {
        return - 100;
    }
}
