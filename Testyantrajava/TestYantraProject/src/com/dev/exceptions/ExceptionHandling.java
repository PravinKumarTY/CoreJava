package com.dev.exceptions;

public class ExceptionHandling {

	public static void main(String[] args)throws CustomException {
		try {
			s();
			System.out.println("No Exception for s()");
			int res=divide(10, 0);
			System.out.println("No Exception for divide(10,0)");
			System.out.println(res);
		} catch (NegativeArraySizeException e) {
			System.err.println("Exception caught in catch block");
			System.err.println("getMessage():"+e.getMessage());
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.err.println("Exception Caught in catch block");
			System.err.println("getMessage():"+e.getMessage());
		}
		finally {
			System.out.println("This is finally block.");
		}
        System.out.println("Code after Exception");
		/*s();
		try {
			divide(10,0);
		} catch (Exception e) {
			throw new CustomException();
		}*/	
	}
	public static void s() throws CustomException {
		int i=1;
		if(i<0) {
			throw new CustomException();
		}
		StringBuffer sb=new StringBuffer(i);
		
//		try {
//			StringBuffer sb=new StringBuffer(-1);
//		} catch (Exception e) {
//			// TODO: handle exception
//			new CustomException().printStackTrace();
//		}
	}
	public static int divide(int i ,int j) {
		int res=i/j;
		System.out.println(res);
		return res;
	}

}
