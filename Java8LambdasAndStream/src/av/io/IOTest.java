package av.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class IOTest {
	
	public static void wrightTofile(List<String> data, File file) {
		try(FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			BufferedOutputStream bufferOut = new BufferedOutputStream(objOut);
			) {
			
			data.forEach((e) -> {
				try {
					objOut.writeObject(e);
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			});

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readFromFile(File file) {
		try(FileInputStream fileInput = new FileInputStream(file);
			BufferedInputStream bufferInput = new BufferedInputStream(fileInput);
			ObjectInputStream objInput = new ObjectInputStream(fileInput);
			){
			Object readObj = null;
			while((readObj = objInput.readObject()) != null) {
				String line = (String) readObj;
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("One", "Two", "Three", "Four", "Five");
		
		File file = new File("Test.txt");
		wrightTofile(myList, file);
		readFromFile(file);
		
		

	}

}
