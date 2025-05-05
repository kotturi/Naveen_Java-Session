package ArrayListConcepts;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList ar= new ArrayList();
		//System.out.println(ar.get(0));//IOB Excep
		System.out.println(ar.size());
		System.out.println(ar);
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		System.out.println(ar);
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		System.out.println(ar);
		ar.remove(3);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		System.out.println(ar);
		
		ArrayList al= new ArrayList(5);
		al.add(1000);
		//System.out.println(al.get(0));
	//	al.add(3,3000);//IOB
		System.out.println(al);
		al.add(1,3000);//IOB
		System.out.println(al.get(1));
		
		ArrayList a= new ArrayList(5);
		a.add(10);//0
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		System.out.println(a);
		System.out.println(a.size());
		//a.add(1, 25);
		a.set(1,25);
		System.out.println(a);
		System.out.println(a.size());
		
		
		
		
		
	}

}
