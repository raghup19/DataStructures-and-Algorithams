package org.raghu.dynamicConnnection;

import java.util.Random;

public class QuickFind {

	int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int rowCount=1;

	public boolean isConnected(int i, int j) {
		System.out.println(rowCount+")"+"Given numbers are: I="+i+" J="+j);
		rowCount++;
		if (arr[i] == arr[j])
			return true;
		return false;
	}

	public void union(int i, int j) {
		if (!isConnected(4,8)){
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] == i) {
					arr[k] = j;
				}
			}
		}
	}

	public static void main(String[] args) {
		QuickFind qf = new QuickFind();
		Random rnd = new Random();
		qf.union(4, 3);
		
		qf.union(3, 8); qf.union(6, 5);
		 
		
		/*
		 * for(long i=0;i<200 ;i++) {
		 * System.out.println(qf.isConnected(rnd.nextInt(10),rnd.nextInt(10)));
		 * System.out.println("--------------------------------------------------"); }
		 */
		
		System.out.println(qf.isConnected(4,8));
	}
}
