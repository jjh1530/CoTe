package programmers;

public class Tri {

	public static void main(String[] args) {

		int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4}};
		
		
		int answer =0;
		for(int i =1; i< triangle.length; i++) {
			for(int j = 0; j<triangle[i].length; j++) {
				if (j == 0) {
					triangle[i][j] = triangle[i][j] + triangle[i-1][j];
				}else if(i == j) {
					triangle[i][j] = triangle[i][j] + triangle[i-1][j-1];
				}else {
					int left =triangle[i][j] + triangle[i-1][j-1];
					int right = triangle[i][j] + triangle[i-1][j];
					triangle[i][j] = Math.max(left, right);
				}
				
				answer = Math.max(triangle[i][j], answer);
			}
		}
		System.out.println(answer);
	}

}
