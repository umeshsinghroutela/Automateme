package practice.java.programe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	private int id ;
	private String name ;

	public Employee(int id, String name) {
		this.id =id;
		this.name=name;
	}

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

	@Override
	public String toString() {
		return name +" :: " + id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
//		return -name.compareTo(o.name);
		int l1 = name.length();
		int l2 = o.name.length();
		if (l1>l2) {
			return -1;
		}
		else if (l1<l2){
			return 1;
		}
		
		return 0;
		
	}

}

public class ProgComparable {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(11 , "qwerty"));
		employee.add(new Employee(116, "Adsa dsadad"));
		employee.add(new Employee(12 , "xasdad das"));
		employee.add(new Employee(12 , "ZS dsad sadsa d"));
		employee.add(new Employee(122, "Kkdsad"));

		//Sort by Alphabetical
		Collections.sort( employee);
		System.out.println("Sort by Alphabatical ");
		for (Employee person : employee) {
			System.out.println(person);
		}
	}
}