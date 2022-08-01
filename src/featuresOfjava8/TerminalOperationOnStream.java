package featuresOfjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationOnStream {
public static void main(String[] args) {
	List<Integer> list=new ArrayList();
	list.add(10);
	list.add(20);
	list.add(10);
	list.add(55);
	list.add(90);
	list.add(90);
	System.out.println(list);
	list.stream().forEach(y->System.out.println(y));
	int i=list.stream().filter(b->b%3==0).reduce(0, (a,b)->a+b);
	System.out.println(i);
	Set<Integer> s=list.stream().collect(Collectors.toSet());
	System.out.println(s);
	Optional<Integer> m=list.stream().min((a,b)->a>b?1:a<b?-1:0);
	System.out.println(m);
	Optional<Integer> m1=list.stream().max((a,b)->a>b?1:a<b?-1:0);
	System.out.println(m);
	long count=list.stream().count();
	System.out.println(count);
	boolean a=list.stream().anyMatch(n->i%2==0);
	System.out.println(a);
	boolean a1=list.stream().allMatch(n->i%2==0);
	System.out.println(a1);
	Optional<Integer> f=list.stream().findAny();
	System.out.println(f);
	Optional<Integer> f1=list.stream().findFirst();
	System.out.println(f1);
}
}
