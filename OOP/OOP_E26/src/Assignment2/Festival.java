package Assignment2;

import Assignment2.Shifts.Shift;

import java.util.ArrayList;

public class Festival {

    private final ArrayList<Volunteer> volunteers = new ArrayList<>();

    /** A new volunteer joins, with 0 points. */
    public void addVolunteer(String name, int festivalsBefore) {
        volunteers.add(new Volunteer(name, festivalsBefore));
    }

    /** Every volunteer, and how many festivals they have helped at before. */
    public void printVolunteers() {
        for (Volunteer volunteer : volunteers) {
            System.out.println("  " + volunteer.getName() + " has helped at "
                    + volunteer.getFestivalsBefore() + " festivals before");
        }
    }

    public void addShift(int volunteerIndex, Shift shift) {
        Volunteer volunteer = volunteers.get(volunteerIndex);
        int earned = volunteer.workedShift(shift);

        System.out.println("  " + volunteer.getName() + " worked " + shift.getHours() + " h, "
                + shift.getTask() + ": " + earned + " points (" + shift.pointPerShift() + ")");
    }

    /** The points of every volunteer on one line, and who has earned a ticket. */
    protected void printPoints() {
        System.out.print("  Points:");
        for (int i = 0; i < volunteers.size(); i++) {
            Volunteer volunteer = volunteers.get(i);
            System.out.print(" " + volunteer.getName() + " " + volunteer.getPoints());
            if (volunteer.getPoints() >= 30) {
                System.out.print(" (ticket)");
            }
            if (i < volunteers.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
