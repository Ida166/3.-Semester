package Assignment3.Shifts;

import Assignment2.Volunteer;

public class TeamLeadersShift extends Shift{

    public TeamLeadersShift(int hours, String task) {
        super(hours, task);
    }

    @Override
    public int calculatePoints(Volunteer volunteer) {
        if (volunteer.getFestivalsBefore() >= 3) {
            return getHours() * 3;
        }
        return getHours() * 2;
    }

    @Override
    public String pointPerShift(){
        return "2 per hour, 3 after 3 festivals";
    }

}
