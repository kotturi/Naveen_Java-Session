package Practice_Inheritance;

public class Audi extends Car{
	
	@Override
	public void start()
	{
		System.out.println("Audi -- Start");
	}
	
	public void threadSafety()
	{
		System.out.println("Audi ---threadSafety");
	}
	
	public void autoparking()
	{
		BMW b= new BMW();
		b.autoPark();
	}
	
	
	
}
