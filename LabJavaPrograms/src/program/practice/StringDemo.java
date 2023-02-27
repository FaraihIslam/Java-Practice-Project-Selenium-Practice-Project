package program.practice;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'j','a','v','a'};
		String str=new String(c);
		System.out.println(str);
		String str1=new String(str);
		System.out.println(str1);
		int length=str1.length();//count of characters in a String
		System.out.println("Length of String is:"+length);
		System.out.println("Character at index 1 is:"+str.charAt(1));
		System.out.println(str.equals(str1));
		String str2="Java";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
