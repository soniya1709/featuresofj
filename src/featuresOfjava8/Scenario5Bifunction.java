package featuresOfjava8;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee {
	int id;
	String name;

	public Employee() {

	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Scenario5Bifunction {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList();
		BiFunction<Integer, String, Employee> bf = (id, name) -> new Employee(id, name);
		al.add(bf.apply(10, "Soniya"));
		al.add(bf.apply(20, "Balkrushna"));
		for (Employee e : al) {
			System.out.println("Employee=" + e.id + " " + e.name);
		}
	}
}
