package featuresOfjava8;

interface intern {
	static void m1() {
		System.out.println("inside intern interface of static method m1()");
	}

}
interface right {
	default void m1() {
		System.out.println("inside right interface method m1()");
	}
	
}

interface left {
	default void m1() {
		System.out.println("inside left interface method m1()");
	}
}

public class DefaulMethod implements right,left {
public static void main(String[] args) {
	intern.m1();
	DefaulMethod d=new DefaulMethod();
	d.m1();
}
@Override
public void m1() {
		left.super.m1();
		right.super.m1();
}

}