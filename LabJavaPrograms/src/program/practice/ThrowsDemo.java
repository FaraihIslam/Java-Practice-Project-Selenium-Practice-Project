package program.practice;

public class ThrowsDemo {
	
	public void method() throws InterruptedException {
		System.out.println("First Executing");
		Thread.sleep(1000);
		System.out.println("Second Executing");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThrowsDemo td=new ThrowsDemo();
		td.method();
		

	}

}
