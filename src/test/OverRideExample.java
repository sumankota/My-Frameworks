package test;

import java.util.*;  
class OverRideExample{  
	@SuppressWarnings("unchecked")  
	public static void main(String args[]){  
		ArrayList list=new ArrayList();  
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  

		for(Object obj:list)  
			System.out.println(obj);  

	}}  
