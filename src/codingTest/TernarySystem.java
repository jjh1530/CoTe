package codingTest;

public class TernarySystem {
	public static void main(String[] args) {
		int n = 45;
		String s = Integer.toString(n, 3);
		StringBuilder sb = new StringBuilder(s);
		s =sb.reverse().toString();
		int answer = Integer.parseInt(s,3);
	}
}
