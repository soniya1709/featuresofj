package featuresOfjava8;

import java.util.function.BiPredicate;

public class Scenario4Bipredicate {
public static void main(String[] args) {
BiPredicate<Integer,Integer> bp=(a,b)->(a+b)%2==0;
System.out.println(bp.test(25, 30));
System.out.println(bp.test(20, 30));


}
}
