package inflearn.lv7;


public class Lv6 {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if (L == n+1) {
			
		}else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	public static void main(String[] args) {
		Lv6 T = new Lv6();
		n = 3;
		ch= new int[n+1];
		T.DFS(1);
	}

}
