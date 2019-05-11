package com.jspiders.app.controller;

public class StudentDao 
	{
	String firstName;
	String lstName;
	String mobNo;
	String stream;
	String date;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLstName() {
		return lstName;
	}
	public void setLstName(String lstName)
	{
		this.lstName = lstName;
	}
	public String getMobNo() 
	{
		return mobNo;
	}
	public void setMobNo(String mobNo)
	{
		this.mobNo = mobNo;
	}
	public String getStream() 
	{
		return stream;
	}
	public void setStream(String stream)
	{
		this.stream = stream;
	}
	public String getDate()
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	@Override
	public String toString() {
		return "StudentDao [firstName=" + firstName + ", lstName=" + lstName + ", mobNo=" + mobNo + ", stream=" + stream
				+ ", date=" + date + "]";
	}
	public StudentDao(String firstName, String lstName, String mobNo, String stream, String date) {
		super();
		this.firstName = firstName;
		this.lstName = lstName;
		this.mobNo = mobNo;
		this.stream = stream;
		this.date = date;
	}
	public StudentDao() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
