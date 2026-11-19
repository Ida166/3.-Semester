package Assignment2.Shifts;

import Assignment2.Volunteer;

public class BarShift extends Shift{

    public BarShift ( int hours, String task ) {
        super(hours, task);
    }

    @Override
    public int calculatePoints(Volunteer volunteer) {
        return getHours();
    }

    @Override
    public String pointPerShift(){
        return "1 per hour";
    }
}
