package com.bellinfo.assign4;

public class Question9 {

	public static void main(String[] args) {
		String s = "This is a Java Class";
		char[] c = s.toCharArray();
		int s1 = c.length;
		int count = 0;
		for (int i = 0; i < s1; i++) {
			count = 0;
			for (int j = 0; j < s1; j++) {
				if (c[j] == c[i]) {
					count++;
				}
			}
			System.out.println("Number of Occurences " + c[i] +   +count+ "times");
		}

	}

}
