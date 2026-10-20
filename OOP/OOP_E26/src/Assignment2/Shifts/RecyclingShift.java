package Assignment2.Shifts;

public class RecyclingShift extends Shift {

    protected int bags;

    public RecyclingShift(int hours, String task, int bags) {
        super(hours, task);
        this.bags = bags;
    }

    @Override
    public int calculatePoints() {
        return hours + bags;
    }

    @Override
    public String pointPerShift(){
        return "1 per hour and 1 per bag";
    }

}