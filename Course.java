class Course {
	private static String instituteName="Chitkara University";
	private String courseName;
	private int durationInMonths;
	private double fees;
	
	public Course(String courseName , int durationInMonths , double fees){
		this.courseName = courseName;
		this.durationInMonths=durationInMonths;
		this.fees = fees;
	}
	public void updateInstitutedetails(String newName){
		instituteName=newName;
	}
	public void showDetails(){
		System.out.println("Institute Name :"+instituteName);
		System.out.println("Course :"+courseName);
		System.out.println("Duration of Course :"+durationInMonths+" months");
		System.out.println("Fees :"+fees);
	}
	public static void main(String[] args){
		Course course1= new Course("Btech Cse",48,640000.0);
		course1.showDetails();
		course1.updateInstitutedetails("Chandigarh University");
		course1.showDetails();
		
	}
}
/*
Output
Institute Name :Chitkara University
Course :Btech Cse
Duration of Course :48 months
Fees :640000.0
Institute Name :Chandigarh University
Course :Btech Cse
Duration of Course :48 months
Fees :640000.0
*/