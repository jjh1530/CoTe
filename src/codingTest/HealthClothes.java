package codingTest;

import java.util.Arrays;
import java.util.HashSet;

public class HealthClothes {

	public static void main(String[] args) {
		
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		// 5명의 학생 2명이 잃어버림 1명은 여분이있음 5-2+1
		
		int answer = n - lost.length; // 기본 answer = 총인원 - 잃어버린 학생
        
		 Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){ 
            for(int j=0; j<reserve.length; j++){ 
                if(lost[i] == reserve[j]){ // 잃어버린 학생 == 여벌 학생에 있우면
                    answer++;
                    lost[i] = -1; // 2번 학생이 잃어버리면 2를 제외
                    reserve[j] = -1;  // 여벌하나도 제외
                    break; 
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){ 
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){ // 값이 있으면
                    answer++;
                    reserve[j] = -1; //reserve하나 제외
                    break; 
                }
            }
        }
		
		
		
	}
}
