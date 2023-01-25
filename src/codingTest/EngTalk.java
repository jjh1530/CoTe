package codingTest;

import java.util.HashMap;

public class EngTalk {

	public static void main(String[] args) {

		int[] answer = new int[2];
		int n =3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "srobot", "tadnk"};
		int fa = 0;
		for(int i =0; i<words.length-1; i++) {
			//System.out.println(words[i].endsWith(words[i+1].substring(0,1)));
			if (!words[i].endsWith(words[i+1].substring(0,1))) {
				fa = i+2;
			}
			
		}
		
		for(int i =0; i<words.length; i++) {
			for(int j =i+1; j<words.length; j++) {
				if (words[i].contains(words[j])) {
					System.out.println(words[i]);
					fa = j+1;
				}
			}
		}
		System.out.println(fa); // 9
		answer[0] = (int)Math.ceil((double)(fa/n));
		answer[1] = fa/n +1;
		System.out.println(answer[0]+"번째사람");
		System.out.println(answer[1]);
		
	}

}
