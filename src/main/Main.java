
package main;

import student.Student;


public class Main {

   
    public static void main(String[] args) {
        Student myStudent = new Student();
        
        myStudent.setFirstName("Marko");
        myStudent.setLastName("Markovic");
        myStudent.setYearOfBirth(1987);
        myStudent.info();
    
    }
    
}
