package featuresOfjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Scenario10Stream {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(50);
		al.add(30);
		al.add(25);
		al.add(30);
		al.add(10);
		al.add(45);
		System.out.println(al);
		List<Integer> l=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
		long FailStub=al.stream().filter(m->m<35).count();
		System.out.println(FailStub);
		List<Integer> l1=al.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
	}
}
