package com.cricket;

import java.util.List;
import java.util.Scanner;

import com.entity.Cricketer;
import com.utility.Utility;

public class Tester {

	public static void main(String[] args) {
		/*
		 * 1.Accept minimum 5 Cricketers in the collection.
		 * 
		 * 2.Modify Cricketer's rating
		 * s
		 * 3.Search Cricketer by name
		 * 
		 * 4. Display all Cricketers added in collection.
		 * 
		 * 5.Display All Cricketers in sorted form by rating.
		 */
		try(Scanner sc = new Scanner(System.in)){
				List<Cricketer> list = Utility.populateList();
				boolean exit=false;
				while(!exit) {
					
					System.out.println("1.Add Player    2.Update Rating    3.Display All");
					switch (sc.nextInt()) {
					case 1: 
						System.out.println("Enter Name  Age  Email   Phone   Rating ");
						Cricketer c = new Cricketer(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
						Utility.addPlayer(list,	 c);
						break;
					case 2: 
						System.out.println("Enter Name   Rating ");
						Utility.updRate(list, sc.next(), sc.nextInt());
						break;
					case 3: 
						Utility.displayAll(list);
						break;
					
					default:
						exit=true;
						break;
					}
					
				}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
