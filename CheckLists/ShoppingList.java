import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ShoppingList extends CheckList {
			List<Item> shoppingList = new ArrayList<Item>(); 
			String userInput;
			Scanner s = new Scanner(System.in);
			
			@Override
			void addItem() {
				System.out.println("Enter the item you would like to add: ");
				userInput = s.nextLine();
				Item item = new Item(userInput);
				shoppingList.add(item);
			}
			
			void deleteItem() {
				int flag = 0;
				System.out.println("Enter the item you would like to add: ");
				userInput = s.nextLine();
				for (int i = 0; i < shoppingList.size(); i++) {
					if(shoppingList.get(i).getName().equalsIgnoreCase(userInput)) {
						System.out.println("Found");
						shoppingList.remove(i);
						flag = 1;
					}
				}
				if (flag != 1) {
					System.out.println("Item not found");
				}
			}
			
			void displayItems() {
				for(int i = 0; i < shoppingList.size(); i++) {
					System.out.println(shoppingList.get(i).getName());
				}
			}
}
