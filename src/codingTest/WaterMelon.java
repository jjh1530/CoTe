package codingTest;

public class WaterMelon {

	public static void main(String[] args) {
		int n =3;
		String answer ="";
		for(int i=0; i<n; i++) {
			if (i%2 ==0) {
				answer += "¼ö";
			}else {
				answer +="¹Ú";
			}
		}
		System.out.println(answer);
	}

}
