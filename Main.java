import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		System.out.println(l);
		System.out.println("Max Element: "+Collections.max(l));
		System.out.println("Min Element: "+Collections.min(l));
		
		Set<String> s=new HashSet<>();
		s.add("Nike");
		s.add("Puma");
		s.add("Gucci");
		s.add("Celine");
		s.add("Chanel");
		System.out.println(s);
		s.forEach((n)->System.out.println(n));
		
		Set<String> s1=new TreeSet<>();
		s1.add("Sudha");
		s1.add("Sakshi");
		s1.add("Rutuja");
		s1.add("Aditi");
		s1.add("Nutan");
		System.out.println(s1);
		s1.forEach((n)->System.out.println(n));
		
		Map<Integer,String> m=new HashMap<>();
		m.put(101,"Car");
		m.put(110,"Bike");
		m.put(131,"Jeep");
		m.put(151,"Airplane");
		m.put(161,"Trunk");
		m.put(null, null);
		System.out.println(m);
		for(Map.Entry<Integer,String> e:m.entrySet())
		{
			System.out.println(e);
		}
		//Hashmap can have a null value and also a null key
		
		System.out.println();
		
		Map<Integer,String> m1=new TreeMap<>();
		m1.put(11,"Hardiki");
		m1.put(12,"Sandhya");
		m1.put(13,"Shri");
		m1.put(15,"Khushbu");
		m1.put(16,"Sanika");
		System.out.println(m1);
		for(Map.Entry<Integer,String> e:m1.entrySet())
		{
			System.out.println(e);
		}
		
		System.out.println();
		
		Hashtable<Integer,String> h=new Hashtable<>();
		h.put(100, "Google");
		h.put(101, "Facebook");
		h.put(102, "Microsoft");
		h.put(103, "Lowe's");
		h.put(104, "Walmart");
		System.out.println(h);
		//h.putIfAbsent(null, "Atlassian");
		//h.putIfAbsent(105, null);
		//System.out.println(h);
		//Hastable cannot have null key nor null value
	}

}
