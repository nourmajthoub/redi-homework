package org.redi.inheritance;

import java.util.Date;

/**
 * Created by redi on 5/12/17.
 */
public class ConstructerTest {

    public static void main(String... args) {
        Person Person1 = new Person();
        Person Person2 = new Person("Mona", "alnajar", "noumajthop", new Date());
        Person1.setFirstName("Mohammed");
        Student student1 = new Student(" Ali ","mohammed", "jamal",new Date(),"java");
        System.out.println("student is"+ student1.getFirstName());
        {
        }
        System.out.println("the name of the guy is " + Person1.getFirstName());
        System.out.println("the name of the guy is " + Person2.getFirstName());

    }
}


