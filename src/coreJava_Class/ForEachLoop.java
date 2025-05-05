package coreJava_Class;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		//String Array
		String browser[]= new String[5];
		System.out.println(Arrays.toString(browser)); //[null, null, null, null, null]
		browser[0]="chrome";
		browser[1]="ff";
		browser[2]="safari";
		browser[3]="IE";
		browser[4]="edge";
		int count=0;
		for(String e:browser)
		{
			System.out.println("Count :"+count+" "+e);
			count++;
		}
		int coun=5;
		for(int i=browser.length-1; i>=0; i--)
		{
			System.out.println("Count :"+coun+" "+browser[i]);
			coun--;
		}
		
		int c=browser.length-1;
		for(String p:browser)
		{
			System.out.println(browser[c]);
			c--;
			//System.out.println(p);
		}
	}

}
