

	
	import java.io.*;
	public class User extends Thread{
			int Uid;
			ResourceManager DRM; 
			DiskManager DM;
			ResourceManager PM; 
			User (int id, ResourceManager ResourceManage, DiskManager DiskManage, ResourceManager PrintManage){
				super("User");
				Uid = id;
				DRM = ResourceManage;
				DM = DiskManage;
				PM = PrintManage;
				} 
			
			
			
			public void run(){
				String filename = "USER"+Uid;
				String print_file = null;
				String line = null;
				int DiskID = 0;
				int file_length = 0;
				FileInfo fileObj = null;
					try {
						FileReader fr = new FileReader(filename);
						BufferedReader br = new BufferedReader(fr);
						while ((line = br.readLine()) != null){
							String[] splitline = line.split(" ");
							
							if (splitline[0].equals(".save")){
								print_file = splitline[1];
								//Check with the Disk Resource Manager for an open diskID, and check that disks free sector with the DiskManager. 
								 DiskID = DRM.request(); 
								 System.out.println(Uid + " IS WRITING TO DISK " + DiskID);
								//Begin creating a fileInfo object with this data; increment the length of the file as it goes. 
								 fileObj = new FileInfo();
								 fileObj.diskNumber = DiskID;
								 fileObj.startingSector = DM.free_sector(DiskID);
								 //Put the file into our DirectoryManager
								 DM.file_put(fileObj, splitline[1]);
												
							}
							else if (splitline[0].equals(".end")){
								
								fileObj.fileLength = file_length;
								file_length = 0; 
								DRM.release(DiskID);
								
							}
							else if (splitline[0].equals(".print")){
								PrintJobThread printer = new PrintJobThread(DM, PM, print_file);
								printer.start();
								
							}
							else{
								file_length++; 
								DM.disks[DiskID].write(DM.free_sector(DiskID), line);
								DM.disk_sectors_free[DiskID] += 1; 
								Thread.sleep(200);
								
							}
						}
						br.close();
					}
					catch (Exception e){
						System.out.print(e);
					}
				}
			}


