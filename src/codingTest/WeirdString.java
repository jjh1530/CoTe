package codingTest;

public class WeirdString {

	public static void main(String[] args) {

		String s = "try hello world ";
		String answer ="";
		s = s.toUpperCase();
		String[] arr = s.split(" ");
		if (String.valueOf(s.charAt(0)).equals(" ")) {
			answer += " ";
		}
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length(); j++) {
				if (j%2 ==0) {
					answer += arr[i].charAt(j);
				}else {
					answer += String.valueOf(arr[i].charAt(j)).toLowerCase();
				}
			}
			if(arr.length-1 >i) { // 2 >  0 1
				answer += " ";
			}
			
		}
		if (String.valueOf(s.charAt(s.length()-1)).equals(" ")) {
			answer += " ";
		}
		
		System.out.println(answer);
	}
	

}
