package codingTest;

public class StringBasic {

	public static void main(String[] args) {

		String s = "1234";
		boolean answer = true;
		try {
			Integer.parseInt(s);
			System.out.println("!");
		} catch (Exception e) {
			System.out.println("2");
			answer = false;
		}
		System.out.println(s.length());
		if (s.length() !=4 && s.length() !=6 ) {
			answer = false;
			System.out.println("!");
		}
		System.out.println(answer);
	}

}
