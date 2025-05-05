package StringManipulaion;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String str = "  hieiloi HI is jyothi asasi    ";

		System.out.println("Trim:" + str.trim());
		System.out.println("Upper:" + str.toUpperCase());
		System.out.println("Lower:" + str.toLowerCase());
		System.out.println("all:" + str.toLowerCase().trim());
		System.out.println("ALL:" + str.trim().toLowerCase());
		System.out.println(str.concat("ppp"));
		System.out.println("qwqwqw:" + str);
		System.out.println("Replace" + str.replace("h", "Z"));
		
	//equals
		String y="hi";
		String z="Hi";
		
		if (y.equalsIgnoreCase(z))
		{
			System.out.println("Both are =");
		}
		else
		{
			System.out.println("Not equal");
		}
	

		System.out.println(str.length());//
		int len = str.length();
		int li = 0;
		int hi = len - 1;
		System.out.println("String length :" + len);
		System.out.println("String Lowest :" + li);
		System.out.println("String Highest :" + hi);

		System.out.println("chat at " + str.charAt(1));
//		System.out.println(str.charAt(18)); //StringIndexOutOfBoundsException RunntimeExce

		System.out.println("1st i : " + str.indexOf('i'));// 1st occ
		System.out.println("2nd i : " + str.indexOf('i', str.indexOf('i') + 1));// 2nd occurance
		System.out.println("3nd i : " + str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1));// 3
		System.out.println(
				"4th i : " + str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1) + 1));// 4

		System.out.println(str.indexOf("Hi"));// 8
		System.out.println(str.indexOf("Hai"));// -1

		System.out.println(str.indexOf('i', 2));
		System.out.println(str.indexOf('i', str.indexOf('i') + 1));
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1));
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1));
		System.out.println(str.indexOf("hello"));

		String m = "welcome admin ";
		if (m.indexOf("admin") == 8)
			System.out.println("message is valid");
		else
			System.out.println("message is failed");

		// contains
		if (m.contains("admin"))
			System.out.println("message is valid");
		else
			System.out.println("message is failed");

		String a = "   welcome admin ";
		System.out.println(a.trim());

		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase().trim());

		// replace
		String dob = "12-3-1982";
		System.out.println(dob.replace("-", "/"));

		System.out.println(a.replace(" ", ""));

		// subString op:12345
		String orderMsg = "my order id is 12345";
		System.out.println(orderMsg.substring(5));// der id 12345
		System.out.println(orderMsg.substring(0, 10));// y order i
		System.out.println(orderMsg.substring(orderMsg.indexOf("is") + 2, orderMsg.length()).trim());

		// split
		String sp = "my_order_id_is_12345";
		String spp[] = sp.split("_");
		System.out.println(spp[0]);// my
		// System.out.println(Arrays.toString(sp p));//my

		// equals

		String t1 = "hello selenium";
		String t2 = "hello Selenium";
		System.out.println(t1.equals(t2));// false
		System.out.println(t1.equalsIgnoreCase(t2));// true

		// substring
		String q = "my odred id is 1234";
		System.out.println(q.substring(6));// ed id id 1234

		System.out.println(q.substring(0, 10));// my odred i
		System.out.println(q.substring(q.indexOf("is") + 3, q.length()));// 1234

		String l = "java_phthon_ruby";
		String lan[] = l.split("_");
		System.out.println(lan[0]);
		System.out.println(Arrays.toString(lan));
//		for(int i=0; i<=lan[];i++)
//		{
//		System.out.println(lan[i]);
//		}

		String top = "xXtestingXxXautomationXXxxApplicationX";
		String tp[] = top.split("xX");
		System.out.println(tp[0]);

	}

}
