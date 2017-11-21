package av.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {

	public static void main(String[] args) {
		Optional<Integer> OptionalResult = 	Stream.iterate(1, n -> n+1)
													.limit(20)
													.filter(n -> n%2 == 0)
													.filter(n -> n>2)
													.findAny();
		
		OptionalResult.ifPresent(System.out::println);
		System.out.println( );

	}
	
	//get name of Insurance of a Employee Car
	public static String getInsuranceNameOfEmployeeCar(Employee employee){
		return employee.getCar().getInsurance().getName();
	}

}
