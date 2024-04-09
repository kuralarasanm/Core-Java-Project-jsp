
package serviceimpl;
import java.util.Scanner;

import entity.Employee;

import java.util.ArrayList;
import service.Employeeservice;
public class EmployeeServiceimpl implements Employeeservice{
	Scanner ip=new Scanner(System.in);
    ArrayList<Employee> l1= new ArrayList<Employee>();
	@Override
	public void addEmp() {
		System.out.println("enter employee details");
		System.out.println("enter employee id");
		int eid=ip.nextInt();
		System.out.println("enter employee name");
		String ename=ip.next();
		System.out.println("enter employee designation");
		String edesignation=ip.next();
		System.out.println("enter employee sal");
		double esal=ip.nextDouble();
		System.out.println("enter employee phno");
		long ephno=ip.nextLong();
		System.out.println("enter employee age");
		int eage=ip.nextInt();
		l1.add(new Employee(eid,ename,edesignation,esal,ephno,eage));
		System.out.println("============employeee added succesfully🤙🤙🤙🤙🤙🤙🤙🤙🤙🤙🤙=======");
		
	}
	@Override
	public void getAllEmp() {
		System.out.println("=========Employee details=======");
		if(l1.size()==0) {
			System.out.println("there are no employees");
		}
		else {
		      for(Employee emp:l1) {
		    	  System.out.println(emp);
		      }
		}
	}
	
    
}
