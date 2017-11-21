package av.nio;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestNIO {

	public static void main(String[] args) {
		System.out.println("Current working Directory: "+System.getProperty("user.dir"));
		
		//Path start = Paths.get("E:\\Java Work\\eclipse-workspace");
		//Path start = Paths.get("Java8LambdasAndStream", "src", "/av", "nio", "TestNIO.java");
		//Path start = Paths.get("/Java Work", "eclipse-workspace");
		Path start = Paths.get("D:\\AV");
		System.out.println("Path: "+start);
		
		try(Stream<Path> walk = Files.walk(start, Integer.MAX_VALUE, FileVisitOption.FOLLOW_LINKS)){
			
			walk.filter((p) -> p.endsWith("LambdaSample.class"))
				//.map((e) -> e.subpath(0, 4))
				.forEach(System.out :: println);
			
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
