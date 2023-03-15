package com.sudha;

import java.util.*;

public class Vector { 
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("java");
		v.add("java");
		v.add("python");
		v.add("angular");
		v.add("react");
		v.add("bootstrap");
		
		Enumeration<String> e = v.elements ();
		while (e.hasMoreElements ())
		{

		System.out.println (e.nextElement());

		}
 }
}


