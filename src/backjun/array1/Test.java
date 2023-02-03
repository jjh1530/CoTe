package backjun.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		int[] numbers = {6,10,2};
		String answer ="";
		String[] str = new String[numbers.length];
	
		for(int i =0; i<numbers.length; i++) {
			str[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(str, new Comparator<String>() {
			@Override
			 public int compare(String o1, String o2) {
				System.out.println(o2+o1+"@");
				System.out.println(o1+o2);
                return (o2+o1).compareTo(o1+o2);
                //오름차순 정렬 (o1+o2).compareTo(o1+o2);
            }
		});
		
		
		
		for(String x : str) {
			answer += x;
		}
	}

}
