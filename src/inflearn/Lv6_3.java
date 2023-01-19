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


public class Lv6_3 {
	public int[] solution(int n, int[] arr) {
		// 11 7 5 6 10 9
		for(int i =1; i<n; i++) {
			int tmp =arr[i];  // 7
			int j;
			for(j =i-1; j>=0; j--) {
				if (arr[j] > tmp) {  // 11 > 7
					arr[j+1] = arr[j];
				}else {
					break;
				}
			}
			arr[j+1] = tmp; 
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Lv6_3 T = new Lv6_3();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}

