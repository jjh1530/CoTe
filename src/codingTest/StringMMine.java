package codingTest;

import java.util.Arrays;

public class StringMMine {

	public static void main(String[] args) {

		String[] strings = {"sun","bed","car"};
		String[] answer = new String[strings.length];
		int n =1;
		for(int i=0; i<strings.length; i++) {
			String index = String.valueOf(strings[i].charAt(n));
			strings[i] = index + strings[i];
		}
		Arrays.sort(strings);
		
		for(int i=0; i<strings.length; i++) {
			String index = strings[i].substring(1,strings[i].length());
			answer[i] = index;
			System.out.println(answer[i]);
		}
	}

}
