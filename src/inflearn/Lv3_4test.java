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
			sum+= a[rt]; // sum이 m과 같거나 크기전까지는 계속 sum 오름
			if (sum==m) {
				answer ++; // sum 이 m과 같으면 answer ++
			}
			while(sum>=m) { // sum이 m보다 크거나 같으면
				sum-=a[lt]; // lt는 0부터 a[lt] 빼고
				lt++; //lt증가
				if (sum==m) { // lt를 뺴고나서 같으면 answer ++
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
