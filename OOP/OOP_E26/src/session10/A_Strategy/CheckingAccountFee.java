package session10.A_Strategy;

public class CheckingAccountFee implements AccountFeeStrategy {
    @Override
    public double calculateFee() {
        return - 200;
    }
}
