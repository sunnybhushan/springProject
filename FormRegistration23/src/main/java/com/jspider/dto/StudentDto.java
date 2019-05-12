package com.jspider.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Student")
public class StudentDto implements Serializable
{
	@Id
	@GeneratedValue(generator="abc")
	@GenericGenerator(name="abc", strategy="increment")
	int rollNo;
	@Column(name="student_fname")
	String firstName;
	String lstName;
	String mobNo;
	String stream;
	String date;
	String isMaried;
	String subject;
	String address;
	
	@Embedded
	Address add;

	public StudentDto(int rollNo, String firstName, String lstName, String mobNo, String stream, String date,
			String isMaried, String subject, String address, Address add) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lstName = lstName;
		this.mobNo = mobNo;
		this.stream = stream;
		this.date = date;
		this.isMaried = isMaried;
		this.subject = subject;
		this.address = address;
		this.add = add;
	}

	@Override
	public String toString() {
		return "StudentDto [rollNo=" + rollNo + ", firstName=" + firstName + ", lstName=" + lstName + ", mobNo=" + mobNo
				+ ", stream=" + stream + ", date=" + date + ", isMaried=" + isMaried + ", subject=" + subject
				+ ", address=" + address + ", add=" + add + "]";
	}

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLstName() {
		return lstName;
	}

	public void setLstName(String lstName) {
		this.lstName = lstName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIsMaried() {
		return isMaried;
	}

	public void setIsMaried(String isMaried) {
		this.isMaried = isMaried;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	

}
