package codingTest;

public class Lv2_5 {

	public static void main(String[] args) {

		String s = "110010101001";
		int[] answer = new int[2];
		while(s.length()> 1) {  // s�� ���̰� 1�̻� // �ٽ� 110  // 10
			int count = 0;
			for(int i=0; i<s.length();i++) {
				
				if (s.charAt(i)== '0') {  // s�� �ε��� ���� 0�ϰ�� 
					answer[1]++; // 0�� �� �߰�  6 + 1 + 1
				}else {
					count ++; // 1�̸� count ++ (6)  2
				}
			}
			s = Integer.toBinaryString(count); // 6�� 2������  0110 // 10
			answer[0] ++; // ��ȯ Ƚ�� ++  
 		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	
	}

}
