package com.dev.lambdaexpression;

public class Test{

	public static void main(String[] args) {
		//Provideing implementaion of functional interface
	    FuncInt f=()->{
	    	for(int i=1; i<=10; i++) {
	    		System.out.println("i="+i);
	    	}
	    };
	    //calling the abstract method 
	    f.printVal();
	   
	    
	    //implementation of add method
	    AddOprInterface add=(int a,int b)->{return a+b;};
	    int sum=add.add(10,20);
	    System.out.println("Sum ..:"+sum);
	    
	    DemoInterFace d=()->System.out.println("hello");
	    d.show();
	    
	    SwapInterface s=(int a,int b)->{
	    	int c=0;
	    	c=a;
	        a=b;
	        b=c;
	        System.out.println("a="+a+" and b="+b);
	    };
	   s.swap(10, 20);
	   Thread
	}

}
