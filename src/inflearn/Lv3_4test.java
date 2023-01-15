package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lv3_4test {
	public int solution(int n, int m, int[] a) {
		int answer=0;
		int sum =0;
		int lt =0;
		for(int rt =0; rt<n; rt++) {
			sum+= a[rt]; // sum�� m�� ���ų� ũ���������� ��� sum ����
			if (sum==m) {
				answer ++; // sum �� m�� ������ answer ++
			}
			while(sum>=m) { // sum�� m���� ũ�ų� ������
				sum-=a[lt]; // lt�� 0���� a[lt] ����
				lt++; //lt����
				if (sum==m) { // lt�� ������ ������ answer ++
					answer++;
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Lv3_4test T = new Lv3_4test();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] a=new int[n];
		int m=kb.nextInt();
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		System.out.println(T.solution(n, m, a));
	}

}
