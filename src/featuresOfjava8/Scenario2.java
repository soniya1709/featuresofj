package featuresOfjava8;

interface inter1 {
	public void m1();

	default void m2() {
		System.out.println("inside m2 method");
	}

	public static void m3() {
		System.out.println("inside static m3 method");
	}
}

public class Scenario2 implements inter1 {
	public static void main(String[] args) {
		inter1 i = () -> System.out.println("Hello");
		i.m1();
		Scenario2 s = new Scenario2();
		s.m1();
		s.m2();
		inter1.m3();
	}

	@Override
	public void m1() {
		System.out.println("inside abstract m1()");
	}
}
