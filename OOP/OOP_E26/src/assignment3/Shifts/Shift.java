package Assignment3.Shifts;

import Assignment2.Volunteer;

public abstract class Shift {

    private int hours;
    private String task;

    public Shift ( int hours, String task ) {
        this.hours = hours;
        this.task = task;
    }

    public int getHours() { return hours; }

    public String getTask() { return task; }

    public abstract int calculatePoints(Volunteer volunteer);

    public abstract String pointPerShift();

}
