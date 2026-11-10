package Assignment2.Shifts;

public class BarShift extends Shift{

    public BarShift ( int hours, String task ) {
        super(hours, task);
    }

    @Override
    public int calculatePoints() {
        return getHours();
    }

    @Override
    public String pointPerShift(){
        return "1 per hour";
    }
}
