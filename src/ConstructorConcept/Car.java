package ConstructorConcept;

public class Car {
	
	String name;
	int price;
	String  licenseNum;
	double mileage;
	boolean isAvailable;

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		sendMail();
	}

	public Car(String name, String licenseNum) {
		this.name = name;
		this.licenseNum = licenseNum;
	}
	
	public void sendMail()
	{
		System.out.println("Send Email Function");
		Car C1= new Car("BMW", 50);

	//	System.out.println("Send End Function");
	}

	public Car(String name, int price, String licenseNum) {
		this.name = name;
		this.price = price;
		this.licenseNum = licenseNum;
	}

	public Car(String name, int price, String licenseNum,double mileage, boolean isAvailable) {
		this.name = name;
		this.price = price;
		this.licenseNum = licenseNum;
		this.mileage = mileage;
		this.isAvailable = isAvailable;
	}
	
	public static void main(String[] args) {
		Car C1= new Car("BMW", 50);
		Car C2= new Car("Honda", 20, "AP9988");
		Car C3= new Car("Audi", 40, "TS0011",12.22,true);
		System.out.println(C2.name + " "+C2.price+" "+C2.licenseNum+" "+C2.mileage+" "+C2.isAvailable);
		C2.mileage=11.11;
		C2.isAvailable=true;
		System.out.println(C2.name + " "+C2.price+" "+C2.licenseNum+" "+C2.mileage+" "+C2.isAvailable);
	}
}
