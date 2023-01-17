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
			Person tmp = q.poll(); // poll �ϸ鼭 tmp�� �־���
			for(Person x: q) {
				if (x.priority > tmp.priority) {  //���� ���赵�� q���ִ� ���赵���� ������ ������
					q.offer(tmp);  //tmp�� �ڷ� �־���
					tmp = null;
					break;
				}
			}
			if (tmp !=null) { // tmp�� null�̸�
				answer ++;
				if (tmp.id==k) {  //id���� k �� ������
					return answer; //answer ����
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

