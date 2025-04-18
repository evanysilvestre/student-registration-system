package service;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentRegistry {
	//Attribute List to store students
	private List<Student> students;
	
	// Constructor
	public StudentRegistry() {
		this.students = new ArrayList<>();
	}
	
	// Method to add a student
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student added successfully!");
	}
	
	//Method to show all students
	public void showAllStudents() {
		if (students.isEmpty()) {
			System.out.println("No students registered yet.");
		} else {
			for (Student student : students) {
				student.displayInfo();
				System.out.println("-----------");
			}
		}
	}
	
	//Method to remove a student by name
	public void removeStudentByName(String name) {
		boolean removed = false;
		for (Student student : students) {
			if (student.getName().equalsIgnoreCase(name)) {
				students.remove(student);
				System.out.println("Student removed successfully!");
				removed = true;
				break;
			}
		}
		
		if (!removed) {
			System.out.println("Student not found.");
		}
	}
}
