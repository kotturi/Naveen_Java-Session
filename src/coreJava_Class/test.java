package coreJava_Class;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		//String s=new String(ch);  
		
		String s1="javatpoint";  String s2="Tutorial"; 
		String sen=s1+s2;
		System.out.println("Text & length :" +sen+sen.length());
		String s= "hello world";
		StringBuffer sb= new StringBuffer(s);
		System.out.println("Cap:"+sb.capacity());
		
		
		StringBuilder bui= new StringBuilder("welcome jo");
		System.out.println(bui.reverse());
		System.out.println("Cap:"+sb.capacity());
		//System.out.println(sb);
		//sb.append(" World" );
		System.out.println("Sentence: "+ sb);
		System.out.println("Reverse: "+ sb.reverse());
		sb.insert(5, "ABC");
		System.out.println(sb);
		sb.delete(5, 5);
		System.out.println(sb);
		
		//System.out.println("String :" +s);

	}

}
