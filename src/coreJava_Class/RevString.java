package coreJava_Class;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="qwert";
String rev="";
//int p=s.length();
//System.out.println("p"+p);
for(int i=s.length()-1;i>=0;i++)
{
	rev+=s.charAt(i);
	System.out.println(rev);
	
}
System.out.println(rev);
	}

}
