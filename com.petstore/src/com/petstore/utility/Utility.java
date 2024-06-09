package com.petstore.utility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.petstore.core.Orders;
import com.petstore.core.Pet;
import com.petstore.core.User;
import com.petstore.enums.OrderEnum;
import com.petstore.enums.PetEnums;
import com.petstore.enums.UserEnum;

public class Utility {

	public static List<User> populateUser() {
		User u1 = new User("user1","pass1",UserEnum.ADMIN);
		User u2 = new User("user2","pass2",UserEnum.CUSTOMER);
		User user[] = {u1,u2};
		List<User> list = new LinkedList<>(Arrays.asList(user));
		return list;
	}

	public static User validateLogin(String userid, String pass, List<User> list) {
		User user = new User(userid,pass);
		if(list.contains(user)) {
			int pos = list.indexOf(user);
			return list.get(pos);
		}	
		return null;
	}
//	petId, name, category, unitPrice, stocks
	public static String addPet(String name, String categ, double price, int stocks, Map<Integer, Pet> petMap) {
		PetEnums petenum = PetEnums.valueOf(categ);
		Pet pet = new Pet(name,petenum,price,stocks);
		petMap.put(pet.getPetID(), pet);		
		return "Pet added !!";
	}

	public static String updatePet(int petId, String name, String cate, double price, int stock,
			Map<Integer, Pet> petMap) {
		PetEnums petenum = PetEnums.valueOf(cate);
		if(petMap.containsKey(petId)) {
			Pet pet= petMap.get(petId);
			pet.setName(name);
			pet.setCat(petenum);
			pet.setStocks(stock);
			pet.setUnitPrice(price);
			return "Updated Pet";
			
		}
		else 
			return "Failed to Update";
		
	}

	public static void displayPets(Map<Integer, Pet> petMap) {
		petMap.values().forEach((v)->System.out.println(v));
		
	}

	public static String placeOrder(int petid, int quantity, Map<Integer, Orders> orderMap, Map<Integer, Pet> petMap) {
		if(petMap.containsKey(petid)) {
			Pet pet = petMap.get(petid);
			if(pet.getStocks()>quantity) {
				int remain = pet.getStocks()-quantity;
				Orders order = new Orders(petid,quantity,OrderEnum.PLACED);
				orderMap.put(order.getOrderId(),order);
				pet.setStocks(remain);
				return "Order Placed";
				
			}
			else {
				return "Quantity not in Stock";
			}
		}
		return "Incorrect PetId";
	}

	public static void getOrderDetails(Map<Integer, Orders> orderMap) {
		orderMap.values().forEach((v)->System.out.println(v));
		
	}

	public static OrderEnum getOrderStatus(int oid, Map<Integer, Orders> orderMap) {
		if(orderMap.containsKey(oid)) {
			Orders order = orderMap.get(oid);
			return order.getStatus();
			}
		return null;
	}

	public static String updateOrderStatus(int orderId, String status, Map<Integer, Orders> orderMap) {
		OrderEnum setStatus = OrderEnum.valueOf(status);
		if(orderMap.containsKey(orderId)) {
			Orders order = orderMap.get(orderId);
			order.setStatus(setStatus);
			return "Status Set";
		}
		return "Failed";
	}

	public static Map<Integer, Pet> populatePet() {
		Map<Integer,Pet> map = new HashMap<>();
		Pet pet1 = new Pet("Tommy",PetEnums.ELEPHANT,2344,20);
		Pet pet2= new Pet("Moti",PetEnums.LION,4444,12);
		Pet pet3 = new Pet("Kori",PetEnums.SHARK,8644,7);
		Pet pet4 = new Pet("Hari",PetEnums.MONKEY,67844,5);
		Pet[] arr= {pet1,pet2,pet3,pet4};
		for(Pet p : arr) {
			map.put(p.getPetID(), p);
		}
		return map;
	}
	

}
