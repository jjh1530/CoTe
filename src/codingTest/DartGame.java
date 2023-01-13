package codingTest;

public class DartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dartResult = "1S2D*3T";
		//1S = 1Á¡ *2 2
		//2D = 4Á¡ *2  8 
		// 3ÀÇ 3Á¦°ö 27
		int answer = 0;
		char[] carr = dartResult.toCharArray();
		System.out.println(Math.pow(3, 3));
		for(int i =0; i<dartResult.length(); i++) {
			if (Character.isDigit(carr[i])) {
				//System.out.println(carr[i]);
				if (carr[i+1] =='S') {
					try {
						if (carr[i+2] =='*') {
							answer += Integer.parseInt(String.valueOf(carr[i]))*2;
						}else {
							answer += Integer.parseInt(String.valueOf(carr[i]));
							System.out.println(answer);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}else if(carr[i+1] == 'D') {
					try {
						if (carr[i+2] =='*') {
							answer += (Integer.parseInt(String.valueOf(carr[i])) *2)*2;
						}else {
							answer += Integer.parseInt(String.valueOf(carr[i])) *2;
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}else if(carr[i+1] == 'T') {
					
					try {
						if (carr[i+2] =='*') {
							answer += (Integer.parseInt(String.valueOf(carr[i])) *3)*2;
						}
					} catch (Exception e) {
						answer += Math.pow((Integer.parseInt(String.valueOf(carr[i]))),3)*2;
					}
					
				}
			}
		}
		System.out.println(answer);
	}

}
