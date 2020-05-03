package org.raghu.dynamicConnnection;

import java.util.Random;

public class QuickUnionWeightedTree {
	//int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int[] arr = { 0, 1, 2, 4, 5, 6, 7, 8, 0, 9 };
	int count = 0;
	int[] size = new int[arr.length];
	int rowCount=1;
	int root=0;
	
	public boolean checkIfRoot(int i) {
		if (i == arr[i]) {
			root = i;
			return true;
		}
		return false;
	}
	
	public int root(int i) {
		boolean b=checkIfRoot(i);
		if(b==false) {
			i = arr[i];
			count++;
			root(i);
		}
		if (count != 0)
			size[arr[i]] = count;
		
		count = 0;
		return root;
	}

	public boolean isConntected(int i, int j) {
		int rootI = root(i);
		int rootJ = root(j);
		System.out.println(rowCount+")"+"Root of Given node: "+i+" is= "+rootI);
		System.out.println("Root of Given node: "+j+" is= "+rootJ);
		rowCount++;
		if (rootI != rootJ) 
			return false;
		return true;
	}

	public void union(int i, int j) {
		int rootI = root(i);
		int rootJ = root(j);
		int sizei = size[rootI];
		int sizej = size[rootJ];
		if (sizei < sizej)
			arr[rootI] = rootJ;
		else

			arr[rootJ] = rootI;
	}

	public static void main(String[] args) {
		/*
		 * Random rnd = new Random(); QuickUnionWeightedTree qf = new
		 * QuickUnionWeightedTree();
		 * 
		 * qf.union(4, 3); qf.union(3, 8); qf.union(6, 5); qf.union(9, 4);
		 * 
		 * 
		 * for (long i = 0; i < 20000; i++) {
		 * System.out.println("is connected:"+qf.isConntected(rnd.nextInt(10) ,
		 * rnd.nextInt(10)));
		 * System.out.println("--------------------------------------------------"); }
		 */
		QuickUnionWeightedTree qw= new QuickUnionWeightedTree();
		System.out.println(qw.root(3));
		
	}
}
