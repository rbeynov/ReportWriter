package com.ynov.reportwriter;

public class Launcher {
    public static void main(String[] args) {
        Employee 		alain 	= new Employee("Alain", "Térieur", 1000, 14);
        Student         alex 	= new Student("Alex", "Ception", "YNOV");
        SubContractor   anna 	= new SubContractor("Anna", "Tomie", 150);

        alain.print();
        alex.print();
        anna.print();
    }
}
