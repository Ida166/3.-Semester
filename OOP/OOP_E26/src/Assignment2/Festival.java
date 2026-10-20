package Assignment2;

import Assignment2.Shifts.*;

public class Festival {

    private Volunteer[] festivalVolunteers;
    private int volunteerCount;

    public Festival() {
        festivalVolunteers = new Volunteer[10];
        volunteerCount = 0;
    }

    /** A new volunteer joins, with 0 points. */
    public void addVolunteer(String name, int festivalsBefore) {
        Volunteer volunteer = new Volunteer(name, festivalsBefore);
        festivalVolunteers[volunteerCount] = volunteer;
        volunteerCount++;
    }

    /** Every volunteer, and how many festivals they have helped at before. */
    public void printVolunteers() {
        for (int i = 0; i < volunteerCount; i++) {
            System.out.println("  " + festivalVolunteers[i].getName() + " has helped at " + festivalVolunteers[i].getFestivalsBefore() + " festivals before");
        }
    }

    public void addShift(char type, int volunteer, int hours, String task, int bags) {
        Shift shift = null;
        int earned = 0;
        switch (type) {
            case 'B':
                shift = new BarShift(hours, task);
                break;
            case 'R':
                shift = new RecyclingShift(hours, task, bags);
                break;
            case 'L':
                shift = new TeamLeadersShift(hours, task, festivalVolunteers[volunteer].getFestivalsBefore());
                break;
            default:
                throw new IllegalArgumentException("Unknown shift type: " + type);
        }

        earned = festivalVolunteers[volunteer].workedShift(shift);

        System.out.println("  " + festivalVolunteers[volunteer].getName() + " worked " + hours + " h, " + task + ": "
                + earned + " points (" + shift.pointPerShift() + ")");
    }

    /** The points of every volunteer on one line, and who has earned a ticket. */
    protected void printPoints() {
        System.out.print("  Points:");
        for (int i = 0; i < volunteerCount; i++) {
            Volunteer volunteer = festivalVolunteers[i];
            System.out.print(" " + volunteer.getName() + " " + volunteer.getPoints());
            if (volunteer.getPoints() >= 30) {
                System.out.print(" (ticket)");
            }
            if (i < volunteerCount - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
