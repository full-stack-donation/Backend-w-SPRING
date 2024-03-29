package com.hh.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "donation")
public class Donation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private long number;
	@Column
	private String address;
	@Column
	private int amount;
	@Column
	@Temporal(TemporalType.DATE)
	private Date dod = new Date();
	
	public Donation() {
		// TODO Auto-generated constructor stub
	}
	
	public Donation(String name, long number, String address, int amount, Date dod) {
		super();
		this.name = name;
		this.number = number;
		this.address = address;
		this.amount = amount;
		this.dod = dod;
	}
	
	

	public Donation(String name, long number, String address, int amount) {
		super();
		this.name = name;
		this.number = number;
		this.address = address;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDod() {
		return dod;
	}

	public void setDod(Date dod) {
		this.dod = dod;
	}

	@Override
	public String toString() {
		return "Donation [id=" + id + ", name=" + name + ", number=" + number + ", address=" + address + ", amount="
				+ amount + ", dod=" + dod + "]";
	}
	
	
	
	

}
