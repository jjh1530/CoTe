package inflearn.lv7;

public class Lv1 {

	public void DFS(int n) {
		
		if (n==0) {
			return;
		}else {
			DFS(n-1);
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		Lv1 T = new Lv1();
		T.DFS(3);
	}

}
