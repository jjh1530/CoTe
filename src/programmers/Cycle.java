package programmers;

public class Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cost = {{0,10},{50,20}};
		int[][] order = {{3,100},{4,200}}; // 00 01 10 11
		
		int answer =0;
		int maxMonth =0;
		
			for(int i =0; i<order[0].length; i++) {
				maxMonth = Math.max(maxMonth, order[i][0]);
			}
		System.out.println(maxMonth);
		
		int[] monthlyOrder = new int[maxMonth];
		int need =0;
		int made =0;
		 for (int[] o : order) {
	            // order �迭�� ���ĵǾ� ���� ������ �����ϼ���.
			
	            monthlyOrder[o[0] - 1] += o[1]; // ���� index�� ����ϱ� ���� -1�� ���ݴϴ�
	            need += o[1];
	        }
		 System.out.println(monthlyOrder[0]);
		 System.out.println(monthlyOrder);
		 System.out.println(need);
		 
		 for(int i =0; i<order[0].length; i++) {
			  monthlyOrder[i] = order[i][0];
			  need = order[i][1];
		 }
		
	}

}
