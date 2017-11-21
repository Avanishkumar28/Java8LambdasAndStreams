package av.io;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileTest {

	public static void main(String[] args) {
		File fileSystem = new File("E:\\Java Work\\eclipse-workspace\\Java8LambdasAndStream");
		
		File finalFile = new File(fileSystem, "src\\av\\io");
		
		System.out.println(finalFile);
		System.out.println("isAbsolute : "+finalFile.isAbsolute());
		
		File[] files = finalFile.listFiles();
		List<File> fileList = Arrays.asList(files);
		fileList.stream()
				.filter(file -> file.isFile())
				.map(file -> file.getName())
				.forEach(System.out :: println);
		
		
		/*File testFile = new File(fileSystem, null); // will gives NullPointerException
		//File testFile = new File(null); //The constructor File(String) is ambiguous File(URI)
		System.out.println(testFile);*/
		
		System.out.println("Test Change");

	}

}
