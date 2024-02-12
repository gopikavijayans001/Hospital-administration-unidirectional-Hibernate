package hospital_app_Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import hospital_app_Dto.Item;

public class ItemDao {

	static EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = entityManagerfactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();

	//method to save the items
	public static Item saveItem(Item item) {
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();

		return item;
	}

	// method to save the items in the list
	public static List<Item> SaveItemlist(Item item) {

		List<Item> itemList = new ArrayList<Item>();
		itemList.add(item);
		return itemList;

	}

}
