package av.parallelStream;

import java.util.stream.IntStream;

public class SimpleParallelStream {
	
	public static void summing() {
		int result = IntStream.rangeClosed(1, 5)
							//.parallel()
							//.peek(System.out :: println)
							.reduce(0, (c, e) -> c+e);
							/*.reduce(1, (c, e) ->{ 
								System.out.println(c+" + "+e+" => "+(c+e));
								return c+e;
								});*/
		
		System.out.println(result);
		
		int result2 = IntStream.rangeClosed(1, 100) 
							 // .parallel()
							  .filter(e -> e%2 == 0)
							 // .peek(System.out :: println)
							  .reduce(0, (c, e) -> c+e);

		System.out.println("Odd sum Result: "+result2);
	}

	public static void main(String[] args) {
		summing();

	}

}
