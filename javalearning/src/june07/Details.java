package june07;
import java.util.*;



public class Details implements Comparable<Details> {
    String firstname;
    String lastname;
    double gpa;

    public Details(String firstname, String lastname, double gpa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + gpa;
    }

    @Override
    public int compareTo(Details o) {
        return this.lastname.compareTo(o.lastname);
    }
}
