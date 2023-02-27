package program.practice;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		int num1=0;
		int num2;
		try {
		num2=num/num1;
		System.out.println(num2);
		int a[]= {2,4,6};
		a[10]=6;
		System.out.println("45");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Exception is occurred");

	}

}
