package StringManipulaion;

public class StringPool {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));// true
//then should not use '==' for string
		String s3 = new String("hello");
		System.out.println(s1 == s3);// false
		System.out.println(s1.equals(s3));// true

		StringBuilder sb = new StringBuilder("selenium");
		sb.append("Java");
		System.out.println(sb);

	}

}
