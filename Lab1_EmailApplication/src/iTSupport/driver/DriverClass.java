package iTSupport.driver;

import java.util.Scanner;

import iTSupport.pojo.Employee;
import iTSupport.service.CredentialService;

public class DriverClass {
	
public static void main(String[] args) {
		
	Employee emp = new Employee("Harshit", "Choudary");
		CredentialService cs = new CredentialService(emp);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical \n"+"2. Admin \n"+"3. Human Resource \n" + "4. Legal");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			emp.setDept("tech");
			break;
			
		case 2:
			emp.setDept("admin");
			break;
			
		case 3:
			emp.setDept("hr");
			break;
			
		case 4:
			emp.setDept("legal");
			break;
		}
		
		cs.generateEmailAddress();
		cs.generatePassword(8);
		cs.showCredentials();
	}
}
