package InterviewPractice;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar= new ArrayList(5);
	System.out.println(ar.size());
	System.out.println(ar);
	ar.add(12);
	ar.add("jyothi");
	ar.add(12.22);
	ar.add(13.33);
	ar.add(991291818);
	System.out.println(ar.size());
	System.out.println(ar);
	ar.add(1, "swathi");
	System.out.println(ar);
	System.out.println(ar.size());
	ar.set(0,10);
	System.out.println(ar);
	
	ArrayList<String>  b= new ArrayList<String>();
	b.add("a");
	b.add("b");
	b.add("1");
	System.out.println(b);
	
	
	ArrayList<Object>  c= new ArrayList<Object>();
	c.add("a");
	c.add(12.22);
	c.add(1);
	System.out.println(c );
	
	ArrayList<Integer>  marks= new ArrayList<Integer>();
	marks.add(100);
	marks.add(200);
	marks.add(300);
	marks.add(400);
	System.out.println(marks);
	System.err.println(marks.size());
	for(int i=0; i<marks.size();i++)
	{
		System.out.println(marks.get(i));
	}
	
	for(Integer e:marks)
	{
		System.out.println(e);
	}
	
	}

}
