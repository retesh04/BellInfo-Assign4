package com.bellinfo.assign4;

public class Question4 {

	public static void main(String[] args) {
String s = "This  is  Java  Class";

System.out.println(StringFormatter.reverseWord(s));
	}
	
	public static class StringFormatter {  
		public static String reverseWord(String str){  
		    String words[]=str.split("\\s");  
		    String reverseWord=" ";  
		    for(String r:words){  
		        StringBuilder sb=new StringBuilder(r);  
		        sb.reverse();
		      System.out.println(sb);
		       reverseWord=reverseWord+sb+" "; 
		       /*System.out.println(sb.reverse());
		       System.out.println(reverseWord);*/
		    }  
		    return reverseWord;//.trim();  
		}  
		}  
}
