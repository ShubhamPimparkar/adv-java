package com.ser;

import java.io.Serializable;

public class Demo implements Serializable {
	private int a;
	private String b;
	private double c;
	public Demo() {
		// TODO Auto-generated constructor stub
	}
	
	public Demo(int a, String b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
