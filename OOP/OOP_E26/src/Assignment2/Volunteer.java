package Assignment2;

import Assignment2.Shifts.Shift;

public class Volunteer {

    private String name;
    private int points;
    private int festivalsBefore;

    public Volunteer ( String name, int festivalsBefore ){

        this.name = name;
        this.festivalsBefore = festivalsBefore;
    }

    public String getName () { return name; }

    public int getPoints() { return points; }

    public int getFestivalsBefore() {
        return festivalsBefore;
    }

    public int workedShift(Shift shift ){
        int earned = shift.calculatePoints();
        changePoints(earned);
        return earned;
    }

    private void changePoints( int earned ) {
        this.points = points + earned;
    }
}
