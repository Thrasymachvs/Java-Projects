import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Printer {
	int Pid;
	
	Printer(int id){
		Pid = id;
	}
	
	void print(String b){
		String filename = "PRINTER"+Pid; 
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(filename, true));
			writer.write(b);
			writer.newLine();
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		
	}

}
