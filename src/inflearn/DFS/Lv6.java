package inflearn.DFS;


public class Lv6 {
	static int n;
	static int[] ch;
	public void DFS(int L) {  // L�� n
		if (L == n+1) {// ������
			String tmp = "";
			for(int i = 1; i<= n; i++) {
				if (ch[i] == 1) {
					tmp += (i+ " ");
				}
			}
			if (tmp.length() > 0) {
				System.out.println(tmp);
			}
		}else {  //ó�� ������ �κ�
			ch[L] = 1;
			DFS(L+1); // ����
			ch[L] = 0;
			DFS(L+1); // ������
		}
	}
	public static void main(String[] args) {
		Lv6 T = new Lv6();
		n = 4;
		ch= new int[n+1];
		T.DFS(1);
	}

}
