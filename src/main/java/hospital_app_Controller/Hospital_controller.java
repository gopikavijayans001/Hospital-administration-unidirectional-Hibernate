package hospital_app_Controller;

import java.util.Scanner;

import hospital_app_Dao.BranchDao;
import hospital_app_Dao.EncounterDao;
import hospital_app_Dao.Hospital_Dao;
import hospital_app_Dao.MedorderDao;
import hospital_app_Dao.PersonDao;
import hospital_app_Dto.Branch;
import hospital_app_Dto.Encounter;
import hospital_app_Dto.Medorder;
import hospital_app_Dto.Person;
import hospital_app_helper.Branch_helper;
import hospital_app_helper.Encounter_helper;
import hospital_app_helper.Hospital_helper;
import hospital_app_helper.Medorder_helper;
import hospital_app_helper.person_helper;

public class Hospital_controller {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("____WELCOME____");
		System.out.println("1.Save the Branch data\n2.Save the Encounter Data\n3.Save the Medorder data");
		Scanner scannner = new Scanner(System.in);
		int choice = scanner.nextInt();
		int hospitalId;
		switch (choice) {
		case 1: {
		
			hospitalId = Hospital_helper.enterHospitalid();
			boolean check = Hospital_Dao.findHospital(hospitalId);
			if (check == true) {
				Branch branch = Branch_helper.insertBranch();
				BranchDao.saveBranch(branch);
				Hospital_Dao.updateHospitalBranchList(hospitalId, branch);

			} else
				Branch_helper.choose();

		}
			break;

		case 2: {
		
			int personid = person_helper.enterPersonid();
			boolean checkPerson = PersonDao.findPerson(personid);
			int branchid = Branch_helper.enterBranchid();
			boolean checkBranch = BranchDao.findBranch(branchid);
			if (checkPerson && checkBranch == true) {
				Encounter encounter = Encounter_helper.insertEncounter();
				Encounter saveEncounter = EncounterDao.saveEncounter(encounter);
				EncounterDao.updateEncounterList(branchid, saveEncounter);
			}

			else {
				if (checkPerson != true) {
					Person person = person_helper.insertPerson();
					PersonDao.savePerson(person);
				}
				if (checkBranch != true) {

					int id = Hospital_helper.enterHospitalid();
					boolean check = Hospital_Dao.findHospital(id);
					if (check == true) {
						Branch branch = Branch_helper.insertBranch();
						BranchDao.saveBranch(branch);
					}
				}
			}
		}
			break;
		case 3: {

		
			int id = Encounter_helper.enterEncounterid();
			boolean check = EncounterDao.findEncounterid(id);
			if (check == true) {

				Medorder insertmedorder = Medorder_helper.insertMedorder();
				Medorder medorder = MedorderDao.saveMedorder(insertmedorder);
				

			} else
				System.out.println("Encounter data with the given id doesn't exist....!");
		}
			break;

		default:
			System.out.println("Enter the valid option");
			break;
		}

	}
}
