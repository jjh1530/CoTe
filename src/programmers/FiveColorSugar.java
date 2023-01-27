package programmers;

public class FiveColorSugar {

	public static void main(String[] args) {

		String candy = "RYRYRGRRYRYRBB";
		int[] positions = {12,1,14,7};
		
		int i = 0; // ���� ���� �ε���
        int[] backwardIndices = new int[candy.length()];
        for (int j = 1; j < candy.length(); j++) {
            final char ch = candy.charAt(j); // ���� ����

            // ���� ������ ���� ������ �ٸ��� ���� ������ ���� �� ���� �������� �Ž��� �ö�
            while (i > 0 && ch != candy.charAt(i)) {
                i = backwardIndices[i];
            }

            // ���� ������ ���� ������ ������ ���� ������ �������� �ű�
            if (ch == candy.charAt(i)) i += 1;
            backwardIndices[j] = i;
        }

        int[] answer = new int[positions.length];
        for (int j = 0; j < positions.length; j++) {
            int count = 0;
            int k = positions[j] - 1; // �ε����� �����

            // k ��°���� �߶��� �� �ݺ��Ǵ� ������ ���� ���ϱ�
            while (backwardIndices[k] > 0) {
                k = backwardIndices[k] - 1; // �ε����� �����
                if (k < 0) break;
                count++;
            }

            answer[j] = count;
        }
        for(int x : answer) {
        	System.out.println(x);
        }

	}

}
