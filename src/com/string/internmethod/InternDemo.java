package com.string.internmethod;

public class InternDemo {
	
	/*- when we use intern() on String object then if object is not present in
	  SCP then it create new object in SCP and refernce of s2 points to that
	  object also(i.e. s2 referce both the objects that is heap as well as SCP)
	  
	  		String s1 = new String("Sanket");
			String s2 = s1.concat("Babar");
			String s3 = s2.intern();
			
			System.out.println(s2 == s3);	
			
	  hence statement returns true
			
	- when we use intern() on String object then if object is already present
	  in SCP then it not creates a new object and refere that already existing
	  object
	  
	  		String s1 = new String("Sanket");
			String s2 = s1.concat("Babar");
			String s4 = "SanketBabar";
			String s3 = s2.intern();
		
			System.out.println(s2 == s3);
			
	  hence statement returns false*/
	  
	public static void main(String[] args) {
		
		String s1 = new String("Sanket");
		String s2 = s1.concat("Babar");
		String s4 = "SanketBabar";
		String s3 = s2.intern();
		
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
	}
}
