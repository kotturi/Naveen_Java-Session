package coreJava_Class;

public class LoopsConcept {

	public static void main(String[] args) {
		//1 to 100
		int i = 1;
		while (i <= 10)// i=1 T
		{
			System.out.print(" "+i);
			i++;//++i;
		}
		System.out.println("---------------");
		for(int j=1; j<=10; j++)
		{
			System.out.print(" "+j);
		}
		// infinite time
		/*
		 * while(true) { System.out.println("hi");
		 * 
		 * }
		 */

		/*
		 * while(true) { System.out.println("hi"); break; }
		 */

		/*
		 * while(false) { //error System.out.println("hi"); break; }
		 */

		/*
		 * int j=100; while(j%2==0) { System.out.println(j); j--; }
		 */
		System.out.println("-----");
		System.out.println(9 % 3);
		System.out.println(9 % 2);
		System.out.println(20 % 3);

		int z = 1;
		while (z <= 10) {

			if (z % 2 == 0) {
				System.out.println("even no" + z);

			}
			z++;
		}
		System.out.println("---------------");
		int q = 1;
		while (q <= 10) {

			if (q % 2 == 0) // (q%2!=0)
			{
				System.out.println("odd no" + q);

			}
			q++;
		}
		System.out.println("---------------");
		for(int a=1; a<=10;a++)
			
		{
			System.out.println("a :"+a);
			
		}
		System.out.println("---------------");
		for(int g=1; g<=10;g++)
		{
			System.out.println("g :"+g);
			if(g%5==0)
			{
				System.out.println("hello");
				//o/p: 12 345 hello678910heelo
				//break;  //12 345 hellop
			}
			//break;  //1
		}
		System.out.println("------ASCII---------");
		for(char ch='a'; ch<='z'; ch++)
		{
			System.err.println(ch+ "= "+(int)ch);
		}
		System.out.println("------ASCII---------");
		for(char ch='A'; ch<='Z'; ch++)
		{
			System.err.println(ch+ "= "+(int)ch);
		}
		
		System.out.println("---------------");
		int p = 1;
		while (p <= 10) {
			System.out.println(p);
			if (p == 5) {
				System.out.println("P is");
				break;
			}
			p++;
			// break;
		}
		
		System.out.println("----No break-----------");
		int w = 1;
		while (w <= 10) {
			System.out.println(w);
			if (w == 5) {
				System.out.println("w is");				
			}
			w++;			
		}
		
		System.out.println("----While break-----------");
		int r = 1;
		while (r <= 10) {
			System.out.println(r);
			if (r == 5) {
				System.out.println("r is");				
			}
			r++;
			break;
		}
		/*
		 * System.out.println("-----"); for(;true;) { System.out.println("Bye");//infine
		 * break;//1 time }
		 */
		/*
		 * System.out.println("---DoWhile----");//Infinite times int l=1; do {
		 * System.out.println(l); } while(l<=10);
		 */
		
		System.out.println("---DoWhile----");//Infinite times
		int m=1;
		do
		{
			System.out.println(m);
			m++;
		}
		while(m<=0);
	}
}
