package hospital_app_helper;

import java.util.Scanner;

import hospital_app_Dto.Person;

public class person_helper {
	static Scanner scanner = new Scanner(System.in);
    static int personId;
    static String gender;
    static String personName;
    static int age;
    static long phoneNumber;
    static String place;
	static Person person = new Person();
	
	public static int enterPersonid() {
		System.out.println(" Enter the Person Id");
	int	enteredId = scanner.nextInt();
		return enteredId;
	}
	
public static Person insertPerson() {
		
		System.out.println("The entered person doesn't exist\nplease enter the person details");
				
		System.out.println(" Enter the Person id");
		personId = scanner.nextInt();
		 scanner.nextLine();
		 
		 System.out.println(" Enter the  name");
			personName= scanner.nextLine();
		 
		 System.out.println(" Enter the Gender");
		 gender= scanner.nextLine();
		 
				 
		 System.out.println(" Enter the Age");
		 age= scanner.nextInt();
		 scanner.nextLine();
		 		 
		 System.out.println(" Enter the Phone number");
		 phoneNumber= scanner.nextLong();
		 
		 System.out.println(" enter the place");
		 place=scanner.next();
		
		
		 		 
		 return person;
	
	
	
}
	
	
	
	
	
	
	
	
	
	
}
