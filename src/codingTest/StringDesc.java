package codingTest;

import java.util.Arrays;

public class StringDesc {

	public static void main(String[] args) {

		String s = "Zbcdefg";
	
		String ss = "";
		char[] arr = s.toString().toCharArray();
		Arrays.sort(arr);
		for(int i =0; i<arr.length; i++) {
			ss+=arr[i];
		}
		StringBuilder sb = new StringBuilder(ss);
		sb.reverse();
		System.out.println(sb);
		String answer = sb.toString();
		
		
	}

}
