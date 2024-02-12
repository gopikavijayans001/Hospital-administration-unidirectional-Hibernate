package hospital_app_helper;

import java.util.List;
import java.util.Scanner;

import hospital_app_Dao.MedorderDao;
import hospital_app_Dao.PersonDao;
import hospital_app_Dto.Encounter;
import hospital_app_Dto.Medorder;
import hospital_app_Dto.Person;

public class Encounter_helper {
	static Scanner scanner = new Scanner(System.in);
	static int encounterId;
	static String admissionDate;
	static String dischargeDate;
	static String doctorName;
	static String procedure;
	static String testResult;
	static String symptoms;
	static Encounter encounter = new Encounter();

	public static int enterEncounterid() {
		System.out.println(" Enter the Encounter Id");
		encounterId = scanner.nextInt();
		return encounterId;
	}

	public static Encounter insertEncounter() {

		System.out.println(" Enter the Encounter Id");
		encounterId = scanner.nextInt();
		scanner.nextLine();

		System.out.println(" Enter the Admission date");
		admissionDate = scanner.next();
		scanner.nextLine();

		System.out.println(" Enter the Discharge date");
		dischargeDate = scanner.next();
		scanner.nextLine();

		System.out.println(" Enter the Doctor name");
		doctorName = scanner.next();
		scanner.nextLine();

		System.out.println(" Enter the procedure");
		procedure = scanner.next();
		scanner.nextLine();

		System.out.println(" Enter the Tests and results");
		testResult = scanner.next();
		scanner.nextLine();

		System.out.println(" Enter the symptoms");
		symptoms = scanner.next();
		scanner.nextLine();

		encounter.setEncounterId(encounterId);
		encounter.setAdmissionDate(admissionDate);
		encounter.setDischargeDate(dischargeDate);
		encounter.setDoctorName(doctorName);
		encounter.setProcedure(procedure);
		encounter.setSymptoms(symptoms);
		encounter.setTestResult(testResult);




		return encounter;

	}

}
