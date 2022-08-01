package featuresOfjava8;

import java.util.function.Supplier;

public class Scenario6Random {
public static void main(String[] args) {
	Supplier<String> s=()->{
		String opt="";
		for(int i=0;i<6;i++) {
			opt=opt+(int)(Math.random()*10);
		}
		return opt;
	};
	System.out.println(s.get());
}
}
