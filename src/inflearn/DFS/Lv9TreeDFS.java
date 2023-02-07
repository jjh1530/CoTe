package inflearn.DFS;


/*
class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt=rt =null;
	}
}*/

public class Lv9TreeDFS {
	
		int[] dis = {1, -1, 5};
		Node root;
		public int DFS(int L, Node root) {
			
			if (root.lt == null && root.rt == null) {
				return L; //말단 노드일때 L이 답
			}else {
				return Math.min(DFS(L+1,root.lt), DFS(L+1,root.rt));
			}
	}
	
	public static void main(String[] args) {
		Lv9TreeDFS tree = new Lv9TreeDFS();
		tree.root = new Node(1);
		tree.root.lt=new Node(2);
		tree.root.rt=new Node(3);
		tree.root.lt.lt=new Node(4);
		tree.root.lt.rt=new Node(5);
		System.out.println(tree.DFS(0,tree.root));
	}

}