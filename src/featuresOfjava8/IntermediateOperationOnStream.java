package featuresOfjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationOnStream {
public static void main(String[] args) {
	List<Integer> l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add(10);
	l.add(50);
	l.add(30);
	l.add(40);
	System.out.println(l);
	List<Integer> s=l.stream().filter(i->i%4==0).collect(Collectors.toList());
	System.out.println(s);
	List<Integer> m=l.stream().map(b->b*2).collect(Collectors.toList());
	System.out.println(m);
	List<Integer> s1=l.stream().sorted((a,b)->a>b?1:a<b?-1:0).collect(Collectors.toList());
	System.out.println(s1);
	List<Integer> d=l.stream().distinct().collect(Collectors.toList());;
	System.out.println(d);
	List<Integer> c=l.stream().sorted((a,b)->a<b?1:a>b?-1:0).limit(2).collect(Collectors.toList());
	System.out.println(c);
}
}
