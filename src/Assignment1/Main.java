package Assignment1;

import static Assignment1.Flat.*;

// Cost of the rent, FlatShare.java:  places touched: addExpense(), rent-splitting logic, typeName()   of which switches: 2  did anything warn me: nothing except the ? because it does not know how to handle 'R'
// Cost of the rent, my design:       places touched: addExpense(), splitRent(), typeName(), added a field: int appartmentSquaremeter to Flat(the size is given when creating the object in main),
//                                    added getRoomSize(), of which switches: 2   did anything warn me: nothing except the ? because it does not know how to handle 'R'


public class Main {


    static void main(String[] args){
        Flat flat = new Flat(50);

        System.out.println("September in the flat");

        flat.moveIn("Freja", 14);
        flat.moveIn("Ali", 12);
        flat.moveIn("Mathilde", 10);
        flat.moveIn("Jonas", 14);

        flat.addExpense('R', "Freja", 10000, "Rent", null);
        flat.addExpense('E', "Mathilde", 480, "Groceries", null);
        flat.addExpense('E', "Jonas", 320, "Internet", null);
        flat.addExpense('P', "Ali", 450, "Concert ticket for Jonas", "Jonas");

        // Mathilde pays Freja back and moves out. Then Sofie moves in.
        flat.addExpense('P', "Mathilde", 1720, "Paying Freja back", "Freja");
        flat.moveOut("Mathilde");
        flat.moveIn("Sofie", 10);
        flat.addExpense('E', "Sofie", 200, "Cleaning supplies", null);

        // Jonas wants to move out too, and still owes money.
        flat.moveOut("Jonas");

        flat.printBalances();
        flat.printHistory();

        // --- The sabotage ------------------------------------------------
        // Uncomment the two lines below and run again.
        //flat.flatmates[0].changeBalance(100);
        //Error message: 'flatmates' has private access in 'Assignment1.Flat'
    }
}
