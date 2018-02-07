package com.bellinfo.assign4;

public class Question3 {

	public static void main(String[] args) {
	/*	Question3 str = new Question3();
		int str1 = str.Count();
		System.out.println(str1);

	}

	public int Count() {
		int count = 0;
		String s = "This is a Java Class";
		String s1[] = null;
		s1 = s.split(" ");
		int lenght = s1.length;

		for (int i = 0; i < s1.length; i++) {
			int countonechar = s1[i].length();
			if (countonechar == 1) {
				System.out.println("The One Character is " + s1[i]);
			}
			

	}
		return count;
	}*/
		String s = "This is Java Class";
		String x = "";
		for(int i=s.length()-1; i>0;i--) {
			x=x+s.charAt(i);
		}
		System.out.println("The reverse of given string is");
}
}
