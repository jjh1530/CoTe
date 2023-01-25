package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

class Point implements Comparable<Point>{
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point o){
		if(this.x==o.x) return this.y-o.y;
		else return this.x-o.x;
	}
}
public class Lv6_7 {
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Point> arr=new ArrayList<>();
		for(int i=0; i<n; i++){
			int x=kb.nextInt();
			int y=kb.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for(Point o : arr) System.out.println(o.x+" "+o.y);
	}
}

