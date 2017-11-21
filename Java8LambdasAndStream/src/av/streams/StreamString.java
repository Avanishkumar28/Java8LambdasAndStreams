package av.streams;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StreamString {

	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("AV", "Dev", "Ali", "Nimmu", "Shri", "Neelu");
		
		String joinName = String.join(",", namesList);
		System.out.println(joinName);
		
		String allName = namesList.stream()
				 				  .collect(Collectors.joining(","));
		System.out.println(allName);

		
		StringJoiner sj = new StringJoiner(":");
		sj.add("AV")
		  .add("Dev")
		  .add("Ali")
		  .add("Nimmu")
		  .add("Shri");
		
		System.out.println();
		
		
		/*
		StringJoiner sjWithCaps = new StringJoiner(":", "[", "]");
		 sjWithCaps.add("Dev").add("Ali").add("Neelu");
		 String desiredString = sjWithCaps.toString();
		 System.out.println(desiredString);*/
	}

}
