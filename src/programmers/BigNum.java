package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class BigNum {

	public static void main(String[] args) {

		int[] numbers = {6,10,2};
		
		 String answer = "";
		 //숫자  -> 문자 -> 내림차순 정렬 -> 조합
		 //시간 초과 코드
		 
		 String[] strNums = new String[numbers.length];
		 for(int i=0; i<numbers.length; i++) {
			 strNums[i] =  "" +numbers[i];
		 }
		  Arrays.sort(strNums, new Comparator<String>() {
	            @Override
	            public int compare(String s1, String s2) {
	                return (s2+s1).compareTo(s1+s2);   // s2+s1이면 내림차순 바뀌면 오름차순
	            }
	        });
		  
		  //람다식
		  Arrays.sort(strNums, (s1,s2) ->
				  (s2+s1).compareTo(s1+s2));
		  
		 //아래 코드는 정렬 코드
		 
		 /*
		 for(int i =0; i<strNums.length-1; i++) {  //6
			 for(int j =i+1; j<strNums.length; j++) {  // 10 2
				 String s1 = strNums[i]; 
				 String s2 = strNums[j];
				 //102 210
				 if ((s1+s2).compareTo(s2+s1) < 0) { // 뒤에있는게 더 크면 210(뒤)가 102보다 크니
					strNums[i] = strNums[j]; // i 10 j 2 i가 2로 바뀌고
					strNums[j] = s1; //10이 뒤로
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
	        //문자열 리턴을 해줄 스트링배열 생성
	        String[] str = new String[numbers.length];
	        
	        //int배열 String배열로 변환
	        for(int i = 0; i < numbers.length; i++){
	            str[i] = String.valueOf(numbers[i]);
	        }     
	        
	        //내림차순 정렬
	        Arrays.sort(str, new Comparator<String>() {
	            @Override
	            public int compare(String a, String b) {
	                return (b+a).compareTo(a+b);  
	                //오름차순 정렬 (o1+o2).compareTo(o1+o2);
	            }
	        });
	        System.out.println(str[0]);
	        System.out.println(str[1]);
	        System.out.println(str[2]);
	        
        //0값이 중복일경우 ex){0,0,0}
        //답이 000이 나오면 안되므로 첫번째값이 0이면 0을 리턴
        if (str[0].equals("0")) {
        	answer ="0";
        }
        
        //0이 아니면 문자열을 더해준다.
        for(String s: str) {
        	answer += s;
        }
        System.out.println(answer);
		*/
		
		
		
	}

}
