package hospital_app_Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app_Dto.Address;
import hospital_app_Dto.Person;

public class PersonDao {

	
	static EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = entityFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();

	// method to check the hospital is exist or not
	public static boolean findPerson(int id) {
		Person person = entityManager.find(Person.class, id);
		if (person != null)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	public static Person savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
		return person;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
