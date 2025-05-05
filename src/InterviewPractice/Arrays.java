package InterviewPractice;

public class Arrays {
	public static void main(String[] args)
	{
		int a[]=new int[4];
		 a[0]=100;
		  a[1]=200;
		  a[2]=300;
		  a[3]=400;
		  System.out.println(a.length);
		  System.out.println(a[1]);
		  System.out.println(java.util.Arrays.toString(a));
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]);
		  }
		  
		  int b[]= {10,20,30,40,50};
		  System.out.println(b.length);
		  System.out.println(b[5]);
		  
	}
}
