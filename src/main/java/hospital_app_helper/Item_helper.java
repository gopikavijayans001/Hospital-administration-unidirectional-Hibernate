package hospital_app_helper;

import java.util.Scanner;

import hospital_app_Dto.Address;
import hospital_app_Dto.Item;

public class Item_helper {
	static Scanner scanner = new Scanner(System.in);
	static int itemId;
	static String itemName;
	static String itemType;
	static String itemDescription;
	static String itemQuantity;
	static double unitPrice;
	static Item item = new Item();

	public static Item insertItem() {

		System.out.println(" Enter the Item id");
		itemId = scanner.nextInt();
		scanner.nextLine();

		System.out.println(" Enter the Item name");
		itemName = scanner.nextLine();

		System.out.println(" Enter the type");
		itemType = scanner.nextLine();

		System.out.println(" Enter the Quantity");
		itemQuantity = scanner.nextLine();

		System.out.println(" Enter the Description");
		itemDescription = scanner.nextLine();
		scanner.nextLine();

		item.setItemId(itemId);
		item.setItemName(itemName);
		item.setItemType(itemType);
		item.setItemQuantity(itemQuantity);
		item.setItemDescription(itemDescription);

		return item;

	}

}
