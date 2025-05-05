package Practice_Assignments;

public class DataTypes {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Naveen K";		
		System.out.println(a+" "+b);				
		System.out.println("-----ADD---");		
		int a1=74 ;
		int a2=36;
		System.out.println(a1+a2);
		System.out.println("---x`-----");
		int k=50/3;
		System.out.println(k);
		System.out.println("-----Try to concat \"Hello Selenium\" with a character 't'------");
		String s="Hello Selenium";
		System.out.println(s.concat("t"));
		System.out.println("-----Add them and concatenate and generate this output String------");
		int x=100, y=200,z=3400;
		System.out.println("Your output string is :"+(x+y+z));
		System.out.println("-----Write a program to find the square of the number 3.9----");
		int m=3;
		int n=m*m;		
		System.out.println(n);
		System.out.println("-----Print the ASCII value of the character 'h----");
		char c='h';
		System.out.println((int)c);
		System.out.println("-----Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.---");
		char d='d';
		System.out.println((int)d);
		System.out.println((int)d+3);						
	}
}
