package com.demo.springbootDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //it specifies this is a bean class
public class Customers {
	private int custid;
	private String custname;
	private String coursename;
	
	@Autowired  //to know the existence of technologies class
	private Technologies techdetail;
	public Technologies getTechdetail() {
		return techdetail;
	}
	public void setTechdetail(Technologies techdetail) {
		this.techdetail = techdetail;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public void display() {
		System.out.println("Customer Object returned successfully");
		techdetail.techDisplay();
	}
	
}