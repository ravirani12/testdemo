package org.Company;

public class EMP {

private void employeeDetail(String name) {
	System.out.println("EmployeeNmae ;"+name);
}
private void employeeDetail(long mobilenumber) {
	System.out.println("employee mobilenumber ;"+mobilenumber);
}
private void employeeDetail(int salary) {
	System.out.println("employee salary ;"+salary);
}
private void employeeDetail(String address,boolean status) {
	System.out.println("employee address ;"+address+"\n"+"employee status ;"+status);
}
private void employeeDetail(boolean status,int empid) {
	System.out.println("employee status ;"+status+"\n"+"empid is ;"+empid+"\n"+"\n"+"New EmployeeDetails\n");
}
public static void main(String[] args)
{
	EMP v = new EMP();
	v.employeeDetail("Suriya");
	v.employeeDetail(123456789);
	v.employeeDetail(1234578);
	v.employeeDetail("Vellore", true);
	v.employeeDetail(false, 1008086);
	
	v.employeeDetail("manigandan");
	v.employeeDetail(12345678);
	v.employeeDetail(12345678);
	v.employeeDetail("vellore", true);
	v.employeeDetail(false, 1008081);
	
}
}
	
	
