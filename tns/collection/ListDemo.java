package com.tns.collection;
import java.util.List;
import java.util.*;


public class ListDemo {

	public static void main(String[] args) {
		List ob=new ArrayList<>();
		ob.add(4);
		ob.add(6);
		ob.add("Vinayak");
		ob.add(13.6f);
		ob.add(null);
		System.out.println(ob);
		ob.remove(0);
		System.out.println(ob);
		System.out.println(ob.contains(6));
		System.out.println(ob.isEmpty());
		
		// TODO Auto-generated method stub

	}

}
