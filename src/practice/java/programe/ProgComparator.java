package practice.java.programe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person{
	private int id ;
	private String name ;

	public Person(int id, String name) {
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
		return id +" :: " +name;
	}

}

public class ProgComparator {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person(11 , "qwerty"));
		people.add(new Person(116, "Adsa dsadad"));
		people.add(new Person(12 , "xasdad das"));
		people.add(new Person(12 , "ZS dsad sadsa d"));
		people.add(new Person(122, "Kkdsad"));

		//Sort by Alphabatical
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				String name1 = p1.getName().toUpperCase();
				String name2 = p2.getName().toUpperCase();
				return name1.compareTo(name2);

			}
		});
		System.out.println("Sort by Alphabatical ");
		for (Person person : people) {
			System.out.println(person);
		}

		//Sort by ID
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getId()>o2.getId()) {
					return 1;
				}
				else if(o1.getId()<o2.getId()) {
					return -1;
				}

				return 0;
			}
		});
		System.out.println("\nSort by ID");
		for (Person person : people) {
			System.out.println(person);
		}

		//Sort by name length
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().length()>p2.getName().length()?1:-1;
			}
		});
		System.out.println("\nSort by Name Length");
		for (Person person : people) {
			System.out.println(person);
		}
	}
}

/*O/P
 * 
 * Sort by Alphabatical 
116 :: Adsa dsadad
122 :: Kkdsad
11 :: qwerty
12 :: xasdad das
12 :: ZS dsad sadsa d

Sort by ID
11 :: qwerty
12 :: xasdad das
12 :: ZS dsad sadsa d
116 :: Adsa dsadad
122 :: Kkdsad

Sort by Name Length
122 :: Kkdsad
11 :: qwerty
12 :: xasdad das
116 :: Adsa dsadad
12 :: ZS dsad sadsa d*/
