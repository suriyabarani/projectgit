package org.hexa;

public class Aspire {
	public static void main(String[] args) {
		
		String s= "java appl";
		int e=0;
		int n;
		int k=1;
	String[] sp = s.split(" ");
	String a=sp[0];
	String b=sp[1];
	
	
	 
   	for (int i = 0;i < a.length(); i++) {
	 char b2 = a.charAt(i);
	 n=b.length()-k;
	 int t = b.length()-n;
		System.out.println(b2);
	for (int j = e; j < t; j++) {
		char b3 = b.charAt(j);
		System.out.println(b3);}
		k++;
		e++;

	
	}}}
