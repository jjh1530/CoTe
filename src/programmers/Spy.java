package programmers;

import java.util.HashMap;

public class Spy {

	public static void main(String[] args) {
		
		String[][] clothes = {{"yeloowhat","face"},{"bluesunglass","face"},{"green_turban","face"}};
		//Çìµå±â¾î 2 ´« 1
		HashMap<String, Integer> map = new HashMap<>();
		for(int i =0; i<clothes.length; i++) {
			String type = clothes[i][1];
			map.put(type, map.getOrDefault(type, 0)+1);
		}
		int answer = 1;
		
		for(String key : map.keySet()) {
			answer *= (map.get(key)+1); // 2 3
		}
		
		answer -=1;
	}

}
