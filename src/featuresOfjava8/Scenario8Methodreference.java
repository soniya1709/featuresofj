package featuresOfjava8;

public class Scenario8Methodreference {
	public  void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("inside method m1()");
		}
	}

	public static void main(String args[]) {
		Scenario8Methodreference s=new Scenario8Methodreference();
		Runnable R = s::m1;
		Thread t = new Thread(R);
		t.start();

	}
}
