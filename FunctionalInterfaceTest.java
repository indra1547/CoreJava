package coreJava.Abstraction;

@FunctionalInterface
interface Square {
	public int cal (int x);
}

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		// using lamda expression to instantiate functional interface
		Square s = (int a) -> a*a;
		System.out.println(s.cal(5));
		

	}

}
