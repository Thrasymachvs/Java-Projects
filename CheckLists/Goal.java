import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Goal extends Item {
	Goal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	List<Goal> subGoalList = new ArrayList<Goal>(); 
	int itemPriority;
	Date deadline;
	Date suggestedRangeStart;
	Date suggestedRangeEnd;
	
	void addSubGoal(String goal) {
		Goal g = new Goal(goal);
		subGoalList.add(g); 
	}
	
	int getItemPriority() {
		return itemPriority;
	}
	
	Date getDeadline() {
		return deadline;
	}
	
	Date getRangeStart() {
		return suggestedRangeStart;
	}
	
	Date getRangeEnd() {
		return suggestedRangeEnd;
	}
	
	List<Goal> getSubGoals(){
		return subGoalList;
	}
	
	void setItemPriority(int ip) {
		itemPriority = ip;
	}
	
	void setDeadline(Date dl) {
		deadline = dl;
	}
	
	void setRangeStart(Date rs) {
		suggestedRangeStart = rs;
	}
	
	void setRangeEnd(Date re) {
		suggestedRangeEnd = re; 
	}
	
	void displaySubGoals() {
		System.out.println("\tSUBGOALS:");
		for (int i = 0; i < subGoalList.size(); i++) 
			System.out.println("\t\t"+subGoalList.get(i).getName());
			
	}

}
