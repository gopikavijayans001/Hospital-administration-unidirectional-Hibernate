package hospital_app_Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app_Dto.Address;

public class AddressDao {
	static EntityManagerFactory entityManagerfactory=Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = entityManagerfactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	
	public static Address saveAddress(Address address) {
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		
		return address;
	}
	
	
	
	
	
	
	
	
	
}
