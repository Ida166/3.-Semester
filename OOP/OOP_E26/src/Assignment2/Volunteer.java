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

    public void workedShift(Shift shift ){
        changePoints(shift.calculatePoints());
    }

    private void changePoints( int earned ) {
        this.points = points + earned;
    }

    public void changeFestivalsBefore(int recent) {
        this.festivalsBefore = festivalsBefore + recent;
    }
}
