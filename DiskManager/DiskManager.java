
public class DiskManager {
		static final int NUM_DISKS = 2; 
		DirectoryManager DirManager = new DirectoryManager();
		int[] disk_sectors_free = {0,0};

		Disk disk0 = new Disk();
		Disk disk1 = new Disk();
		Disk[] disks = {disk0, disk1};
		
		
		void file_put(FileInfo file, String splitline){
			DirManager.enter(splitline, file);
		}
		
		int free_sector(int disk_id){
			return disk_sectors_free[disk_id];
		}
		
		FileInfo lookup(String k){
			return DirManager.lookup(k);
			
		}
		
		
}
