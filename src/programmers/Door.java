package programmers;

public class Door {

	public static void main(String[] args) {

		int goal = 43; // ��ǥ ���귮
		int[] durations = {5,3,7,6,4}; //�뵿���� �ϳ� ����� �ð�
		int[] doorNum = new int[durations.length];
		long sum =0;
		long min = Integer.MAX_VALUE;
		int maxDuration = 0; // ���� ���� �ɸ��� �ð�
		long max = 0;
		
		for(int i =0; i<durations.length; i++) {
			maxDuration = Math.max(maxDuration,durations[i]); 
		}
		for(int i =0; i<durations.length; i++) {
			max =maxDuration * (goal/durations.length +1L);
			doorNum[i] = (goal-1)/durations[i];
		}
		System.out.println(max);
		for(int i =0; i<durations.length; i++) {
			if (min > doorNum[i] ) {
				min = doorNum[i];
			}
		}
		for(int i =0; i<doorNum.length; i++) {
			sum += (doorNum[i] - min) ;
		}
		long answer =0; 
		answer = sum * 10_000L;
		System.out.println(answer);
	}

}
