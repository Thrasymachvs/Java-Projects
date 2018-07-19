
public class Disk {
	static final int NUM_SECTORS = 1024;
	String sectors[] = new String[NUM_SECTORS];
	
	String read(int sector){
		return sectors[sector];		
	}
	
	void write(int sector, String line){
		sectors[sector] = line;
	}

}
