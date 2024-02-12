package hospital_app_helper;

import java.util.List;
import java.util.Scanner;

import hospital_app_Dao.AddressDao;
import hospital_app_Dao.EncounterDao;
import hospital_app_Dao.Hospital_Dao;
import hospital_app_Dto.Address;
import hospital_app_Dto.Branch;
import hospital_app_Dto.Encounter;
import hospital_app_Dto.Hospital;

public class Branch_helper {
	static Scanner scanner = new Scanner(System.in);
	static int enteredId;
	static String enteredbranchName;
	static int enterednumDoctors;
	static int enterednumBeds;
	static long enteredphoneNumber;
	static Branch branch = new Branch();

	// method to insert the data of branch
	public static Branch insertBranch() {
		System.out.println(" Enter the Branch id");
		enteredId = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the Branch name");
		enteredbranchName = scanner.nextLine();
		scanner.nextLine();

		System.out.println("Enter the Phone number");
		enteredphoneNumber = scanner.nextLong();
		scanner.nextLine();

		System.out.println("Enter the Number of Doctors");
		enterednumDoctors = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the number of beds");
		enterednumBeds = scanner.nextInt();
		scanner.nextLine();

		branch.setBranchId(enteredId);
		branch.setBranchName(enteredbranchName);
		branch.setPhoneNumber(enteredphoneNumber);
		branch.setNumBeds(enterednumBeds);
		branch.setNumDoctors(enterednumDoctors);
		
		Address addressHelper = Address_helper.insertAddress();
		Address address = AddressDao.saveAddress(addressHelper);
		branch.setAddress(address);
		
//		Encounter encounter= Encounter_helper.insertEncounter();
//	Encounter saveEncounter=EncounterDao.saveEncounter(encounter);
//	List<Encounter> encounterList=	EncounterDao.SaveEncounterlist(saveEncounter);
//		branch.setEncounter(encounterList);
		
		return branch;
	}

	
	
	public static void choose() {
		System.out.println("1.Add the Hospital details\n2.Exit");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1: {
			Hospital hospital = Hospital_helper.insertHospital();
			Hospital_Dao.saveHospital(hospital);
		}

			break;

		case 2: {
			System.out.println("exiting...............");
		}
			break;
		default:
			System.out.println(" Enter the valid option");
			break;
		}

	}
	
	
	public static int enterBranchid() {
		System.out.println(" Enter the branch id");
	int enterid=scanner.nextInt();
		
		return enterid;
	
	}

}
