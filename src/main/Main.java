package main;

import student.Student;

public class Main {

    public static void main(String[] args) {
        Student myStudent = new Student();

//        myStudent.setFirstName("Marko");
//        myStudent.setLastName("Markovic");
//        myStudent.setYearOfBirth(1987);
//        myStudent.info();
        myStudent.setFirstName("Vladimir");
        myStudent.setLastName("Zdravkovic");
        myStudent.setYearOfBirth(1987);
        myStudent.getCourse().setName("QA");
        myStudent.getCourse().setNumberOfClasses(32);
        myStudent.getComputer().setProcessTact(4.0);
        myStudent.getComputer().setMemory(16);
        myStudent.getComputer().setHardDrive(2000);
        myStudent.info();
    }

}
