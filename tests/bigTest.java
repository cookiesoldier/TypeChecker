class testmain {
	
	public static void main (String[] args) {
		
		A a;
		
		System.out.print("Hello ");
		System.out.println("World");
		
		a = new A();
		a.initialize();
		a.test("Hello", 42, 6, 7);
		
		return;
	}
}

class A {
	
	String x;
	
	public void initialize() {
		x="";
		return;
	}
	
	public void test(String argument, int number, int a, int b) {
		int counter;
		
		x = argument;
		
		counter = 0;
		
		while ( counter < number ) {
			if (counter < number - counter) {
				System.out.println(".");
			}
			
			if (!(counter < number - counter)) {
				System.out.println(counter);
			} else {
				System.out.println("-");
			}
			
			counter = counter+1;
		}
		
		counter = -number;
		
		if (!(counter<0)) {
			System.out.println(x);
		}
		
		return;
	}
	
}
