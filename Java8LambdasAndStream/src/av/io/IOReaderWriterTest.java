package av.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class IOReaderWriterTest {
	
	public static void writeToFile(File file, List<String> data) {
		try(
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bfWriter = new BufferedWriter(fileWriter);
			){
			for(String name : data) {
				bfWriter.write(name);
				bfWriter.newLine();
				
				/*fileWriter.write(name);
				fileWriter.flush();*/
			}
			System.out.println("Writing Done!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	public static void readFromFile(File file){
		try(
			FileReader fileReader = new FileReader(file);
			BufferedReader bfReader = new BufferedReader(fileReader);	
			){
			String currentLine;
			while((currentLine = bfReader.readLine()) != null) {
				System.out.println(currentLine);
			}
			
			System.out.println("Reading Done!");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//String[] names = new String[10];
		String[] names;
		names =  new String[] {"AV", "Amit", "Abhinav", "Sajal", "Tarvinder","Punit","Vibhor"};
		List<String> nameList = Arrays.asList(names);
		
		File file = new File("Name_File.txt");
		writeToFile(file, nameList);
		
		readFromFile(file);

	}

}
