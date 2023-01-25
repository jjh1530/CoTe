package programmers;

import java.util.HashMap;
import java.util.Map;

public class Tree {

	public static void main(String[] args) {

		int[] bell = {1,2,1,1,1,2,2,1};
		
		for(int i =0; i<bell.length; i++) {
			if (bell[i] ==2) {
				bell[i] = -1;
			}
		}
		
		int total = bell[0];
		int answer =0;
		
		// <����� ������ ��, ���� �������� ó������ ���� �ε���>
        Map<Integer, Integer> dict = new HashMap<>();
        dict.put(0, -1);
        dict.put(total, 0);
        
        for(int i=1; i<bell.length; i++) {
            total += bell[i];
            if(!dict.containsKey(total)) {
                // �������� ó�� ���� ���, �ε����� ����
                dict.put(total, i);
            } else {
              // ó�� �湮�� ������ �ε������� ���� �ε������� ¦�� �¾������� �ǹ�
                answer = Math.max(answer, i - dict.get(total));
            }
        }
        System.out.println(answer);
	}

}
