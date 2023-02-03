package codingTest;

import java.util.Stack;

public class Hambuger {

	public static void main(String[] args) {

		int[] ingredient = {1,2,3,1,2, 1, 1, 2, 3, 1, 2, 3};
		String t = "";
		for(int x : ingredient) {
			t+= x+"";
		}
		int answer = 0;
		while(t.contains("1231")) {
			if (t.contains("1231")) {
				int replaceLength = t.length() - (t.replace("1231", "").length());
				answer += replaceLength;
				t= t.replace("1231", "");
			}
		}
		answer = answer/4;
		System.out.println(answer);
		
		Stack<Integer> stack = new Stack<>();
		int ans = 0;
		for(int x : ingredient) {
			stack.push(x);
			
			if (stack.size() >=4)  {
				if (stack.get(stack.size()-4) ==1 &&
					stack.get(stack.size()-3) ==2 &&
					stack.get(stack.size()-2) ==3 &&
					stack.get(stack.size()-1) ==1 ) {
					
					ans ++;
					stack.pop();
					stack.pop();
					stack.pop();
					stack.pop();
				}
			}
		}
		System.out.println(ans);
	}

}
