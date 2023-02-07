package inflearn.DFS;

import java.util.LinkedList;
import java.util.Queue;

/*
class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt=rt =null;
	}
}*/

public class Lv7 {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0; // 레벨
		while(!Q.isEmpty()) { //비어있으면 참 비어있지 않으면 거짓
			int len = Q.size();  
			System.out.print(L + " : " );
			for(int i = 0; i<len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data+" ");
				if (cur.lt !=null) {
					Q.offer(cur.lt);
				}
				if (cur.rt != null) {
					Q.offer(cur.rt);
				}
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Lv7 tree = new Lv7();
		tree.root = new Node(1);
		tree.root.lt=new Node(2);
		tree.root.rt=new Node(3);
		tree.root.lt.lt=new Node(4);
		tree.root.lt.rt=new Node(5);
		tree.root.rt.lt=new Node(6);
		tree.root.rt.rt=new Node(7);
		tree.BFS(tree.root);
	}

}