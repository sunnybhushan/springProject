package com.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="student_table")
public class Student implements Serializable {
	
	private String fname;
	private String lname;
	private String mobileNo;
	@Id
	/*
	 * @GeneratedValue(generator="inc")
	 * 
	 * @GenericGenerator(name="inc", strategy="increment")
	 */
	private int rollNO;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getRollNO() {
		return rollNO;
	}

	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", mobileNo=" + mobileNo + ", rollNO=" + rollNO + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}