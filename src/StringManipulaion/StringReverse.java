package StringManipulaion;

public class StringReverse {

	static String rev="";
	public static String stringRev(String s)
	{
		for(int i=s.length()-1; i>=0;i--)
		{
			rev= rev+s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		String s="jyothi kotturi 1234y";
		System.out.println(StringReverse.stringRev(s));
	}

}
