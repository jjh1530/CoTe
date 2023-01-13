package codingTest;

public class Lv2_7 {

	public static void main(String[] args) {

		int n =3;
		int a1 = 1;
        int a2 = 1;
        int a3;
        int answer= 0;
       for(int i=2; i<= n; i++) {
    	   answer =(a1+a2)%123456;
    	   a1=a2;
    	   a2=answer;
       }
       System.out.println(answer);
	}

}
