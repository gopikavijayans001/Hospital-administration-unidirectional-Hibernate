
package hospital_app_helper;

import java.util.List;
import java.util.Scanner;

import hospital_app_Dao.BranchDao;
import hospital_app_Dao.Hospital_Dao;
import hospital_app_Dto.Branch;
import hospital_app_Dto.Hospital;

public class Hospital_helper {
	static Scanner scanner = new Scanner(System.in);
	static int enteredId;
	static String enteredName;
	static String enteredEmail;
	static String enteredType;
	static String enteredCeoname;
	static Hospital hospital = new Hospital();

// method to read the hospital data from the user
	public static int enterHospitalid() {
		System.out.println(" Enter the Hospital Id");
		enteredId = scanner.nextInt();
		return enteredId;
	}

	public static Hospital insertHospital() {

		System.out.println(" Enter the Hospital Id");
		enteredId = scanner.nextInt();
		scanner.nextLine();

		System.out.println(" Enter the Hospital name");
		enteredName = scanner.next();
		scanner.nextLine();

		System.out.println(" Enter the Hospital Ceo name");
		enteredCeoname = scanner.next();
		scanner.nextLine();

		System.out.println(" Enter the Hospital type");
		enteredType = scanner.next();
		scanner.nextLine();

		System.out.println(" Enter the Hospital email");
		enteredEmail = scanner.next();
		scanner.nextLine();

		hospital.setHospitalId(enteredId);
		hospital.setName(enteredName);
		hospital.setCeoName(enteredCeoname);
		hospital.setType(enteredType);
		hospital.setEmail(enteredEmail);

//		Branch branch = Branch_helper.insertBranch();
//		Branch saveBranch = BranchDao.saveBranch(branch);
 
		return hospital;

	}

}
