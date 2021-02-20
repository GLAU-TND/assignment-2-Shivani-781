/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String args[]) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("Shivani",46);
        obj.insert("Vanshika",61);
        obj.insert("Simran",50);
        obj.insert("Sandeep",42);
        obj.insert("Priyansh",32);
        System.out.println("Students according to their roll number are: ");
        obj.peep();
    }
}
