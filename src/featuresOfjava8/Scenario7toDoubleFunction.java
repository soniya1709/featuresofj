package featuresOfjava8;

import java.util.function.ToDoubleFunction;

public class Scenario7toDoubleFunction {
public static void main(String[] args) {
	ToDoubleFunction<Double> d=i->Math.sqrt(i);
	System.out.println(d.applyAsDouble(7.0));
}
}