package com.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.entity.Cricketer;

public class Utility {
	public static List<Cricketer>  populateList() {	
		Cricketer c1 = new Cricketer("name",23,"gmail","1243sfg515",7);
		Cricketer c2 = new Cricketer("name2",43,"gmail2","12436sfg3515",8);
		Cricketer c3 = new Cricketer("name3",63,"gmail3","1244fg53515",9);
		Cricketer c4 = new Cricketer("name4",83,"gmail4","1243515",4);
		Cricketer c5 = new Cricketer("name5",13,"gmail5","124tg43515",5);
		Cricketer c6 = new Cricketer("name6",73,"gmail6","1243ert515",10);		
		List<Cricketer> list = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5,c6));

		return list;
	}
	public static void addPlayer(List<Cricketer> list,Cricketer c) {
		list.add(c);
		System.out.println("Added success");
	}
	public static void displayAll(List<Cricketer> list) {
		list.forEach(l->System.out.println(l));
	}
	
	public static void updRate(List<Cricketer> list,String name,int rate) {
		Cricketer c = new Cricketer(name);
		if(list.contains(c)) {
			int ind = list.indexOf(c);
			Cricketer crik = list.get(ind);
			crik.setRating(rate);	
			System.out.println("Updated Ratings");
		}
		else {
			
			System.out.println("Updated Ratings Failed");
		}
		
	}

	
}
