package codingTest;

import java.util.ArrayList;
import java.util.Stack;

public class Crain {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},
						{0,0,1,0,3},
						{0,2,5,0,1},
						{4,2,4,4,2},
						{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int answer =0;
		Stack<Integer> stack =  new Stack<>();
		
		for(int pos : moves) {
			for(int i =0; i<board.length; i++) {
				if (board[i][pos-1] != 0) {
					if (!stack.isEmpty() && board[i][pos-1] == stack.peek()) {  // 비어있지 ㅇ낳고 board의 값이 stack의 최상단과 같으면
						answer+=2;
						stack.pop();
					}else {
						stack.push(board[i][pos-1]);
					}
					board[i][pos-1] = 0;
					break;
				}
			}
		}
		System.out.println(answer);
		
	}

}
