package com.valtech.training.day4;

import java.util.ArrayList;

public class Department {
	private int did;
	private String dname;
	private String location;
	private String emplist;
	private String dempid;

	public Department(int did, String dname, String location, String emplist, String dempid) {
		super();
		did = did;
		dname = dname;
		this.location = location;
		this.emplist = emplist;
		this.dempid = dempid;
	}

	public Department(int did, String dname, String location) {
		super();
		did = did;
		dname = dname;
		this.location = location;
	}

	public Department() {
		super();

	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmplist() {
		return emplist;
	}

	public void setEmplist(String emplist) {
		this.emplist = emplist;
	}

	public String getDempid() {
		return dempid;
	}

	public void setDempid(String dempid) {
		this.dempid = dempid;
	}

	public static void main(String[] args) {
		ArrayList<Department> d = new ArrayList<Department>();
		d.add(new Department(10, "Bend", "bengaluru"));
		d.add(new Department(12, "Fend", "KA"));
		System.out.println("-----------------------");
		for (Department d1 : d) {
			System.out.println("Did " + d1.getDid() + " Experience " + d1.getDname() + " Name " + d1.getLocation());

		}

	}
}
