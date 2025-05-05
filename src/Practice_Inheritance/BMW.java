package Practice_Inheritance;

//IS-A relationsip
public class BMW extends Car {

	@Override
	public void start()
	{
		System.out.println("BMW Start");
	}

	public void autoPark()
	{
		System.out.println("BMW autopark");
	}
	@Override
	public void engine()
	{
		System.out.println("BMW engine");
		Truck  t= new Truck();//Composition concept Has-A relation
		t.transport();
	}
	public static void billing()
	{
		System.err.println("BMW--billing");
	}
	
}
