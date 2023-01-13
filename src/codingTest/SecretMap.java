package codingTest;

public class SecretMap {

	public static void main(String[] args) {
		
		int n = 6;
		int[] arr1 = {1, 0, 28, 18, 11,15};
		int[] arr2= {30, 1, 21, 17, 28,32};
		String[] map1 = new String[arr1.length];
		String[] map2 = new String[arr2.length];
		String[] answer = new String[n];
		String base ="";
		for(int i =0; i<n-1; i++) {
			base += "0";
		}
		//System.out.println(Integer.toBinaryString(arr2[0])); // 
		for(int i=0; i<arr1.length; i++) {
			String a =  Integer.toBinaryString(arr1[i]); // 1
			if (a.length() < n) { // 5 < 6
				String zero ="";
				for(int j =0; j<n-a.length(); j++) {
					zero+="0";
				}
				a= zero +Integer.toBinaryString(arr1[i]);
			}
			
			String b =  Integer.toBinaryString(arr2[i]);
			if (b.length() < n) { // 5 < 6
				String zero2 ="";
				for(int j =0; j<n-b.length(); j++) {
					zero2+="0";
				}
				b = zero2 +Integer.toBinaryString(arr2[i]);
				
			}
			map1[i] = a;
			map2[i] = b;

		}
		
		String s = "";
		for(int i =0; i<map1.length; i++) { // 0 <6 0 1 2 3 4 5
			s= "";
			for(int j =0; j<map1.length; j++) { // 0 < 6 0 1 2 3 4 5
				String maps = String.valueOf(map1[i].charAt(j)) + String.valueOf(map2[i].charAt(j));
				if (!maps.equals("00")) { 
					s+="#";
				}else {
					s+=" ";
				}

			}
			answer[i] = s;
		}
		

		String temp;
		for(int i =0; i<n; i++) {
			temp =String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
			System.out.println(String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i])) );
			temp = temp.substring(temp.length()-n); //16 - 6 Â¥¸§
			temp = temp.replaceAll("1", "#");
	        temp = temp.replaceAll("0", " ");
	        //System.out.println(temp);
		}
		
		
	}

}
