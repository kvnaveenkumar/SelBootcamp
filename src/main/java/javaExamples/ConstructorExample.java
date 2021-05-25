package javaExamples;

public class ConstructorExample {
	int hotelRoomNumber;
	String hotelName;
	String hotelLocation;
	int hotelPhoneNumber;
	

	 //This is the Constructor which will create in run time
	 //This is a Default Constructor
	 ConstructorExample() {
		 hotelRoomNumber=102;
		 hotelName="GRT";
		 hotelLocation="Salem";
		 hotelPhoneNumber=1234;
	}
	 //This is a parameterized constructor
	 ConstructorExample(int room,String name,String location,int phone) {
		 hotelRoomNumber=room;
		 hotelName=name;
		 hotelLocation=location;
		 hotelPhoneNumber=phone;
	}
	 
	//If only constructor was used with any datatype in it - Default Constructor will execute
	//If any datatype was passed in  constructor - Parameterized Constructor will execute
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample c=new ConstructorExample();
		System.out.println(c.hotelRoomNumber);
		System.out.println(c.hotelName);
		System.out.println(c.hotelLocation);
		System.out.println(c.hotelPhoneNumber);

	}
	
	
	

}
