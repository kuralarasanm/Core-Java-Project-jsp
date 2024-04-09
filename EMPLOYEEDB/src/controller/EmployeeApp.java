package controller;
import java.util.Scanner;
import service.Employeeservice;
import serviceimpl.EmployeeServiceimpl;
public class EmployeeApp {

	public static void main(String[] args) {
		Employeeservice e=new EmployeeServiceimpl();
		 Scanner ip=new Scanner(System.in);
		System.out.println("welcome to employee database");
		while(true) {
			System.out.println("add Employee\n2Display all employee details\n3. Exit");
			System.out.println("please enter your option");
			int op=ip.nextInt();
			switch(op) {
			case 1:e.addEmp();break;
			case 2:e.getAllEmp();break;
			case 3:System.out.println("thANK YOU VISIT AGAIN");
				System.exit(0);
				default:System.out.println("======INVALID OPTION=============");
			}
		}
	}

}
