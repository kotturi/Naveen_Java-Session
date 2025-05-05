package OOP_Inheritance;

public class CarTest {

	//Caller method/user
	public static void main(String[] args) {

		BMW b=new BMW();
		b.start();//overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//Individual
		b.engine();//overridden
		b.loading();
		b.billing();
		b.taxation();
		BMW.billing();
		BMW.taxation();//Inheritate static methos
		
		b.info();
		
		System.out.println("--------------");
		
		Car c= new Car();
		c.start();
		c.refuel();
		c.stop();
		c.engine();//inherited
		c.loading();
		c.billing();
		c.taxation();
		Car.billing();
		System.out.println("--------------");
		
		Audi au=new Audi();
		au.start();//overridden
		au.theftSafety();
		au.stop();
		au.loading();
		au.refuel();
		au.autoParking();
		
		
	
	}

}
