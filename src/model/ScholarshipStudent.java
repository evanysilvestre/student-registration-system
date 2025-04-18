package model;

public class ScholarshipStudent extends Student{
	//Extra Attribute
	private double scholarshipAmount;
	
	//Constructor
	public ScholarshipStudent(String name, int age, String course, double scholarshipAmount) {
		//Call the superclass constructor(Student)
		super(name, age, course);
		this.scholarshipAmount = scholarshipAmount;
	}
	
	//Getters
	public double getScholarshipAmout() {
		return scholarshipAmount;
	}
	
	//Setters
	public void setScholarshipAmount(double scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}
	
	//Overriding the displayInfo() method
	  @Override
	    public void displayInfo() {
	        super.displayInfo(); // shows name and age
	        System.out.println("Scholarship: $" + scholarshipAmount);
	    }
}
