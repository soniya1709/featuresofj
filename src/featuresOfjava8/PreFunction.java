package featuresOfjava8;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreFunction {
public static void main(String[] args) {
	Predicate<Integer> p=i ->i%2==0;
	System.out.println(p.test(10));
	System.out.println(p.test(5));
	
	System.out.println("************");
	
	Function<Integer,Integer> f=i->i*i;
	System.out.println(f.apply(5));
	
	System.out.println("************");
	
	Consumer<String> c=i->System.out.println(i+""+"Balkrushna");
	c.accept("Soniya");
	
	System.out.println("***********");
	
	Supplier<Date> s=()->new Date();
	System.out.println(s.get());
}
}

