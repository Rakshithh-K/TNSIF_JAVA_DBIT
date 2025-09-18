package com.tns.execption;

public class main {

	public static void main(String[] args) {
		
		int a=9;
		int b=0;
		try {
			 divide(a,b);
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		finally {
			System.out.println("ubhiu");
		}
	}
	
	static int divide(int a,int b) throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException("Dont divide by zero");
			
		}
		return a/b;
	}
		// TODO Auto-generated method stub

	}