import java.util.Date;

public class Item {
		int itemID;
		String itemString;
		boolean completed;
		Date completedTimeStamp;
		
		void markComplete() {
			completed = true; 
		}
		
		Item(String name){
			itemString = name; 
			completed = false; 
		}
		
		String getName() {
			return itemString;
		}

}
