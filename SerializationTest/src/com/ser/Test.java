package com.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in);){
		
	
		Demo demo = new Demo(10,"Hello",30);
		System.out.println("Enter File Name");
		String file = sc.next();
		ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
		oout.writeObject(demo);
		System.out.println("Serialized...");
		
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
		Demo demo2 = (Demo) oin.readObject();
		System.out.println(demo2);
		System.out.println("De-Serialized...");
	}
	catch (Exception e) {
	
		e.printStackTrace();
	}
	

	}

}
