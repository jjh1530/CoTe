package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Two_1 {

	public static void main(String[] args) {
		String[][] booked = {{"09:10","lee"}};
		String[][] unbooked = {{"09:00","kim"},{"09:05","bae"}};
		
		HashMap<Integer, String> map = new HashMap<>();
		for(int i=0; i<booked.length; i++) {
				map.put( Integer.parseInt(booked[i][0].replace(":", "")),booked[i][1]);
		}
		for(int i=0; i<unbooked.length; i++) {
			map.put(Integer.parseInt(unbooked[i][0].replace(":", "")),unbooked[i][1] );
		}
		
		int min = Integer.MAX_VALUE;
		String[] answer = new String[map.size()];
		int index = 0;
		for(int x : map.keySet()) {
			System.out.println(x + ":" +map.get(x));
			answer[index] = map.get(x);  // kim bae lee 시간 별로
			index++;
		}
		
		
		
	}

}
