package codingTest;

public class PhoneNumberHide {

	public static void main(String[] args) {

		String phone_number = "01033334444";
		char[] arr = phone_number.toCharArray();
		String answer ="";
		for(int i = arr.length-1; i>= 0; i--) {
			if (i >= arr.length-4) {
				answer += arr[i];
			}else {
				answer +="*";
			}
		}
		StringBuilder sb = new StringBuilder(answer);
		answer =sb.reverse().toString();
		
		System.out.println(answer);
		
	}

}
