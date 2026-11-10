package Assignment2.Shifts;

public abstract class Shift {

    private int hours;
    private String task;

    public Shift ( int hours, String task ) {
        this.hours = hours;
        this.task = task;
    }

    public int getHours() { return hours; }

    public String getTask() { return task; }

    public abstract int calculatePoints();

    public abstract String pointPerShift();

}
