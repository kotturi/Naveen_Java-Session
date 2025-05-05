package ArrayListConcepts;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {

		ArrayList ar= new ArrayList();
		System.out.println(ar.size());
		System.out.println(ar);
		ar.add(100);
		ar.add(20.20);
		
		ArrayList<Integer> marksList= new ArrayList<Integer>();
		marksList.add(100);
		ArrayList<Double> bmiList= new ArrayList<Double>();
		bmiList.add(12.34);
		ArrayList<String> EmpList= new ArrayList<String>();
		EmpList.add("jyothi");
		System.out.println(EmpList);
		ArrayList<Object> empData= new ArrayList<Object>();
		empData.add(100);
		empData.add("jaya");
		empData.add(12.23);
		empData.add('C');
		
		System.out.println("Emp Detaisl:"+ empData);
		
		
	}

}
