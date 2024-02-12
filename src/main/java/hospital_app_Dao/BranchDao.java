package hospital_app_Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app_Dto.Branch;

public class BranchDao {
	static EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = entityFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();

	// method to save the details of branch
	public static Branch saveBranch(Branch branch) {
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();

		return branch;
	}

	public static boolean findBranch(int id) {
		Branch branch = entityManager.find(Branch.class, id);
		if (branch != null) {
			return true;
		} else
			return false;
	}

	public static List<Branch> saveBranchList(Branch branch) {
		List<Branch> branchList = new ArrayList<Branch>();
		branchList.add(branch);
		return branchList;
	}
	
	
	
	

}
