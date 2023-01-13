package programmers;

public class Price2 {

	public static void main(String[] args) {

		int[] budgets = {120,110,140,150};
		int M = 485;
		// 485 - 330  155
		int answer = 0;
		int min = 0;
		int max = 0;
		
		for(int i =0; i<budgets.length; i++) {
			if (budgets[i] > max) {
				max = budgets[i];  //�ִ밪
			}
		}
		
		while(min <= max ) {
			int mid = (min+ max) /2;   // 75  113  132 122 127 129 128 127  //
			int sum = 0;
			for(int i =0; i<budgets.length; i++) {
				if (budgets[i] > mid) {  //�� ������ �̵庸�� ũ��
					sum+= mid;    //�̵尪��  sum��
				}else {
					sum+= budgets[i]; // ���� �̵尪���� ������ ���� �־���
				}
			}
			
			if (sum <= M) {  //sum�� ��ü ������ ���� ������
				min = mid + 1; 
				answer = mid;
			}else {
				max = mid-1;
			}
			System.out.println(min);
		}
		System.out.println(answer);
		
		
	}

}
