package Assignment1;

public class Flatmate {

    private String name;
    private int roomSize;
    private int balance;

    public Flatmate(String name, int roomSize){
        this.name = name;
        this.roomSize = roomSize;
        this.balance = 0;
    }

    public String getName() { return name; }

    public int getRoomSize() { return roomSize; }

    public int getBalance() { return balance; }

    public void changeBalance(int amount) { this.balance = balance + amount; }

}
