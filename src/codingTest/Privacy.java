package codingTest;

import java.util.ArrayList;
import java.util.HashMap;

public class Privacy {

	public static void main(String[] args) {

		String today = "2021.01.01";
		String[] terms = {"A 12" , "B 12" ,"C 3"};
		String[] privacies = {"2019.12.01 A", "2017.12.28 B", "2022.02.19 C", "2022.02.20 C"};
		
		String[] upday = new String[privacies.length];
		ArrayList<Integer> answer = new ArrayList<>();
		today = today.replace(".", "");
		HashMap<String, String> map = new HashMap<>();
		for(int i =0; i<terms.length; i++) {
			String[] split = terms[i].split(" ");
			map.put(split[0], split[1]);
		}
		
		
		for(int i =0; i<privacies.length; i++) {
			String[] split = privacies[i].split(" ");
			split[0] = split[0].replace(".", " ");
			String[] split2 = split[0].split(" ");
			for(String x : map.keySet()) {
				if (split[1].equals(x)) {
					int month = Integer.parseInt(split2[1]) + Integer.parseInt(map.get(x));
					while(month > 12) {
						split2[0] = Integer.parseInt(split2[0])+1 +"";
						month = month-12;
					}
					String overDay = "";
					if (month > 10) {
						
						overDay = split2[0] + month + split2[2];
					}else {
						overDay = split2[0] + "0" + month + split2[2];
					}
					upday[i] = overDay;
				}
			}
		}
		
		for(int i =0; i<upday.length; i++) {
			if (Integer.parseInt(today) >= Integer.parseInt(upday[i])) {
				answer.add(i+1);
				System.out.println(upday[i]);
			}
		}
		for(int x : answer) {
			System.out.println(x);
		}
		
	}

}
