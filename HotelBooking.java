class HotelBooking {
	private String guestName;
	private String roomType;
	private int nights;
	
	HotelBooking(){
		this.guestName="Dhruv Sharma";
		this.roomType="single room";
		this.nights=2;
	}
	HotelBooking(HotelBooking copy){
		this.guestName=copy.guestName;
		this.roomType=copy.roomType;
		this.nights=copy.nights;
	}
	HotelBooking(String guestName , String roomType, int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	public void showDetails(){
		System.out.println("Guest Name :"+guestName);
		System.out.println("Room Type :"+roomType);
		System.out.println("Nights :"+nights);
	}
	public static void main(String[] args){
		HotelBooking booking1 = new HotelBooking();
		booking1.showDetails();
		HotelBooking booking2 = new HotelBooking("Sharma","Deluxe Room",1);
		booking2.showDetails();
		HotelBooking booking3 = new HotelBooking(booking2);
		booking3.showDetails();
	}
}
/*
Output
Guest Name :Dhruv Sharma
Room Type :single room
Nights :2
Guest Name :Sharma
Room Type :Deluxe Room
Nights :1
Guest Name :Sharma
Room Type :Deluxe Room
Nights :1
*/