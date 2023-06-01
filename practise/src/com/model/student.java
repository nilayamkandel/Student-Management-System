package com.model;

public class student {
	private int RollNo;
	private String Name;
	private String address;
		
	public student(int rollNo, String name, String address) {
		this.RollNo = rollNo;
		this.Name = name;
		this.address = address;
	}

	public int getRollNo() {
		return RollNo;
	}
	
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "\n student [RollNo=" + RollNo + ", Name=" + Name + ", address=" + address + "]";
	}
	
	
}

