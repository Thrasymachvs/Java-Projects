
public class main {
	public static void main(String[] args){
		final int NUM_USERS = 4;
		final int NUM_DISK = 2;
		final int NUM_PRINT = 3;
		
		StringBuffer key = new StringBuffer("X1");
		ResourceManager DiskResource = new ResourceManager(NUM_DISK);
		ResourceManager PrintResource = new ResourceManager(NUM_PRINT);
		DiskManager Manager = new DiskManager();
		User test = new User(1, DiskResource, Manager, PrintResource);
		User test1 = new User(2, DiskResource, Manager, PrintResource);
		User test2 = new User(3, DiskResource, Manager, PrintResource);
		User test3 = new User(4, DiskResource, Manager,PrintResource);
		test.start();
		test1.start();
		test2.start();
		test3.start();
		
		
		
	}

}
