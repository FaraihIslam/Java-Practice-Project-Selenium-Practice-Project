package program.practice;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		int y=2;
		try {
			if(x==4) {
				throw new ArithmeticException();
			}
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(y);
	}

}
