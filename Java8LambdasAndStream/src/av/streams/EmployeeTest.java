package av.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
	
	public static void sortedEmployeeByName(List<Employee> employees) {
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				
				return e1.getName().compareToIgnoreCase(e2.getName());
			}
		});
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		
		/*employees.stream()
				.forEach(System.out :: println);*/
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List<Employee> employees = EmployeeCreater.createEmployee();
		//employees.forEach(System.out :: println);
		
		/*List tmpEmp = new ArrayList<>(employees);
		
		Collections.sort(tmpEmp);
		
		tmpEmp.forEach(System.out :: println);*/
		
		sortedEmployeeByName(employees);
		
		// Sort by Age
		
		//Sort by Age and then by Name
		
		//Filter all Male and then sort by Name and then by salary(MIN to MAX)
		
		
		
		
		
		//sortedEmployee(employees, Comparator.comparing(Employee::getName));

	}
	
	
	public static void sortedEmployee(List<Employee> employees, Comparator<Employee> comparator) {
		/*employees.stream()
				.sorted(comparator)
				.forEach(System.out :: println);*/
		
		/*employees.stream()
			.filter(e -> e.getGender()==Gender.MALE)
			.sorted(comparator)
			.sorted(Comparator.comparing(Employee::getSalary))
			.forEach(System.out :: println);*/
		
	}

}
