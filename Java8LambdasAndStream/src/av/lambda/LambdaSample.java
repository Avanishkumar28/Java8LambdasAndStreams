package av.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaSample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		numbers.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});

	}

}
