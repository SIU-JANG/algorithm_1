package boj;

import java.util.Arrays;

public class NextPermutation {
	
	static int COUNT;
	static int[] src = { 1, 2, 3, 4, 5 };
	
	public static void main(String[] args) {
		while (true) {
			if (!np()) break;
		}
		
		System.out.println(COUNT);
	}
	
	static boolean np() {
		int i = src.length - 1;
		while(i > 0 && src[i - 1] >= src[i]) --i;
		
		if (i == 0) return false;
		
		int j = src.length - 1;
		while (src[i - 1] >= src[j]) --j;
		swap(i - 1, j);
		
		int k = src.length - 1;
		while (i < k) {
			swap(i++, k--);
		}
		
		System.out.println(Arrays.toString(src));
		COUNT++;
		return true;
	}
	
	static void swap(int i, int j) {
		int temp = src[i];
		src[i] = src[j];
		src[j] = temp;
	}
}
