package com.csi.encapsulation;

public class Employee {
private int empId;
private String empname;
public int getEmpId() {
	return empId;
// added comments	
	
	
	//Hey wowww
	
	//Mahesh Magar Sir
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public static void main(String[] args) {
	Employee  e1 = new Employee();
	e1.setEmpId(121);
	e1.setEmpname("SWARA");
	System.out.println("\n Employee Id:"+ e1.getEmpId() + "\n Employee Name:"+ e1.getEmpname());
}
}
