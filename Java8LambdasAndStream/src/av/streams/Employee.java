package av.streams;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private String company;
	private Gender gender;
	private int salary;
	private List<String> skills;
	
	
	public Employee(int id, String name, int age, String company, Gender gender, int salary, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.company = company;
		this.gender = gender;
		this.salary = salary;
		this.skills = skills;
	}
	
	//Setters and Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (gender != other.gender)
			return false;
		if (id != other.id)
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [ID: " + id 
				+ ", Name: " + name 
				+ ", Company: " + company 
				+ ", Gender: " + gender
				+ ", Salary: "+ salary 
				+ ", Skill Set: "+ skills 
				+ "]";
	}

}
