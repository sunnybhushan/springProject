package com.jspider.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	int id;
	String add;
	String name;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String add, String name) {
		super();
		this.id = id;
		this.add = add;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", add=" + add + ", name=" + name + "]";
	}
	
}
