package org.raghu.dynamicConnnection;

import java.util.Random;

public class QuickUnion {
	int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int rowCount = 1;
	int root = 0;

	public boolean checkIfRoot(int i) {
		if (i == arr[i]) {
			root = i;
			return true;
		}
		return false;
	}

	public int root(int i) {
		boolean b = checkIfRoot(i);
		if (b == false) {
			i = arr[i];
			root(i);
		}
		return root;
	}

	public boolean isConntected(int i, int j) {
		int rootI = root(i);
		int rootJ = root(j);
		System.out.println();
		System.out.println(rowCount + ")" + "Root of Given index: " + i + " is= " + rootI);
		System.out.println("Root of Given index: " + j + " is= " + rootJ);
		if (rootI != rootJ) 
			return false;
		return true;
	}

	public void union(int i, int j) {
		System.out.println("Union of "+i+" "+j);
		int rootI = root(i);
		int rootJ = root(j);
		arr[rootI] = arr[rootJ];
		for(int k:arr)
			System.out.print(k+",");
		System.out.println();
	}

	public static void main(String[] args) {

		QuickUnion qf = new QuickUnion();
		//Random rnd = new Random();
		qf.union(4, 3);
		qf.union(3, 8);
		qf.union(6, 5);
		qf.union(9, 4);
		qf.union(2, 1);
		qf.union(5, 0);
		qf.union(7, 2);
		qf.union(6, 1); // qf.union(7,3);

		/*
		 * for (long i = 0; i < 200; i++)
		 * System.out.println(qf.isConntected(rnd.nextInt(10), rnd.nextInt(10)));
		 */

		System.out.println(qf.isConntected(7, 6));

	}
}
