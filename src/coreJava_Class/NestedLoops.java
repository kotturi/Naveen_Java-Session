package coreJava_Class;

public class NestedLoops {

	public static void main(String[] args) {
		/*
		 * for(int i=0;i<=10;i++) { for(int j=0;j<=10;j++) { System.out.print(i+""+j);
		 * System.out.print(" "); } System.out.println(""); }
		 */
		
		for(int p=0;p<=999;p++)
		{
			for(int q=0;q<=999;q++)
			{
				for(int r=0;r<=999;r++)
				{
				System.out.print(r+""+q+""+p);
				System.out.print(" ");
				break;
				}
				System.out.println("");
				//break;
			}
			System.out.println("");
			
		}
	}

}
