package featuresOfjava8;
class Sample
{
	public Sample() {
		System.out.println("inside Sample no args constructor");
	}
	public Sample(int s) {
		System.out.println("Hello"+s);
	}
}
interface interf{
	//public Sample m1();
	public Sample m2(int s);
}
public class ScenarioConstructorRefe {
public static void main(String[] args) {
	interf i=Sample::new;
//	Sample s1=i.m1();
	Sample s2=i.m2(10);
	
	
}
}
