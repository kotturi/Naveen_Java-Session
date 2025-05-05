package HashMapConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();

		m.put("c", 1);
		m.put("b", 3);
		m.put("a", 2);
		m.put(null, 2);
		
		System.out.println(m.size());
		System.out.pri ntln(m);
		// m.remove('a');

		Map<String, Integer> n = new LinkedHashMap<String, Integer>();

		n.put("c", 1);
		n.put("b", 3);
		n.put("a", 2);
		n.put(null, 2);
		
		System.out.println(n);
		
		Map<String, Integer> t = new TreeMap<String, Integer>();

		t.put("c", 1);
		t.put("B", 3);
		t.put("a", 2);
		t.put("123", 2);
		//t.put(null, 2);
		System.out.println(t);
	}

}
