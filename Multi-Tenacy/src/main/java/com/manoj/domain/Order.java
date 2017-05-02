package com.manoj.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	public Order() {
	}

	public Order(Date date) {
		this.date = date;
	}

	@Id
	@Column(nullable = false, name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false, name = "date")
	private Date date;
}
