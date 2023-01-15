package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lv3_07 {
	public int solution(int n, int k, int[] arr) {
		//14 2
		//1 1 0 0 1 1 0 1 1 0 1 1 0 1
 		int answer = 0;
 		int count = 0; // 0�� 1�� �ٲ� Ƚ��
 		int lt = 0;
 		for(int rt =0; rt<n; rt++) {
 			if(arr[rt] == 0) {  // 5������ 0�� 1��
 				count ++;
 			}
 			while(count > k) { // rt 5�������� ��������
 				if (arr[lt] == 0) {  // 5�� ������ arr[lt]�� 0�̸� count -- 
					count--;
				}
 				lt++; //3 4�� �ѱ�鼭 lt ����
 			}
 			answer = Math.max(answer, rt-lt+1);
   		}
		
		return answer;
	}
	public static void main(String[] args) {
		Lv3_07 T = new Lv3_07();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k= kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
	
		System.out.println(T.solution(n,k,arr));
	}

}
