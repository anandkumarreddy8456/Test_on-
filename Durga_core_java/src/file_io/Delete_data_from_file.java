package file_io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Delete_data_from_file {

	public static void main(String[] args) throws IOException {
		PrintWriter writer =new PrintWriter("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\Update_delated_data.txt");
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\phonedatat.txt"));
		String line=reader.readLine();
		while(line!=null) {
			boolean val=false;
			BufferedReader reader2=new BufferedReader(new FileReader("C:\\Users\\anand\\OneDrive\\Desktop\\Programs\\Durga_Sir\\delete.txt"));
			String line2=reader2.readLine();
			while(line2!=null) {
				if(line2.equals(line)) {
					val=true;
					break;
				}
				line2=reader2.readLine();
			}
			if(val==false) {
				writer.println(line);
				System.out.println(line);
				writer.flush();
			}
			line=reader.readLine();
			reader2.close();
		}
		reader.close();
		writer.close();
	}

}
