package inflearn;

public class Pabonachi {

	public static void main(String[] args) {
		int n = 10;
		int a = 1;
		int b =1;
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		int x = 0;
		for(int i =2; i<n; i++) {
			arr[i] = arr[i-2] +arr[i-1];
			x++;
		}
	}

}
