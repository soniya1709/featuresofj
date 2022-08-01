package featuresOfjava8;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Scenario3Stream {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet();
		hs.add(20);
		hs.add(10);
		hs.add(25);
		hs.add(15);
		hs.add(40);
		System.out.println(hs);
	hs.stream().sorted(Comparator.reverseOrder()).forEach(value->System.out.println(value));
	System.out.println("**********************");
	hs.stream().sorted(Comparator.naturalOrder()).forEach(value->System.out.println(value));
		
        
	}
}