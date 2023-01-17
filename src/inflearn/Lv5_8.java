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

class Person {
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Lv5_8 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		
		Queue<Person> q = new LinkedList<>();
		
		for(int i =0; i<n; i++) {
			q.offer(new Person(i,arr[i])); //(0 60) (1 50) ...
		}
		while(!q.isEmpty()) {
			Person tmp = q.poll(); // poll 하면서 tmp에 넣어줌
			for(Person x: q) {
				if (x.priority > tmp.priority) {  //현재 위험도가 q에있는 위험도보다 낮은게 있으면
					q.offer(tmp);  //tmp를 뒤로 넣어줌
					tmp = null;
					break;
				}
			}
			if (tmp !=null) { // tmp가 null이면
				answer ++;
				if (tmp.id==k) {  //id값이 k 와 같으면
					return answer; //answer 리턴
				}
			}
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Lv5_8 T = new Lv5_8();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n ,k, arr));
	}
}

