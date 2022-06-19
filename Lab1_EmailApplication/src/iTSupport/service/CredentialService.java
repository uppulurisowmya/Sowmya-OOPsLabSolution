package iTSupport.service;

import java.util.Random;

import iTSupport.pojo.Employee;

public class CredentialService {
	
	private Employee employee;
	
	public CredentialService(Employee employee) {
		super();
		this.employee = employee;
	}
	
	public void generatePassword(int length) {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String password;
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] passwordarray = new char[length];

	      passwordarray[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      passwordarray[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      passwordarray[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      passwordarray[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	    	  passwordarray[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      password= new String(passwordarray);
	      employee.setPassword(password);
	      
	   }
	
	
	public void generateEmailAddress() {
		
		employee.setEmail(employee.getFirstName()+employee.getLastName()+"@"+employee.getDept()+".greatlearning.com");
		
	}
	
	public void showCredentials() {
		System.out.println("EmailID --->"+employee.getEmail());
		System.out.println("Password --->"+employee.getPassword());
	}
}
