package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Lv2_04 {
	public void solution(int n){
		/*
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(1);
		answer.add(1);
		for(int i =2; i<n; i++) {
			answer.add(answer.get(i-2)+answer.get(i-1));
		}*/
		//
		int a=1, b= 1, c;
		System.out.print(a + " " +b +" ");
		for(int i= 2; i<n; i++) {
			c = a+b;
			System.out.print(c+" ");
			a= b;
			b= c;
		}
	}
	
	public static void main(String[] args){
		Lv2_04 T = new Lv2_04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		 T.solution(n);
		
	}

}
