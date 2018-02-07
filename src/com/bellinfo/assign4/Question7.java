package com.bellinfo.assign4;

public class Question7 {

	public static void main(String[] args) {
	String str = "vishal";
	System.out.println("letter at center " +middle(str));

	}
	public static String middle(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
           length = 2;
        }
        else
        {
          position = str.length() / 2;
          length = 1;
        }
        return str.substring(position, position + length );
    }
}
