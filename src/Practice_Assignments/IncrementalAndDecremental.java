package Practice_Assignments;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		int i = 11;

		i = i++ + ++i; // 11+12=23

		System.out.println(i);

		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;  //

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}

}
