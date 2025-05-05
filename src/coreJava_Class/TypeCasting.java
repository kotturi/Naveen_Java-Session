package coreJava_Class;

import java.net.MulticastSocket;

public class TypeCasting {

	public static void main(String[] args) {
		byte b=10;
		short s=b;
		int i=s;
		long l=i;
		System.out.println(l);//10
		
		byte b1=10;//-128 to 127
		byte b2=20;
	//	byte b3=b1+b2;//30 May be infuture b1,b2 can change so error
		
		int i3=b1+b2;
		System.out.println(i3);
		
		short s1=1000;
		short s2= 2000;
		//short s3= s1+s2; error
		int s3=s1*s2;
		System.out.println(s3);
		
		long l1=12121212121212l;
		long l2= 12121212;
		long le= l1+l2;
		System.out.println(le);
		
		byte price= 100;
		//byte total= price+50; error
		int total= price+50;
		System.out.println(total);
		
		short sh=200;
		byte bh=(byte) sh;
		System.out.println(bh);
		
		int p=1000;
		byte m= (byte)p;
		System.out.println(m);
		
		char c= 'a';
		byte bg= (byte) c;
		System.out.println(bg);
		
		float f= 97.45f;
		char c1= (char) f;
		System.out.println(c);//a
		
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MAX_VALUE+1);//-2147483648
		long x=Integer.MAX_VALUE;
		System.out.println(x+1);//2147483648
		
		
		
		
		
		
		
	}

}
