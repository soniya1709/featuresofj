package featuresOfjava8;

@FunctionalInterface
interface inter{
	public void m1();
}
public class LambdaInfunctinalInterface {
public static void main(String[] args) {
	inter i=()->System.out.println("Hello");
	i.m1();
}
}
