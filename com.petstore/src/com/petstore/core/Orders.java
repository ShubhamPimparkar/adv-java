package com.petstore.core;

import com.petstore.enums.OrderEnum;

//orderId, petId, quantity, status)

public class Orders {
	private static int count; 
	private int orderId;
	private int petId;
	private int quantity;
	private OrderEnum status;
	static {
		count=1;
	}
	public Orders() {
	}
	
	public Orders(int petId, int quantity, OrderEnum status) {
		super();
		this.orderId=count++;
		this.petId = petId;
		this.quantity = quantity;
		this.status = status;
	}

	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public OrderEnum getStatus() {
		return status;
	}
	public void setStatus(OrderEnum status) {
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + "]";
	}
	
}
