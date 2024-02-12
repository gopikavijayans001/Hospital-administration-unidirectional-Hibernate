package hospital_app_helper;

import java.util.List;
import java.util.Scanner;

import hospital_app_Dao.ItemDao;
import hospital_app_Dto.Item;
import hospital_app_Dto.Medorder;

public class Medorder_helper {

	static int medorderId;
	static String dosage;
	static String frequency;
	static String orderDate;
	static String instructions;
	static Scanner scanner = new Scanner(System.in);
	static Medorder medorder = new Medorder();

	public static Medorder insertMedorder() {

		System.out.println(" Enter the Medorder id");
		medorderId = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the dosage for medicine");
		dosage = scanner.nextLine();
		scanner.nextLine();

		System.out.println("Enter the frequency for medicines");
		frequency = scanner.nextLine();
		scanner.nextLine();

		System.out.println("Enter the order date");
		orderDate = scanner.nextLine();
		scanner.nextLine();

		System.out.println("Enter the Instructions");
		instructions = scanner.nextLine();
		scanner.nextLine();

		medorder.setMedorderId(medorderId);
		medorder.setDosage(dosage);
		medorder.setFrequency(frequency);
		medorder.setOrderDate(orderDate);
		medorder.setInstructions(instructions);

		Item item = Item_helper.insertItem();
		Item saveItem = ItemDao.saveItem(item);
		List<Item> itemList=ItemDao.SaveItemlist(saveItem);

		medorder.setItem(itemList);

		return medorder;

	}

}
