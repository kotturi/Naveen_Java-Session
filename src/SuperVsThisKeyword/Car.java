 package SuperVsThisKeyword;

public class Car extends Vehicle{
	
	public Car()
	{
		super(10);
		System.out.println("Car-Default constuctor...");
	}
	public Car(int k)
	{
		System.out.println("Car-one param constuctor..."+k);
	}
	
	public Car(int i,int j)
	{
		System.out.println("Car-Two param constuctor..."+(i+j));
	}
	int min_speed=100;
	public void start()
	{
		System.out.println("Car--Start");
	}
	public void stop()
	{
		System.out.println("Car--Stop");
	}

}
