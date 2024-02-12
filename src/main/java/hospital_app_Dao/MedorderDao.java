package hospital_app_Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app_Dto.Branch;
import hospital_app_Dto.Encounter;
import hospital_app_Dto.Medorder;

public class MedorderDao {
	static EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = entityFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	
	public static Medorder saveMedorder(Medorder medorder) {
		entityTransaction.begin();
		entityManager.persist(medorder);
		entityTransaction.commit();
		System.out.println("Data saved successfully....!");
		return medorder;
	}
	
public static List<Medorder> saveMedorderlist(Medorder medorder){
		
		List<Medorder> medorderlist = new ArrayList<Medorder>();
	medorderlist.add(medorder);
		return medorderlist;
		
	}
	
	
public static Encounter updateEncounterList(int id,Medorder order) {
	Encounter encounter = entityManager.find(Encounter.class, id);
	List<Medorder> medorderList = saveMedorderlist(order);
	encounter.setMedorder(medorderList );
	entityTransaction.begin();
	entityManager.merge(encounter);
	entityTransaction.commit();
	return encounter  ;
}
	
	
	
	
	
	
}
