package SuperVsThisKeyword;

public class BMW extends Car{
	
	public BMW()
	{
		this(10);
		System.out.println("BMW-Default constuctor...");
	}
	public 	BMW(int k)
	{
		System.out.println("BMW-one param constuctor..."+k);
	}
	
	public BMW(int i,int j)
	{
		System.out.println("BMW-Two param constuctor..."+(i+j));
		
	}
	
	int min_speed=200;
	@Override
	public void start()
	{
		System.out.println("BMW--Start");
		
		super.start();//Parent Car- start
		stop();
	}
	
	public void displayspeed()
	{
		System.out.println(min_speed);//child
		System.out.println(super.min_speed);//Parent
	}
//	@Override
//	public void stop()
//	{
//		System.out.println("BMW	--Stop");
//	}

}
