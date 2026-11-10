package session7.A_ObjectMethods;

import java.util.Objects;

/**
 * A person with a first name, a last name, an age and, if there is one, a
 * middle name. This is the class of exercise A. It has the fields and the
 * constructors, and none of the methods that President overrides.
 *
 * A person built with the three-argument constructor keeps the empty
 * string "" in middleName, not null.
 */
public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    /** A person without a middle name. */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = "";
        this.age = age;
    }

    /** A person with a middle name. */
    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if(other == null || getClass() != other.getClass()) {
            return false;
        }
        //We typecast because the equals() method is defined to tak a perameter of type Object and therfore to
        // access that specific objets methods we have to cast its original type. In this case Person
        Person person = (Person) other;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && age == person.age;
    }

    @Override
    public int hashCode() { return Objects.hash(firstName, lastName, age); }

    @Override
    public String toString() {
        if (middleName.isEmpty()) {
            return firstName + " " + lastName + ", " + age;
        } else {
            return firstName + " " + middleName + " " + lastName + ", " + age;
        }
    }
}
