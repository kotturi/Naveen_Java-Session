package OOP_Abstract;

public class LoginPage extends Page {

	public LoginPage()
	{
		System.out.println("Login page --cons");
	}
	public LoginPage(int i)
	{
		System.out.println("Login page --cons"+i);
	}
	public LoginPage(int i,int j)
	{
		System.out.println("Login page --cons"+(i+j));
	}
	
	@Override
	public void title() {
		System.out.println("Login --title");
	}

	@Override
	public void url() {
		System.out.println("Login --URL");
	}
	@Override
	public void timeOut()
	{
		System.out.println("LP-timeOut -- 20 sec");
	}

}
