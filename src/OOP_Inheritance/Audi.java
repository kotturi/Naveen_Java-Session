package OOP_Inheritance;

public class Audi extends Car{

	@Override
	public void start()
	{
		System.out.println("Audi----Start");
	}
	
	public void theftSafety() {
		System.out.println("Audi---theftSafety");
	}
	public void autoParking()
	{
		BMW b= new BMW();
		b.autoParking();//Composition
	}
}
