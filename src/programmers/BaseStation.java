package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BaseStation {

	public static void main(String[] args) {
		int n = 11;
		int[] stations = {4,11};
		int w = 1;
		int answer = 0;
		int position = 1;
		/*Queue<Integer> sq = new LinkedList<>();
		for(int s : stations) {
			sq.offer(s); // ť�� �� �־��ֱ�
		}
		
		int position = 1;
		while(position <=N) { // �������� �� ��ü�� ��������
			//sq(���� ��ġ ������)�� ������� �ʰ� 11 <= 6 11<=12
			if(!sq.isEmpty() &&sq.peek() - w <=position) {  //�������� ���� ���� ���� 
				position = sq.poll() +w +1; // position �� 4�� �� ���� 4 +1 +1 6
				System.out.println(position +"@@");
			}else {
				//1�� �� ��ġ
				answer += 1;  // ������ ��ġ ���� ���� 
				
				position += w *2 +1 ; //���� ���� ����  position�� 1+3���� 6 + 3 position 9 + 3 12
				System.out.println(position +"!!");
			}
		}*/
		
		int si = 0; // �����̼� �ε���
		while(position <= n) {
			// 0 < 2  4 <= 1 ele��  0<2 4<=4 si ++  position 6   1<2 11<6 else�� position 9  1<2 11<9 
			if (si <stations.length && stations[si] -w <=position)  {  // si�� �����̼��� ���̺��� �۰� 4-1 �� position���� �۰ų� ���� ��
				position = stations[si]+w +1; // position �� 4�� �� ���� 4 +1 +1 6
				System.out.println(position+"@");
				si+=1;
			}else {
				//1�� �� ��ġ
				answer += 1;  // ������ ��ġ ���� ���� 
				
				position += w *2 +1 ; //���� ���� ����  position�� 1+3���� 6 + 3 position 9 + 3 12
				System.out.println(position+"!");
			}
		}
		System.out.println(answer);
	}
}
