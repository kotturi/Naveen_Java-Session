package AccMod2;

import AccMod1.Car;

public class Audi extends Car {

	@Override
//public -->public
	public void start() {
		System.out.println("Strare-BMW");
	}

	@Override
//protected --> public,protected
	protected void stop() {
		System.out.println("Stop-BMW");
	}

//@Override
//DEFAULT-->NA
//  void refel()
//	{
//		System.out.println("refel-BMW");
//	}
//@Override
//private-NA
	private void bill() {
		System.out.println("Audi-buill");
	}

	public static void main(String[] args) {

		Audi a = new Audi();
		a.name = "public";
		// a.price=123; //int
		a.color = "protected";
		// a.licenceNumber="Private"; //NA
	}

}
