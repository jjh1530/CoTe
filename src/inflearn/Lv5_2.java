package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Lv5_2 {
	public int solution(int[][] board, int[] moves) {
		int answer =0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) {
			for(int j =0; j<board.length; j++) {
				if (board[j][pos-1] !=0) {
					int tmp = board[j][pos-1];
					board[j][pos-1] = 0;
					if (!stack.isEmpty() &&tmp ==stack.peek()) {  //값만 확인 peek 값 확인 과 빼기 pop
						answer+=2;
						stack.pop();
					}else {
						stack.push(tmp);
					}
					break;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Lv5_2 T = new Lv5_2();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[][] board=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				board[i][j]=kb.nextInt();
			}
		}
		int m=kb.nextInt();
		int[] moves=new int[m];
		for(int i=0; i<m; i++) moves[i]=kb.nextInt();
		System.out.println(T.solution(board, moves));
	}
}

