package av.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaSample2 {

	public static int getEvenSum(List<Integer> numberList){
		int total = 0;
	
		for(Integer number : numberList) {
			if(number%2 == 0)
				total += number;
		}
		
		
		return total;
	}
	// get sum of odd
	//get double of even and then sum
	//get double of odd and then sum
	
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList = Stream.iterate(1, n -> n+1)
							.limit(10)
							.collect(Collectors.toList());
		System.out.println(getEvenSum(numberList));
		
		//System.out.println(getSum(numberList, e -> e%2 == 0));

	}
	
	
	
	
	
	public static int getSum(List<Integer> numberList, Predicate<Integer> test){
		/*Optional<Integer> result = numberList.stream()
									.filter(test)
									.reduce((c, e) -> c+e); //Optional<T>
									//.orElse(0);
		*/
		return numberList.stream()
				.filter(test)
				.reduce(0, (c, e) -> c+e);
	}

}
