package session10.B_Observer;

public class SkatMonitor implements AccountListener {
    @Override
    public void balanceChanged(double oldBalance, double newBalance) {
        double difference = newBalance - oldBalance;
        if(difference> 1000000){
            System.out.println( "SKAT alert: a deposit of " + difference + " kr.");
        }
    }
}
