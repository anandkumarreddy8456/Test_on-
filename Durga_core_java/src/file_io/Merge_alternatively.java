package file_io;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Merge_alternatively {

	public static void main(String[] args) throws IOException {
		PrintWriter writer=new PrintWriter("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\merge_op1.txt");
		BufferedReader reader1=new BufferedReader(new FileReader("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\file1.txt"));
		BufferedReader reader2=new BufferedReader(new FileReader("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\file2.txt"));
		String line1=reader1.readLine();
		String line2=reader2.readLine();
		while(line1!=null ||line2!=null) {
			if(line1!=null) {
				writer.println(line1);
				System.out.println(line1);
				line1=reader1.readLine();
			}if(line2!=null) {
				writer.println(line2);
				System.out.println(line2);
				line2=reader2.readLine();
			}
		}
		writer.flush();
		reader1.close();
		reader2.close();
		writer.close();

	}

}
