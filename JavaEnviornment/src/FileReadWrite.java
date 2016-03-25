import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReadWrite {

	
	public static void main(String[] args) throws IOException {

/* File file = new File("D:\\fileWriter.txt");
 file.createNewFile();*/
// System.out.println(file.getAbsoluteFile());
		
 FileWriter fw = new FileWriter("D:\\fileWriter.txt");
 
 BufferedWriter bwriter = new BufferedWriter(fw);
 
 bwriter.write("hi how r u");
 /*bwriter.newLine();
 bwriter.write("Second line");*/
 
 
/* FileReader fr = new FileReader("D:\\test.txt");
	
	BufferedReader br = new BufferedReader(fr);
	
System.out.println(br.readLine());*/
	

	}

}
