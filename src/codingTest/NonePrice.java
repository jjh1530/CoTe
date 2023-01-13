package codingTest;

public class NonePrice {

	public static void main(String[] args) {
		int price = 3;
		
		int money = 30;
		int count = 4;
		int p = price;
		int t = 1;
		long answer = 0;
		
		
		while(count >= t) {
			answer += price;
			System.out.println(price);
			price= price + p; 
			t++;
		}
		if (answer > money) {
			answer = answer - money;
		}else {
			answer = 0;
		}
		System.out.println(answer);
	}
}
