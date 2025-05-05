 package coreJava_Class;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		System.out.println(a.length);
		System.err.println(a[2]);
	//	a[5]=60;//AIOB
		//System.err.println(a[5]); //AIOB
		
		String lang[]= {"java","Pythan","Appium"};
		System.out.println(Arrays.toString(lang));//[java, Pythan, Appium]
		lang[0]="Ruby";
		System.out.println(Arrays.toString(lang));//[Ruby, Pythan, Appium]
		System.out.println(lang.length);
		System.err.println(lang[2]);
		
		
	}

}
