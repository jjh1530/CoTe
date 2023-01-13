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
		Stack<Integer> stack = new Stack<>();
		int answer =0;
		stack.push(0);
		
		for(int i =0; i<moves.length; i++) {
			for(int j =0; j<board.length; j++) {
				if (board[j][moves[i]-1] != 0) {
					if (!stack.empty() && stack.peek() == board[j][moves[i]-1]) {
						answer+=2;
						stack.pop();
						board[j][moves[i]-1] = 0;
						break;
					}else{
                        stack.push(board[j][moves[i]-1]);                      
                        board[j][moves[i]-1] = 0;
                        break;
                    }
				}
			}
		}
		System.out.println(answer);
		
	}

}
