package Assignment2.Shifts;

public abstract class Shift {

    protected int hours;
    protected String task;

    public Shift ( int hours, String task ) {
        this.hours = hours;
        this.task = task;
    }

    public Shift () {};

    public abstract int calculatePoints();

    public abstract String getRuleName();

    public abstract String pointPerShift();

}
