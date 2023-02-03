package cra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		int[] intArr =new int[]{1,3,5,2,4}; 
		Arrays.sort(intArr,2,5);// intArr[2]~intArr[4]의 값만 정
		
		Integer[] integerArr =new Integer[]{1,3,5,2,4}; 
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int x : integerArr) {
			list.add(x);
		}
		
		Collections.sort(list);
		for(int x : list) {
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("d", 1);
		map.put("c", 1);
		map.put("d", 1);
		map.put("e", 1);
		
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
		for(String x : map.keySet()) {
			System.out.println(x);
		}
		
		for(int x : map.values()) {
			System.out.println(x);
		}
	}

}
