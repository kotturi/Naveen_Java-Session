package OOP_Inheritance;

public class Testing {

	public static void main(String[] args) {

		Car c= new BMW();
		c.start();
		c.info();
		c.stop();
		c.refuel();
		c.engine();
		c.billing();
		c.taxation();
		System.out.println("-------");
		
		Vehicle v= new BMW();
		v.engine();
		v.loading();
		
		//Down casting
		//BMW b= new Car();
		BMW b=(BMW) new Car();
		//Audi a=(Audi)new BMW();
			}

}
