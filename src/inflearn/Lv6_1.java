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
		
		for(int i =0; i<n-1; i++) { // 마지막 남은 숫자는 무조건 제일 큰 수
			int idx = i;  // 비교할 숫자 idx
			for(int j = i+1; j<n; j++) { // 계속 반복 하지만 j의 수가 i보다 작아지면 넘어감 
				if (arr[j] < arr[idx]) {  //i뒤의 숫자들이 i보다 작으면   
					idx =j;    // idx를 작은숫자로
				}
			}
			int temp = arr[i];   // 원래 i 숫자를 temp로
			arr[i] = arr[idx];   // 앞에 작은 수 배치
			arr[idx] = temp;    // 뒤에 큰 수 배치
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

