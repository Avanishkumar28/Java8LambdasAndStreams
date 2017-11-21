package av.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelTest {

	public static int makeDouble(int number) {
		
		try {
			System.out.println("Doubling... "+number);
			
			Thread.sleep(1000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		return number * 2;
	}

	// find all even number then double it and then sum all
	public static int findEvensumOfitsDouble(List<Integer> values) {
		int result = 0;
		
		// Can we make this code more faster.... ??? 
		for(Integer number : values) {
			if(number % 2 == 0) {
				int doubleNumber = makeDouble(number);
				result += doubleNumber;
			}
		}
		
		
		return result;
		
	}
	
	public static void main(String[] args) {
		//List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		List<Integer> values = IntStream.iterate(1, n -> n+1)
										 .limit(100)
										 .mapToObj(e -> Integer.valueOf(e))
										 .collect(Collectors.toList());
												 
		
		long startTime = System.currentTimeMillis();
		System.out.println(findEvensumOfitsDouble(values));
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total Time taken: "+ (endTime-startTime));
		
		System.out.println("NUmber of Processors use to calcutated Result: "+Runtime.getRuntime().availableProcessors());

	}
	
	
	
	
	
	
	
	


}
