package OOP_Abstract;

public class PageTest {

	public static void main(String[] args)
	{
		LoginPage lp= new LoginPage(10,5);
		lp.displayLogo();
		lp.title();
		lp.timeOut();
		Page.dispalyFooter();
		LoginPage.dispalyFooter();
		lp.url();
		
		System.out.println("--------------");
		CartPage cp= new CartPage();
		cp.displayLogo();
		cp.title();
		cp.timeOut();
		Page.dispalyFooter();
		cp.title();
		cp.url();
		
		
	}
}
