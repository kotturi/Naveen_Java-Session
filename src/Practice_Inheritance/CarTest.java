package Practice_Inheritance;

public class CarTest {

	public static void main(String [] args)
	{
	BMW b= new BMW();
	b.start();
	b.stop();
	b.autoPark();
	b.refuel();
	b.engine();//override
	b.load();//inhereted
	b.taxation();
	b.finalMethod();

	Car c= new Car();
	c.start();
	c.stop();
	c.refuel();
	c.engine();//overirde
	c.billing();
	c.load();//inhereted
	c.milage(12);
	c.milage("jo");
	
	b.finalMethod();
	
	BMW.billing();
	Car.billing();
	System.out.println("---------------");
	Audi a= new Audi();
	a.start();//overriden
	a.threadSafety();//individual
	a.autoparking();
	a.engine();//inherited
	
	
	
	}
}
