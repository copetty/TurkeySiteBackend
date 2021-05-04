package com.turkey.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="order")
	@SequenceGenerator(name="order", sequenceName="ORDER_SEQ", allocationSize=1)
	@Column(name="ORDER_ID")
	private int orderId;
	
	@Column(name="CALL_ID", columnDefinition="INT")
	private int callId;
	
	@Column(name="CALL_PRICE", columnDefinition="NUMERIC")
	private int callPrice;
	
	@Column(name="QUANTITY", columnDefinition="INT")
	private int quantity;

	public Order() {
		super();
	}
	
	

}
