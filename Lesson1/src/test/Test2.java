package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import algorithm.sort.Test;

public class Test2 {
	
	
	
	public static void main(String[] arg)
	{
	
		Object o;
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		
		HashMap<String, String> hash = new HashMap<String, String>();
		
		hash.put("Red", "Красный");
		hash.put("Blue", "Синий");
		hash.put("green", "Зеленый");
		
		
		list.add(1);
		list.add(2);
		list.add(13);
		list.add(0);
		list.add(10);
		
		
		System.out.println(hash.get("Red"));
				
		
		Collections.sort(list);
		
		Integer[] a = new Integer[list.size()];
		list.toArray(a);
	
		Test.print(a);
	   
		
		
	//	Test.sort(a);
		
		
		//List<> arr = new  
	}
	
	
}
