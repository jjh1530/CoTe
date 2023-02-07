package inflearn.DFS;


public class Lv6 {
	static int n;
	static int[] ch;
	public void DFS(int L) {  // L이 n
		if (L == n+1) {// 종착점
			String tmp = "";
			for(int i = 1; i<= n; i++) {
				if (ch[i] == 1) {
					tmp += (i+ " ");
				}
			}
			if (tmp.length() > 0) {
				System.out.println(tmp);
			}
		}else {  //처음 들어오는 부분
			ch[L] = 1;
			DFS(L+1); // 왼쪽
			ch[L] = 0;
			DFS(L+1); // 오른쪽
		}
	}
	public static void main(String[] args) {
		Lv6 T = new Lv6();
		n = 4;
		ch= new int[n+1];
		T.DFS(1);
	}

}
