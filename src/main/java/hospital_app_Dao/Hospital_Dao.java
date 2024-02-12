package hospital_app_Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app_Dto.Branch;
import hospital_app_Dto.Hospital;

public class Hospital_Dao {
	static EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = entityFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
	static Hospital hospital = new Hospital();

	// method to check the hospital is exist or not
	public static boolean findHospital(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null)
			return true;
		else
			return false;
	}

	// method to save the hospital datas
	public static Hospital saveHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		System.out.println("Data saved successfully....!");
		return hospital;
	}

	public static Hospital updateHospitalBranchList(int id, Branch branch) {
		Hospital enteredHospital = entityManager.find(Hospital.class, id);
		List<Branch> branchList = BranchDao.saveBranchList(branch);
		enteredHospital.setBranch(branchList);
		entityTransaction.begin();
		entityManager.merge(enteredHospital);
		entityTransaction.commit();
		return enteredHospital;
	}

}
