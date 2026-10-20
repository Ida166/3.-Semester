package Assignment2;

import Assignment2.Shifts.BarShift;
import Assignment2.Shifts.Shift;

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

        festival.addShift('B', 0, 8, "Beer bar", 0);
        festival.addShift('B', 1, 8, "Cocktail bar", 0);
        festival.addShift('B', 2, 8, "Beer bar", 0);
        festival.addShift('B', 2, 8, "Coffee bar", 0);
        festival.printPoints();



        // Task 3. Day 2, cup recycling. Exercise 3.
        // Read Task 3 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println("Task 3. Day 2, cup recycling");

        festival.addShift('R', 0, 8, "Cup recycling", 2);
        festival.addShift('R', 1, 8, "Cup recycling", 6);
        festival.addShift('R', 2, 8, "Cup recycling", 4);
        festival.printPoints();

        // Task 4. Day 3, the team leaders. Exercise 4.
        // FestivalVolunteers does not have this task. Exercise 4 in README.md describes it.
        System.out.println("Task 4. Day 3, the team leaders");
        festival.addShift('L', 0, 8, "Bar team leader", 0);
        festival.addShift('L', 1, 4, "Recycling team leader", 0);
        festival.printPoints();
    }
}
