package com.petstore.tester;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.petstore.core.Orders;
import com.petstore.core.Pet;
import com.petstore.core.User;
import com.petstore.enums.OrderEnum;
import com.petstore.enums.UserEnum;
import com.petstore.utility.Utility;

public class Test {

	public static void main(String[] args) {
	List<User> list=Utility.populateUser();
	Map<Integer,Pet> petMap = Utility.populatePet();
	Map<Integer,Orders> orderMap = new HashMap<>();

	try(Scanner sc = new Scanner(System.in)){
		boolean exit=false;
		while(!exit) {
			System.out.println("1.Login  0.Exit");
			switch (sc.nextInt()) {
			case 1:	
				System.out.println("Enter userid  -  password");
				User user = Utility.validateLogin(sc.next(),sc.next(),list);
				if(user !=null && user.getUenum()==UserEnum.ADMIN) {
					System.out.println("Welcome Admin !! : "+user.getuserid());
					boolean out=false;
					while(!out) {
						System.out.println("1.Add new Pet \n2.Update Pet details \n3.Update order status \n4.Display all available pets \n5.Show All Orders ");
						switch (sc.nextInt()) {
						case 1:	
//						petId, name, category, unitPrice, stocks
							System.out.println("Enter Name - Category - Price - Stock ");
							String res =Utility.addPet(sc.next(),sc.next(),sc.nextDouble(),sc.nextInt(),petMap);
							System.out.println(res);
							break;
						case 2:	
							System.out.println("Update Pet - petId, name, category, unitPrice, stocks");
							String res2 = Utility.updatePet(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.nextInt(),petMap);
							System.out.println(res2);
							break;
						case 3:	
							System.out.println("Enter OrderId - Status");
							String res3=Utility.updateOrderStatus(sc.nextInt(),sc.next(),orderMap);
							System.out.println(res3);
							
							break;
						case 4:	
							Utility.displayPets(petMap);
							
							break;
						case 5:	
							
							Utility.getOrderDetails(orderMap);
							break;

						default:
							out=true;
							break;
						}
					}
									
				}
				
				if(user!=null && user.getUenum()==UserEnum.CUSTOMER) {
					System.out.println("Welcome Customer !! : "+user.getuserid());
					boolean out=false;
					while(!out) {
						System.out.println("1. Display All Pets \n2. Order a Pet \n3.Display Order \n4.Check Order Status \nExit");
						switch (sc.nextInt()) {
						case 1:
							Utility.displayPets(petMap);
							
							break;
						case 2:
//							orderId, petId, quantity, status)
							System.out.println("Order Pet - PetId - Quantity ");
							String res3 = Utility.placeOrder(sc.nextInt(),sc.nextInt(),orderMap,petMap);
							System.out.println(res3);
							break;
						case 3:
							Utility.getOrderDetails(orderMap);
							break;
						case 4:
							System.out.println("Enter OrderId");
							OrderEnum res4= Utility.getOrderStatus(sc.nextInt(),orderMap);
							if(res4!=null) {
								
								System.out.println("Order Status - "+res4);
							}
							else
								System.out.println("Order Not Placed");
							break;
		
						default:
							out=true;
							break;
						}
					}
					
				}
				break;
			case 0:	
				exit=true;
				break;
			default:
				
				break;
			}
		}
		
		}
	}
}

