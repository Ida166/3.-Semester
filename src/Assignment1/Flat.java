package Assignment1;
import static Assignment1.FlatShare.expensePayers;

public class Flat {

    private int appartmentSquaremeter;

    public Flat(int appartmentSquaremeter){
        this.appartmentSquaremeter = appartmentSquaremeter;
    }
    //Array to hold all the flatmates in the
    private Flatmate[] flatmates = new Flatmate[6];
    private int flatmateCount = 0;


    //Array to hold all the expenses
    private Expense[] expenses = new Expense[20];
    private int expenseCount = 0;

    /** A new flatmate moves in, with a balance of 0. */
    public void moveIn(String name, int roomSize) {

        //Flatmate object is created and stored in the flatmates array
        flatmates[flatmateCount] = new Flatmate(name, roomSize);
        flatmateCount++;
        System.out.println(name + " moves in (" + roomSize + " m2)");
    }

    /**
     * A flatmate moves out. The last flatmate in the arrays moves into the
     * position that is left free, so that there are no gaps.
     */
    public boolean moveOut(String name) {

        int position = findFlatmate(name);
        int balance = flatmates[position].getBalance();

        if(balance != 0){
            System.out.println(name + " cannot move out with a balance of " + balance + " kr");
            return false;
        }

        Flatmate last = flatmates[flatmateCount - 1];
        flatmates[position] = last;

        flatmateCount--;
        System.out.println(name + " moves out");
        return true;
    }

    /** The position of the flatmate with this name, or -1 if there is none. */
    private int findFlatmate(String name) {
        for (int i = 0; i < flatmateCount; i++) {
            if (flatmates[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void addExpense(char type, String payerName, int amount, String description, String forWhom) {

        Flatmate payer = flatmates[findFlatmate(payerName)];

        expenses[expenseCount] = new Expense(type, payer, amount, description);
        System.out.println(expenses[expenseCount].expenseLine());
        expenseCount++;

        switch (type) {
            case 'E':
                splitEqually(payer, amount);
                break;
            case 'P':
                chargeOneFlatmate(payer, flatmates[findFlatmate(forWhom)], amount);
                break;
            case 'R':
                splitRent(payer, amount);
                break;
            default:
                // A type of expense nobody has taught this program to split.
                break;
        }
    }

    /** Everybody in the flat pays the same part, the payer included. */
    private void splitEqually(Flatmate payer, int amount) {

        payer.changeBalance(amount);

        int part = amount / flatmateCount;
        for (int i = 0; i < flatmateCount; i++) {
            flatmates[i].changeBalance(-part);
        }
    }

    /** One flatmate owes the whole amount to the payer. */
    private void chargeOneFlatmate(Flatmate payer, Flatmate chargedPerson, int amount) {
        payer.changeBalance(amount);
        chargedPerson.changeBalance(-amount);
    }

    // Splits the rent according to roomsize
    private void splitRent(Flatmate payer, int amount){
        payer.changeBalance(amount);

        int squareMeterPrise = amount / appartmentSquaremeter;
        for (int i = 0; i < flatmateCount; i++) {
            flatmates[i].changeBalance(- flatmates[i].getRoomSize() * squareMeterPrise);
        }
    }


    /** The balance of every flatmate, and the total. */
    public void printBalances() {
        System.out.println();
        System.out.println("Balances (+ the others owe you money, - you owe the others)");
        int total = 0;
        for (int i = 0; i < flatmateCount; i++) {
            System.out.println("  " + flatmates[i].getName() + ": " + flatmates[i].getBalance() + " kr");
            total = total + flatmates[i].getBalance();
        }
        System.out.println("  Total: " + total + " kr (always 0 when the accounts are right)");
    }

    /** Every expense of the month, in the order they were paid. */
    public void printHistory() {
        System.out.println();
        System.out.println("History");
        for (int i = 0; i < expenseCount; i++) {
            System.out.println("  " + expenses[i].expenseLine());
        }
    }

}
