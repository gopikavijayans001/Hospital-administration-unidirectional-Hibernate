package hospital_app_helper;

import java.util.Scanner;

import hospital_app_Dto.Address;
import hospital_app_Dto.Branch;

public class Address_helper {
	static Scanner scanner = new Scanner(System.in);
	static long enteredAddressId;
	static String enteredStreet;
	static String enteredCity;
	static String enteredDistrict;
	static int enteredPincode;
	static Address address = new Address();

	public static Address insertAddress() {
		
		System.out.println(" Enter the Address id");
		 enteredAddressId= scanner.nextLong();
		 scanner.nextLine();
		 
		 System.out.println(" Enter the District");
		 enteredDistrict= scanner.nextLine();
		 
		 System.out.println(" Enter the City");
		 enteredCity= scanner.nextLine();
		 
				 
		 System.out.println(" Enter the Street");
		 enteredStreet= scanner.nextLine();
		 scanner.nextLine();
		 		 
		 System.out.println(" Enter the Pincode");
		 enteredPincode= scanner.nextInt();
		 
		
		 address.setAddressId(enteredAddressId);
		 address.setDistrict(enteredDistrict);
		 address.setCity(enteredCity);
		 address.setStreet(enteredStreet);
		 address.setPincode(enteredPincode);
		 		 
		 return address;
		 
			}
	
	
	
	
	
	
}
