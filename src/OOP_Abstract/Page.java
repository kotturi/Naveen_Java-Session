package OOP_Abstract;

public abstract class Page {

	public abstract void title();
	public abstract void url();
	
//	public Page()
//	{
//		System.out.println("Page Class Default constructor");
//	}
//	public Page(int i)
//	{
//		System.out.println("Page Class Default constructor"+i);
//	}
//	
		public final void displayLogo()
		{
			System.out.println("Display --Logo");
		}
	public void timeOut()
	{
		System.out.println("timeOut -- 10 sec");
	}
	
	public static void dispalyFooter()
	{
		System.out.println("Page-dispalyFooter");
	}
}
