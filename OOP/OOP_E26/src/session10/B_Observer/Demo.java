package session10.B_Observer;

/**
 * One BankStatistics listens to two accounts, and adds up what is deposited
 * in both.
 */
public class Demo {

    public static void main(String[] args) {
        BankStatistics bankStatistics = new BankStatistics();
        SkatMonitor skatMonitor = new SkatMonitor();

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.addListener(bankStatistics);
        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.addListener(bankStatistics);

        System.out.println("Total Bank Balance: " + bankStatistics.getTotalBankBalance());

        bankAccount1.deposit(1000);
        bankAccount2.deposit(3000);

        System.out.println("Total Bank Balance: " + bankStatistics.getTotalBankBalance());

        // --- EXERCISE B --------------------------------------------------
        // See EXERCISES.md. A third account, with a SkatMonitor, goes here.
        BankAccount bankAccount3 = new BankAccount();
        bankAccount3.addListener(bankStatistics);
        bankAccount3.addListener(skatMonitor);
        bankAccount3.deposit(500000);
        bankAccount3.deposit(1500000);
        bankAccount3.deposit(50000);

        System.out.println("Total Bank Balance: " + bankStatistics.getTotalBankBalance());
    }
}
