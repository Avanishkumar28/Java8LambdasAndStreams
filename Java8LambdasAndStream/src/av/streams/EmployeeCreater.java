package av.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeCreater {

	
	public static List<Employee> createEmployee() {
		String[] skill_1 = {"Java", "Spring", "Struts", "Hibernate"};
		String[] skill_2 = {"ExtJS", "LX", "HTML", "Javascript", "JQuery"};
		String[] skill_3 = {"SQL", "PL/SQL", "Oracle", "DB"};
		String[] skill_4 = {"Project Management", "Employee Management"};
		
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Anuj", 30, "ST", Gender.MALE, 1_30_000, Arrays.asList(skill_1)));
		employees.add(new Employee(2, "Rajanish", 35, "ST Micro", Gender.MALE, 1_50_000, Arrays.asList(skill_4)));
		employees.add(new Employee(3, "Rashika", 24, "ST", Gender.FEMALE, 70_000, Arrays.asList(skill_3)));
		employees.add(new Employee(4, "Kanika", 25, "ST", Gender.FEMALE, 70_000, Arrays.asList(skill_2)));
		employees.add(new Employee(5, "Tarun", 33, "ST Micro", Gender.MALE, 1_20_000, Arrays.asList(skill_3)));
		
		employees.add(new Employee(6, "Abhinav", 27, "Fujitsu India", Gender.MALE, 55_000, Arrays.asList(skill_2)));
		employees.add(new Employee(7, "Punit", 26, "Fujitsu", Gender.MALE, 55_000, Arrays.asList(skill_1)));
		employees.add(new Employee(8, "Vibhor", 28, "Fujitsu", Gender.MALE, 50_000, Arrays.asList(skill_2)));
		employees.add(new Employee(9, "Avinash", 26, "Fujitsu", Gender.MALE, 40_000, Arrays.asList(skill_2)));
		employees.add(new Employee(10, "Arti", 25, "Fujitsu India", Gender.FEMALE, 60_000, Arrays.asList(skill_3)));
		employees.add(new Employee(11, "Sajal", 28, "FCI", Gender.MALE, 70_000, Arrays.asList(skill_1)));
		employees.add(new Employee(12, "Dipak", 28, "FCI", Gender.MALE, 45_000, Arrays.asList(skill_3)));
		
		employees.add(new Employee(13, "Neelesh", 24, "CTS", Gender.MALE, 25_000, Arrays.asList(skill_2)));
		employees.add(new Employee(14, "Ashutosh", 30, "Sopra", Gender.MALE, 60_000, Arrays.asList(skill_1)));
		employees.add(new Employee(15, "Nitin", 29, "NXP", Gender.MALE, 5_000, Arrays.asList(skill_4)));
		
		
		
		return employees;
	}

}
