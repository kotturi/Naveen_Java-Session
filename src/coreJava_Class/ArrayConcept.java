package coreJava_Class;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		int i[]= new int[4];
		//i[-1]=20;////AIOB
		i[0]=100;
		i[1]=200;
		i[2]=300;
		i[3]=400;
		//i[4]=500; //AIOB
		System.out.println(i[1]);
		for(int no:i)
		{
			System.out.println("foe each int:"+no);
		}
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException:AIOB
		int len= i.length;
		System.out.println("Size of Array: "+len);
		System.out.println("Li: "+0);
		System.out.println("Hi: "+(len+1));
		
		int p[]= new int[3];
		p[0]=20;////AIOB
		p[2]=10;
		System.out.println(p[1]); //0
		
		System.out.println(i);
		System.out.println(Arrays.toString(i));//[100, 0, 300, 400]
		
		int price[]= new int[4];
		//i[-1]=20;////AIOB
		price[0]=100;
		price[1]=200;
		price[2]=300;
		price[3]=400;
		
		System.out.println("no Logic:"+Arrays.toString(price)); //no Logic:[100, 200, 300, 400]
		//iteration use loop Normal for loop
		for(int k=0;k<4;k++)
		{
			System.out.println(price[k]);
		}
		
		//For Each loop
		System.out.println("---For Each loop--");
		
		for(int pr:price)
		{
			System.out.println("Price For Each: "+pr);
		}
		
		//System.out.println(Arrays.toString(price));//100 200 300 400
		//iteration use loop
		for(int k=0;k<=price.length-1;k++)
		{
			System.out.println(price[k]);//100 200 300 400
		}

		for(int k=0;k<=price.length-1;k++)
		{
			System.out.println(price[k]);//100 200 300 400
			if(price[k]==300)
			{
				System.out.println("bye");
				break;
			}
		}
		//For Each loop
				System.out.println("---For Each loop--");
				
				for(int pr:price)
				{
					System.out.println("Price For Each: "+pr);
					if(pr==200)
					{
						System.out.println("Hello for each if SYSO");
						break;
					}
				}
				
		//For Each loop
		//Lowest no
		int low[]= {10,4,5,7,3,12};
		
		int length=low.length;
		System.out.println(length);
		int lowestno= low[0];
		
		for(int l:low)
		{
			if(lowestno>l)
			{				lowestno=l;
			}
		}
		System.out.println("The lowest age in the array is: " + lowestno);
	//	System.out.println(length[]);
		
		// An array storing different ages
		int ages[] = {20,  22, 18, 35, 48, 26, 87, 70};
		
		int avg,sum=0;
		int len1=ages.length;
		System.out.println(len1);
		
		
		//String Array
		String browser[]= new String[2];
		System.out.println(Arrays.toString(browser));
		browser[0]="chrome";
		browser[1]="ff";
		System.out.println(browser.length);
		System.out.println(Arrays.toString(browser));
		
		//indeax for loop
		for(int k=0; k<=browser.length-1;k++)
		{
			System.out.println("index for loop:" +browser[k]);
		}
				
		//for each loop
		
		for(String st:browser)
		{
			//System.out.println(browser); //[Ljava.lang.String;@52cc8049
			System.err.println("Enhanced for each : "+st);
			if(st.equals("chrome"))
			{
				System.out.println("Launch chrome browser");
				break;
			}
		}
		
		char ch[]=new char[3];
		ch[0]='$';
		ch[1]='A';		
		ch[2]='c';
		System.out.println("----char for loop-----");
		
		for(char cha=0; cha<=ch.length-1;cha++)
		{
			System.out.println(cha);
		}
		System.out.println("----char for each loop-----");
		for(char ar:ch)
		{
			System.out.println(ar);
			if(ar=='A') {
				System.out.println("bello");
			break;}
		}
	}	

}
