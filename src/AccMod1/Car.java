package AccMod1;

public class Car {

	public String name;
	int price;
	protected  String color;
	private String licenceNumber;
	
	public void start()
	{
		System.out.println("Strare-car");
	}
	
	protected void stop()
	{
		System.out.println("Stop-car");
	}
	
	void refel()
	{
		System.out.println("refel-car");
	}
	private void bill()
		{
			System.out.println("bill-car");
		}
		 
	public static void main(String[] args) {

		Car c= new Car();
		c.name="public";
		c.price=123;
		c.color="protected";
		c.licenceNumber="Private";
	}

}
