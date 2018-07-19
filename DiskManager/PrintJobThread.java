
public class PrintJobThread extends Thread {
		int PrinterID;
		String filename; 
		DiskManager DM; 
		ResourceManager PrintManager;
		PrintJobThread(DiskManager D, ResourceManager PM, String File){
			DM = D;
			PrintManager = PM; 
			filename = File;
		}

	
	public void run() {
		PrinterID = PrintManager.request();
		int Printerfilename = PrinterID + 1;
		Printer currentPrinter = new Printer(Printerfilename);
		int CurrentDisk = DM.lookup(filename).diskNumber;
		int last_sector = DM.lookup(filename).fileLength + DM.lookup(filename).startingSector;
		for (int i = DM.lookup(filename).startingSector; i < last_sector ; i++){
			String currentLine = DM.disks[CurrentDisk].read(i);
			System.out.println(PrinterID + " IS PRINTING " + currentLine + " TO FILE PRINTER"+Printerfilename);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			currentPrinter.print(currentLine);
			try {
				Thread.sleep(2750);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
		
		PrintManager.release(PrinterID);	
		
}
}
