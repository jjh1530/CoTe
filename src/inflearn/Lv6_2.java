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


public class Lv6_2 {
	public int[] solution(int n, int[] arr) {
		/*
		for(int i =0; i<n-1; i++) {
			int index = i;  //8  8
			for(int j =i+1; j<n; j++) { // 3 7 5 4 2
				if(arr[index] >arr[j]) {  // 8�� > 3���� ũ��  8 > 7
					int tmp = arr[index]; // tmp�� 8  8
					arr[i] = arr[j]; // 8[0]�� 3  8[1]�� 7
					arr[j] = tmp;  // 3�� 8    7 �� 8
				}
			}
		}*/
		for(int i=0; i<n-1; i++) {   // 5��� 0 1 2 34
			for(int j =0; j<n-i-1; j++) {  // 0~4 0~3 0~ 2 0~1 ����
				if (arr[j]> arr[j+1]) {  //�տ� ���� �� ũ��
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Lv6_2 T = new Lv6_2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}

