package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Remove_duplicate {

	public static void main(String[] args) throws Exception{
		PrintWriter writer=new PrintWriter("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\remove_dups.txt");
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\dupsfile.txt"));
		String line=reader.readLine();
		while(line!=null) {
			boolean avail=false;
			BufferedReader reader2=new BufferedReader(new FileReader("C:\\\\Users\\\\anand\\\\OneDrive\\\\Desktop\\\\Programs\\\\Durga_Sir\\\\remove_dups.txt"));
			String line2=reader2.readLine();
			while(line2!=null) {
				if(line.equals(line2)) {
					avail=true;
					break;
				}
				line2=reader2.readLine();
			}
			if(avail==false) {
				System.out.println(line);
				writer.println(line);
				writer.flush();
			}
			line=reader.readLine();
			reader2.close();
		}
		reader.close();
		writer.close();
	}

}
