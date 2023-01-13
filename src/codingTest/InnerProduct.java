package codingTest;

public class InnerProduct {

	public static void main(String[] args) {
		int[] a = {-1,0,1};
		int[] b= {1,0,-1};
		int answer =0;
		for(int i =0; i<a.length; i++) {
			for(int j =i; j<=i; j++) {
				answer += a[i]*b[j];
			}
		}
		System.out.println(answer);
		
	}

}
