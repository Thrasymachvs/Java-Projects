import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeamItem extends Item {
	TeamItem(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	int itemPriority;
	Date deadline;
	List<User> usersAssigned = new ArrayList<User>();
	
	
	void assign(User u) {
		usersAssigned.add(u);
	}
	

}
