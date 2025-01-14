public class StackExample {

    public static void main(String[] args) {
		methodA(); // calling methodA
	}

	public static void methodA() {
		int x = 10; // local variable in methodA
		methodB(); // calling methodB
	}
	
	public static void methodB () {
		int y = 20; // local variable in methodB
		// do something with y ...
	}
}	
