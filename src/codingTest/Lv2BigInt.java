package codingTest;

public class Lv2BigInt {

	public static void main(String[] args) {

		int n = 78;
		int one =Integer.bitCount(n);

		int nextInt = n;
		int answer = 0;
		int o = 0;
		while(o != one) {
			nextInt++;
			o = Integer.bitCount(nextInt);
			if (o == one) {
				answer = nextInt;
			}
		}
	}

}
