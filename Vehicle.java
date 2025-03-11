class Vehicle {
	private String ownerName;
	private String vehicleType;
	
	private static int registarationfees=1000;
	
	public Vehicle(String ownerName,String vehicleType){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
	}
	public void showdetails(){
		System.out.println("Onwer Name :"+ownerName);
		System.out.println("Vehicle type :"+vehicleType);
		System.out.println("Registration Fees :"+registarationfees);
	}
	public void updateregistrationFees(int newFees){
		registarationfees = newFees;
	}
	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle("Dhruv Sharma","Sedan Car");
		vehicle1.showdetails();
		vehicle1.updateregistrationFees(2000);
		vehicle1.showdetails();
	}
}
/*
Output 
Onwer Name :Dhruv Sharma
Vehicle type :Sedan Car
Registration Fees :1000
Onwer Name :Dhruv Sharma
Vehicle type :Sedan Car
Registration Fees :2000
*/