package com.turkey.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_USER")
public class OrderUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="orderUserSequence")
	@SequenceGenerator(name="orderUserSequence", sequenceName="ORDER_USER_SEQ", allocationSize=1)
	@Column(name="ORDER_USER_ID")
	private int orderUserId;
	
	@Column(name="TOTAL_PRICE", nullable=false, columnDefinition="NUMERIC")
	private double totalPrice;

}

