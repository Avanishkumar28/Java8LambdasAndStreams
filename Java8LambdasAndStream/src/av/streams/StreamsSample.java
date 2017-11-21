package av.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsSample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//totaling list number and print result
		int total = 0;
		for(Integer num : numbers) {
			total += num; 
		}

		System.out.println(total);
		
		Integer streamTotal = numbers.stream()
									.reduce(0, (c,e) -> c+e );  //0 --> is Identity value [Identity value for add-->0, product--> 1]
									//.reduce(0, Integer::sum);
		
		System.out.println(streamTotal);
	}

}
