package app;

import model.Student;
import model.ScholarshipStudent;
import service.StudentRegistry;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Create the registry
		StudentRegistry registry = new StudentRegistry();
		
		int choice;
		
		do {
			System.out.println("\n==== STUDENT REGISTRATION SYSTEM ====");
            System.out.println("1. Add Regular Student");
            System.out.println("2. Add Scholarship Student");
            System.out.println("3. Show All Students");
            System.out.println("4. Remove Student by Name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
            case 1:
            	System.out.print("Enter name: ");
            	String name = scanner.nextLine();
            	
            	System.out.print("Enter age: ");
            	int age = scanner.nextInt();
            	scanner.nextLine();
            	
            	System.out.print("Enter course: ");
            	String course = scanner.nextLine();
            	
            	Student s = new Student(name, age, course);
            	registry.addStudent(s);
            	break;
            	
            case 2:
            	System.out.print("Enter name: ");
                String sName = scanner.nextLine();

                System.out.print("Enter age: ");
                int sAge = scanner.nextInt();
                
                System.out.print("Enter course: ");
            	String sCourse = scanner.nextLine();

                System.out.print("Enter scholarship amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                ScholarshipStudent ss = new ScholarshipStudent(sName, sAge, sCourse, amount);
                registry.addStudent(ss);
                break;
                
            case 3:
            	registry.showAllStudents();
                break;
                
            case 4:
            	System.out.print("Enter the name to remove: ");
                String removeName = scanner.nextLine();
                registry.removeStudentByName(removeName);
                break;
            case 0:
            	System.out.println("Exiting system...");
                break;
                
            default:
            	System.out.println("Invalid option. Try again.");
            }
            
		}  while (choice != 0);
		
		scanner.close();
		/*Create some students
		Student s1 = new Student("Alice", 22, "Medicine");
		Student s2 = new Student("Bob", 24, "Economy");
		ScholarshipStudent s3 = new ScholarshipStudent("Carla", 33 , "Programming", 1200.00);
		
		//Add students to registry
		registry.addStudent(s1);
		registry.addStudent(s2);
		registry.addStudent(s3);
		
		//Show all registered students
		System.out.println("\nList of students:");
		registry.showAllStudents();
		
		//Remove a student by name
		System.out.println("\nRemoving student 'Alice': ");
		registry.removeStudentByName("Alice");
		
		//Show update list
		System.out.println("\nUpdated list of students:");
		registry.showAllStudents();*/
	}
}
