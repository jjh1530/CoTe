package codingTest;

public class PowerSqrt {

	public static void main(String[] args) {

		long n = 3;
		long answer =0;
		double sq =Math.ceil(Math.sqrt(n));
		System.out.println(sq);
		if (sq*sq == n) {
			answer = ((long)sq+1) * ((long) sq+1);
		}else {
			answer = -1;
		}
		
		System.out.println(answer);
	}

}
