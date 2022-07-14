// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class demo {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		
		findPermutation(str,0,str.length());
	}// Driver end

	private static void findPermutation(String str, int left, int right) {
		
		if(left==right) {
			System.out.println(str);
			return;
		}
		
		for (int i = left; i < right; i++) {
			str=swap(left,i,str);
			findPermutation(str, left+1, right);
			str=swap(left,i,str);
			
		}
		
	}

	private static String swap(int left, int index, String str) {
		char[] charArr=str.toCharArray();
		char temp=charArr[left];
		charArr[left]=charArr[index];
		charArr[index]=temp;
		return String.valueOf(charArr);

	}
}

