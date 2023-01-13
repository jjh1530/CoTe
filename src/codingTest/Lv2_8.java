package codingTest;


public class Lv2_8 {

	public static void main(String[] args) {

		int brown = 24;
		int yellow = 24;
		int sum = brown + yellow;
		int[] answer = new int[2];
		
		int y =0;
		int x =0;
		for(int i =1; i<=yellow; i++) {
			y= Math.min(i,yellow/i);
			x= Math.max(i,yellow/i);
			System.out.println(y);
			System.out.println(x);
			if ((y+2)* (x+2)== sum) { //48
				break;
			}

		}
		
	}

}
