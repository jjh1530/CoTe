package codingTest;

import java.util.ArrayList;

public class SmallStringInt {

	public static void main(String[] args) {

		String t ="11641123122412312";
		String p = "123456121";
		long num = Long.parseLong(p);
		long num2 = Long.parseLong(t);
		ArrayList<String> sarr = new ArrayList<>();
		char[] arr = t.toCharArray();
		for(int i =0; i<arr.length; i++) { // 5 0 0 2 2 0 8 3~~~
			int x =0;
			String sum ="";
			try {
				for(int j=i; j<i+p.length(); j++) { // 
					
					
					sum += String.valueOf(arr[j]);
					
					//sarr.add(+ String.valueOf(arr[i+1]) + String.valueOf(arr[i+2]));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			sarr.add(sum);
			
		}
		int answer = 0;
		ArrayList<String> sarr2 = new ArrayList<>();
		for(int i =0; i<sarr.size(); i++) {
			if (sarr.get(i).length() == p.length()) {
				sarr2.add(sarr.get(i));
			}
			
		}
		for(int i =0; i<sarr2.size(); i++) {
			if (Long.parseLong(sarr2.get(i)) <= num) {
				answer++;
			}
		}
		
		for(int i=0; i<=t.length()-p.length(); i++) {
			System.out.println(Long.parseLong(t.substring(i, i + p.length())));
			if (Long.parseLong(t.substring(i, i + p.length())) <= num) {
                answer++;
            }
		}
		System.out.println(answer);
	}

}
