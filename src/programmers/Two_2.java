package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class Two_2 {

	public static void main(String[] args) {
		int[] people = {1,2,3,5,7,65,32,666,223,451,332,657,985,2,3,3,3,1,5,32,2,4,4,4,6,7,62,28,99,87,65,32,125,134,565,32};
		int[] tshirts = {99,1,7,657,32,99,87,125,32,555,444,666,787,32,32,32}; // 4 3 3
		int answer = 0;
		
		int pi = 0;
	    int ti = 0;

	        Arrays.sort(people);
	        Arrays.sort(tshirts);

	        while (ti < tshirts.length && pi < people.length) {

	            if (people[pi] <= tshirts[ti]) {
	                answer++;
	                pi++;
	            }

	            ti++;
	        }
	        /*
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<people.length; i++) {
			map.put(people[i],map.getOrDefault(people[i], 0)+1 );
		}
		
		for(int x : map.keySet()) {
			//System.out.println(x + ":" + map.get(x));
		}
		for(int i =0; i<tshirts.length; i++) {
			if (map.containsKey(tshirts[i]) && map.get(tshirts[i])>0) { // tshirts
				map.put(tshirts[i], map.get(tshirts[i])-1);
				System.out.println(tshirts[i] + "Æ¼¼ÅÃ÷ -1");
				answer ++;
			}
		}
		*/
		System.out.println(answer);
	}

}
