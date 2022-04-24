package file_io;

import java.io.BufferedReader;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Merge_Operation {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		PrintWriter write=new PrintWriter("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\file3.txt");
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\file1.txt"));
		String line=reader.readLine();
		while(line!=null) {
			write.println(line);
			System.out.println(line);
			line=reader.readLine();
		}
		reader=new BufferedReader(new FileReader("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\file2.txt"));
		line=reader.readLine();
		while(line!=null) {
			write.println(line);
			System.out.println(line);
			line=reader.readLine();
		}
		reader.close();
		write.close();
	}

}
