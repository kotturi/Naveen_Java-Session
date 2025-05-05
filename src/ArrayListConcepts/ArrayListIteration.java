package ArrayListConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<Integer> marksList= new ArrayList<Integer>();
		marksList.add(100);//0
		marksList.add(200);
		marksList.add(300);
		marksList.add(400);
		marksList.add(500);//4	
		
		System.out.println(marksList);//[100, 200, 300, 400, 500]

		for(int i=0; i<marksList.size();i++)
		{
			System.out.println(marksList.get(i));
		}
		
		for(Integer e:marksList)
		{
			System.err.println(e);
		}
		
		ArrayList<Object> empData= new ArrayList<Object>();
		empData.add(100);
		empData.add("jaya");
		empData.add(12.23);
		empData.add('C');
		empData.add("Pune");
		empData.add("India");
		
		System.out.println("Emp Detaisl:"+ empData);
		
		for(Object o: empData)
		{
			System.err.println(o);
			if(o.equals("Pune"))
			{
				System.out.println("Use Selenium");
				//break;
			}
				
		}
		
		List<String> li= new ArrayList<String>();
		li= new  LinkedList<String>();
		li= new  Vector<String>();
		
		
		
		
		
	}

}
