package org.redi.inheritance;

import java.util.Date;

/**
 * Created by redi on 5/8/17.
 */
public class App {
    public static void main(String[] args) {
        System.out.println ("Hello Inheritance");
        Student student  = new Student();
        student.setFirstName("nour");
        student.setLastName("Majthoub");
        System.out.println("Student name is "+student.getFirstName()+" "+student.getLastName());
        Teacher teacher = new Teacher();
        teacher.setFirstName("Skutella");
        teacher.setLastName("Martin");
        teacher.setDateOfBirth(new Date());
        System.out.println("Teacher name is"+teacher.getFirstName()+""+teacher.getLastName());
        System.out.println("Teacher date is "+teacher.getDateOfBirth());

    }
}
