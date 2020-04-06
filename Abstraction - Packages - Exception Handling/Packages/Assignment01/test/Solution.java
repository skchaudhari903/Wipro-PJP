package test;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation foundation = new Foundation();
		//foundation.var1 = 1;					//error - not accessible (private variable)
		foundation.var2 = 2;					//accessible
		foundation.var3 = 3;					//accessible
		foundation.var4 = 4;					//accessible
		
		//System.out.println(foundation.var1);	
		System.out.println(foundation.var2);
		System.out.println(foundation.var3);
		System.out.println(foundation.var4);
	}

}
