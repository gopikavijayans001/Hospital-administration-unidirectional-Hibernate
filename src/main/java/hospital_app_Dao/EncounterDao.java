package hospital_app_Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app_Dto.Branch;
import hospital_app_Dto.Encounter;
import hospital_app_Dto.Hospital;



public class EncounterDao {
	static EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = entityFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public static boolean findEncounterid(int id) {
		Encounter  encounter = entityManager.find(Encounter.class, id);
		if (encounter != null)
			return true;
		else
			return false;
	}
	
	
	
	
	public static Encounter saveEncounter(Encounter encounter) {
		entityTransaction.begin();
		entityManager.persist(encounter);
		entityTransaction.commit();
		
		return encounter;
	}
	
	
	public static List<Encounter> saveEncounterlist(Encounter encounter){
		
		List<Encounter> encounterlist = new ArrayList<Encounter>();
	encounterlist.add(encounter);
		return encounterlist;
		
	}
	public static Branch updateEncounterList(int id,Encounter encounter) {
		Branch enteredBranch = entityManager.find(Branch.class, id);
		List<Encounter> encounterList = saveEncounterlist(encounter);
		enteredBranch.setEncounter(encounterList);
		entityTransaction.begin();
		entityManager.merge(enteredBranch);
		entityTransaction.commit();
		return enteredBranch ;
	}
	
	
	
}
