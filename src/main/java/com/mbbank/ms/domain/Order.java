package com.mbbank.ms.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String orderId;
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	@Column(nullable = false)
	private int customerId;
	
	@Column(nullable = false)
	private double amount; // tong tien cua don hang
	
	@Column(nullable = false)
	private short status;

}
