package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class BigNum {

	public static void main(String[] args) {

		int[] numbers = {6,10,2};
		
		 String answer = "";
		 //����  -> ���� -> �������� ���� -> ����
		 //�ð� �ʰ� �ڵ�
		 
		 String[] strNums = new String[numbers.length];
		 for(int i=0; i<numbers.length; i++) {
			 strNums[i] =  "" +numbers[i];
		 }
		  Arrays.sort(strNums, new Comparator<String>() {
	            @Override
	            public int compare(String s1, String s2) {
	                return (s2+s1).compareTo(s1+s2);   // s2+s1�̸� �������� �ٲ�� ��������
	            }
	        });
		  
		  //���ٽ�
		  Arrays.sort(strNums, (s1,s2) ->
				  (s2+s1).compareTo(s1+s2));
		  
		 //�Ʒ� �ڵ�� ���� �ڵ�
		 
		 /*
		 for(int i =0; i<strNums.length-1; i++) {  //6
			 for(int j =i+1; j<strNums.length; j++) {  // 10 2
				 String s1 = strNums[i]; 
				 String s2 = strNums[j];
				 //102 210
				 if ((s1+s2).compareTo(s2+s1) < 0) { // �ڿ��ִ°� �� ũ�� 210(��)�� 102���� ũ��
					strNums[i] = strNums[j]; // i 10 j 2 i�� 2�� �ٲ��
					strNums[j] = s1; //10�� �ڷ�
				}
			 }
		 }*/
		 
		 for(String s: strNums) {
			 answer+=s;
		 }
		 if (answer.startsWith("0")) {
			answer = "0";
		}
		 System.out.println(answer);
		 
		 /*
	        //���ڿ� ������ ���� ��Ʈ���迭 ����
	        String[] str = new String[numbers.length];
	        
	        //int�迭 String�迭�� ��ȯ
	        for(int i = 0; i < numbers.length; i++){
	            str[i] = String.valueOf(numbers[i]);
	        }     
	        
	        //�������� ����
	        Arrays.sort(str, new Comparator<String>() {
	            @Override
	            public int compare(String a, String b) {
	                return (b+a).compareTo(a+b);  
	                //�������� ���� (o1+o2).compareTo(o1+o2);
	            }
	        });
	        System.out.println(str[0]);
	        System.out.println(str[1]);
	        System.out.println(str[2]);
	        
        //0���� �ߺ��ϰ�� ex){0,0,0}
        //���� 000�� ������ �ȵǹǷ� ù��°���� 0�̸� 0�� ����
        if (str[0].equals("0")) {
        	answer ="0";
        }
        
        //0�� �ƴϸ� ���ڿ��� �����ش�.
        for(String s: str) {
        	answer += s;
        }
        System.out.println(answer);
		*/
		
		
		
	}

}
