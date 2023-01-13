package codingTest;

import java.util.Arrays;

public class IntDuo {

	public static void main(String[] args) {

			String X = "100";
			String Y = "203045";
			String a ="";

			int[] xnum = new int[10];
			int[] ynum = new int[10]; 
			int[] num = new int[10];
			for(int i =0; i<X.length(); i++) {
				xnum[(int) X.charAt(i)-'0']++;
			}
			for(int i =0; i<Y.length(); i++) {
				ynum[(int) Y.charAt(i)-'0']++;
			}
			for(int i =0; i<xnum.length; i++) {
				if (xnum[i] !=0  && ynum[i] !=0) {
					//i 가 숫자 자체 num[i]가 개수
					if (xnum[i] > ynum[i]) {
						num[i] = ynum[i];
					}else if(xnum[i] < ynum[i]) {
						num[i] = xnum[i];
					}else if(xnum[i] == ynum[i]){
						num[i] = xnum[i]; 
					}
				}
				for(int j =0; j<num[i]; j++) {
					a+=i;
				}
				
			}
			
			if (a.isEmpty()) {
				a+= "-1";
			}
		
			StringBuilder sb = new StringBuilder(a);
			
			String answer ="";
			if (a.equals("-1")) {
				answer = "-1";
			}else {
				answer =sb.reverse().toString();
				
			}
			for(int i=0; i<a.length(); i++) {
				if (String.valueOf(a.charAt(i)).equals("0")) {
					answer = "0";
				}
			}
			
			System.out.println(answer);
 			

	}

}
