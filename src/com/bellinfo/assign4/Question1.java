package com.bellinfo.assign4;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s= "This is a Java Class";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			count++;
		}
		System.out.println("Number of words are "  +count );
	} 	

}
