class Person {
	private String name;
	private int age;
	
	
	public Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	public Person(Person clone){
		this.name = clone.name;
		this.age=clone.age;
	}
	public void showdetails(){
		System.out.println("Person Name :"+name);
		System.out.println("Person Age :"+age);
	}
	public static void main(String[] args){
		Person person1 = new Person("Dhruv Sharma",20);
		person1.showdetails();
		Person person2 = new Person("Naam Simran",21);
		person2.showdetails();
		System.out.println("Copy Constructor");
		Person person3 = new Person(person1);
		person3.showdetails();
	}
	
}
/*
Output
Person Name :Dhruv Sharma
Person Age :20
Person Name :Naam Simran
Person Age :21
Copy Constructor
Person Name :Dhruv Sharma
Person Age :20
*/