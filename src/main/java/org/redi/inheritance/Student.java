package org.redi.inheritance;

/**
 * Created by redi on 5/8/17.
 */
public class Student extends Person {
    private String attendingscourse;

    public String getAttendingscourse() {
        return attendingscourse;
    }

    public void setAttendingscourse(String attendingscourse) {
        this.attendingscourse = attendingscourse;
    }
}
