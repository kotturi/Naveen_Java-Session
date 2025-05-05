package coreJava_Class;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		//Post
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=-98;
		int d=c++;
		System.out.println(c);//-97
		System.out.println(d);//-98
		
		//Pre
		
		int e=-98;
		int f=++e;
		System.out.println(e);//-97
		System.out.println(f);//-97
		
		int g=2;
		int h=++g;
		System.out.println(g);//3
		System.out.println(h);//3
		
		
		//Post
				int p=1;
				int q=p--;
				System.out.println(p);//0
				System.out.println(q);//1
				
				int r=-999;
				int s=r--;
				System.out.println(r);//-1000
				System.out.println(s);//-999
				
				//Pre
				
				int n=2;
				int u=--n;
				System.out.println(n);//1
				System.out.println(u);//1
				
				int x=-98;
				int y=x--;
				System.out.println(x);//-99
				System.out.println(y);//-99
				
				int t=100;
				System.out.println(t);//100
				//System.out.println("Post :" +t++); //100
				//System.out.println("Post :" + ++t); //101
				//System.out.println("Pre :" +t--);//100
				System.out.println("Pre :" + --t);//99
				
				double dd=1.1;
				//System.out.println(dd++);//1.1
				//System.out.println(++dd);//2.1
				//System.out.println(dd--);//1.1
				System.out.println(--dd);//0.1
				
				
				
				double a1=1.1;
				double a2=a1++;
				System.out.println(a1);//2.1
				System.out.println(a2);//1.1
				
				char ch='a';
				char ch2=ch++;
				System.out.println(ch);//b
				System.out.println(ch2);//a
				char ch3='a';
				char ch4=ch3++;
				System.out.println((int)ch3);//98 
				System.out.println((int)ch4);//97 
				
				int p1=10;
				int um=p1+4;
				System.out.println(p1); //10
				System.out.println(um);//14
	}

}
