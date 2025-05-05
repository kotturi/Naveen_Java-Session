package AccMod1;

public class BMW extends Car{
@Override
//public -->public
	public void start()
	{
		System.out.println("Strare-BMW");
	}
@Override
//protected --> public,protected
protected void stop()
{
	System.out.println("Stop-BMW");
}
@Override
//DEFAULT-->DEFAULT, PROTECT,PUBLIC
public void refel()
	{
		System.out.println("refel-BMW");
	}
//@Override
//private-NA
private void bill()
{
	System.out.println("BMW");
}
 
	public static void main(String[] args) {

		BMW b= new BMW();
		b.name="public";
		b.price=123;
		b.color="protected";
		b.start();
		b.refel();
		b.stop();
		b.bill();
		
//		b.licenceNumber="Private";//NA
	}

}
