package Pracetice;

public class Static {

	String name;
	static final int wheel=4;
	
	public void sendMail()
	{
		System.out.println("Non Static  send mail method");
	}
	public static void readMail()
	{
		System.out.println(" Static read mail method");
	}
	public static void main(String[] args) {

		Static s= new Static();
		s.name="BMW";
		//s.wheel=5;
		s.sendMail();
		s.readMail();
		readMail();
		Static.readMail();
		
		System.out.println(s.name);
		System.out.println(wheel);
		
		Static s1= new Static();
		s1.name="Audi";
	//	s1.wheel=41;
		
		System.out.println(s1.name);
		System.out.println(s1.wheel);
		
		System.out.println(Static.wheel);
	}

}
