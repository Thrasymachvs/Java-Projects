import java.util.ArrayList;
import java.util.HashMap;

public class Manager {
	HashMap<User, ArrayList<CheckList>> manager = new HashMap<User, ArrayList<CheckList>>();
	
	void addUser(String u) {
		User user1 = new User();
		ArrayList<CheckList> userCheckList = new ArrayList<CheckList>();
		user1.username = u;
		System.out.println(user1.username);
		manager.put(user1, userCheckList);
	}
	
	void deleteUser(String u) {
		
	}
	
	void editUserName(String u) {}
	
	void displayUserAndChecklists() {}
	
	void displayAll() {}
}
