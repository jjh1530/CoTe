package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;


public class Lv6_1 {
	public int[] solution(int n, int[] arr) {
		
		for(int i =0; i<n-1; i++) { // ������ ���� ���ڴ� ������ ���� ū ��
			int idx = i;  // ���� ���� idx
			for(int j = i+1; j<n; j++) { // ��� �ݺ� ������ j�� ���� i���� �۾����� �Ѿ 
				if (arr[j] < arr[idx]) {  //i���� ���ڵ��� i���� ������   
					idx =j;    // idx�� �������ڷ�
				}
			}
			int temp = arr[i];   // ���� i ���ڸ� temp��
			arr[i] = arr[idx];   // �տ� ���� �� ��ġ
			arr[idx] = temp;    // �ڿ� ū �� ��ġ
		}
		
	
		return arr;
	}
	
	public static void main(String[] args) {
		Lv6_1 T = new Lv6_1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}

