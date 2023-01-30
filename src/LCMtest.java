import java.util.Arrays;
public class LCMtest {

		public static int solution(int[] arr) {
	        int lcm = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            lcm = lcm(lcm, arr[i]);
	        }
	        return lcm;
	    }

	    private static int lcm(int a, int b) {
	        return a * b / gcd(a, b);
	    }

	    private static int gcd(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return gcd(b, a % b);
	    }
	    public static void main(String[] args) {
	        int[] arr = {2, 6, 8,14};
	        System.out.println("LCM of " + Arrays.toString(arr) + " is : " + solution(arr));
	    }

	}

