package coreJava_Class;

public class IFElseConcept {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		if(a==b)
			System.out.println("Pass");
		else
			System.out.println("fail");
		
		
		if(false)
			System.out.println("true");
		else
			System.out.println("false");
		
		boolean flag=false;
		if(flag)
			System.out.println("true");
		else
			System.out.println("false");
		
		int num=90;
		if(num <= 100)
		{
			if(num <= 95)
			{
			System.out.println("A grade");
			}
			else 
			System.out.println("B grade");
		}
		else 
			System.out.println("Invalid");
				
			
		//System.out.println(10==20);
String browser="chrome "; 
//		If(browser.equals("chrome"))
//		{
//			System.out.println("chrome");
//		}
//		If(browser.equals("chrome"))
//		{
//			System.out.println("chrome");
//		}
//		If(browser.equals("chrome"))
//		{
//			System.out.println("chrome");
//		}
		switch (browser.trim().toLowerCase()) {
		case "chrome":
		   System.out.println("chrome");
		   if(1==1)
			   System.out.println("hi");
		   else
			   System.out.println("else");
						break;
		case "safari":
			   System.out.println("safari");
	
							break;

		
			
	}
	}
}
