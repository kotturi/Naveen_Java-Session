package coreJava_Class;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {

		//emp data:
		//name(String)
		//age(int)
		//salary(double)
		//genger(CHAR)
		
		//Object : is 	a super(Parent) class
		
		Object empdata[]= new Object[4];
		System.out.println(Arrays.toString(empdata));
		
		empdata[0]="Jyothi";
		empdata[1]=39;
		empdata[2]=90000.00;		
		empdata[3]='F';
		//empdata[4]='F'; AIOB
		
		System.out.println(empdata[0]);
		System.out.println(empdata.length);
		
		System.out.println(Arrays.toString(empdata));
		
		for(Object p:empdata)
		{
			System.out.println(p);
		}
			
	}

}
