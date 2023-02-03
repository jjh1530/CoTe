package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class HalFame {

	public static void main(String[] args) {

		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int k = 3;
		int[] answer =new int[score.length];
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();


        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]); 
           
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
            answer[i] = priorityQueue.peek();
        }
      //  for(int x : priorityQueue) {
        	//System.out.println(x); // 1 v10 20 150 100 100 200
       // }
        for(int x : answer) {
        	System.out.println(x);
        }
	}
}
