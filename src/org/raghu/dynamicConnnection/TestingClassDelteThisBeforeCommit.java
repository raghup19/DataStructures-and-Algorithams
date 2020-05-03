package org.raghu.dynamicConnnection;

public class TestingClassDelteThisBeforeCommit {
	int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int count = 0;
	int[] size = new int[arr.length];

	public boolean ifRoot(int i) {
		if (i == arr[i])
			return true;
		return false;
	}

	public int root(int i) {

		/*
		 * if (b == false) { System.out.println("i (" + i + ")" +
		 * " is not equals to arr[i] (" + arr[i] + ")"); System.out.println(i + "=" +
		 * arr[i]); i = arr[i]; System.out.println("Count++"); count++;
		 * System.out.println("calling the recursion with i values is =" + i +
		 * "and arr[i] value is =" + arr[i]); root(i); System.out.println("Count=" +
		 * count); s } System.out.println("root=" + arr[i]);
		 * System.out.println("-------"); return arr[i];
		 */
		if (i == arr[i])
			return arr[i];
		else {
			i = arr[i];
			
			count++;
			
			root(i);
		}
		if (count != 0)
			size[arr[i]] = count;
		count = 0;
		return arr[i];
	}

	public void union(int i, int j) {
		System.out.println("Calling the root of i=" + i);
		int rootI = root(i);
		System.out.println("calling the root of j=" + j);
		int rootJ = root(j);
		arr[rootI] = arr[rootJ];
	}

	public static void main(String[] args) {
		TestingClassDelteThisBeforeCommit t = new TestingClassDelteThisBeforeCommit();

		// System.out.println(t1);
		t.union(4, 3);
		t.union(3, 8);
		t.union(6, 5);
		t.union(9, 4);
		// t.union(6, 4);
		// System.out.println("root of 4="+t.root(4));
		// int t1=t.root(4);
		// System.out.println(t1);
	}

}
