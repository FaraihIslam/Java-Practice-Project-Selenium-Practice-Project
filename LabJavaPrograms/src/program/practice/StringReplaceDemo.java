package program.practice;

public class StringReplaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="Selenium is used for WebBased Application";
		String search="Selenium";
		String replace="Automation Testing";
		String result=org;
		int i;
	
		do {
			System.out.println("Orignal String is :"+org);
			i=org.indexOf(search);
			System.out.println(i);
			if(i!=-1) {
				result=org.substring(0, i);
				result=result+replace;
				result=result+org.substring(i+search.length());
				System.out.println(result);
				org=result;
			}
		}while(i!=-1);
		

	}

}
