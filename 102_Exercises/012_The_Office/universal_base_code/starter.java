/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(10);
		dwight.employeeToString();
		System.out.println("Dwight Annual salary: "+dwight.getAnnualSalary());
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(8);
		jim.employeeToString();
		System.out.println("Jim Annual salary: "+jim.getAnnualSalary());
	
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.raiseSalary(12);
		pam.employeeToString();
		System.out.println("Pam Annual salary: "+pam.getAnnualSalary());
		
		Employee john = new Employee(3634, "John", "John", 5020);
		john.raiseSalary(5);
		john.employeeToString();
		System.out.println("John Annual salary: "+john.getAnnualSalary());
	}
}
