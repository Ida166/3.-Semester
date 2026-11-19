package Assignment2;

import Assignment2.Shifts.BarShift;
import Assignment2.Shifts.RecyclingShift;
import Assignment2.Shifts.TeamLeadersShift;

/**
 * Assignment 2, your program. Write it with objects.
 *
 * Main.main does the tasks of FestivalVolunteers.main again, in the same
 * order, with objects of the classes you write. Write each class in its own
 * file in this folder. Main.main tells the story, and your objects do the
 * work.
 */
public class Main {

    public static void main(String[] args) {
        // Task 1. The volunteers. Exercise 1.
        // Read Task 1 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println("Task 1. The volunteers");

        Festival festival = new Festival();
        festival.addVolunteer("Ida", 3);
        festival.addVolunteer("Malik", 2);
        festival.addVolunteer("Oskar", 0);
        festival.printVolunteers();

        // Task 2. Day 1, the bars. Exercise 2.
        // Read Task 2 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println("Task 2. Day 1, the bars");

        festival.addShift(0, new BarShift(8, "Beer bar"));
        festival.addShift(1, new BarShift(8, "Cocktail bar"));
        festival.addShift(2, new BarShift(8, "Beer bar"));
        festival.addShift(2, new BarShift(8, "Coffee bar"));
        festival.printPoints();



        // Task 3. Day 2, cup recycling. Exercise 3.
        // Read Task 3 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println("Task 3. Day 2, cup recycling");

        festival.addShift(0, new RecyclingShift(8, "Cup recycling", 2));
        festival.addShift(1, new RecyclingShift(8, "Cup recycling", 6));
        festival.addShift(2, new RecyclingShift(8, "Cup recycling", 4));
        festival.printPoints();

        // Task 4. Day 3, the team leaders. Exercise 4.
        // FestivalVolunteers does not have this task. Exercise 4 in README.md describes it.
        System.out.println("Task 4. Day 3, the team leaders");
        festival.addShift(0, new TeamLeadersShift(8, "Bar team leader"));
        festival.addShift(1, new TeamLeadersShift(4, "Recycling team leader"));
        festival.printPoints();
    }
}
