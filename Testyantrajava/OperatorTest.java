public class OperatorTest{
   public static void main(String []arg){
     int i=10;
	 int j=20;
	 int res=i+j;
	 System.out.println("Result..:"+res);//addition
	 res=i-j;//reinitialization of variable.
	 System.out.println("Subtraction..:"+res);//Subtraction.
	 res=i*j;
	 System.out.println("Multiplication..:"+res);//Multilication
	 res=i/j;
	 System.out.println("Division..:"+res);//Division
	 res=i%j;
	 System.out.println("Modular..:"+res);
	 
	 char c1='a';
	 char c2='b';
	 int cahrRes=c1+c2;
	 System.out.println("Char Operation..:"+cahrRes);
	 
	 //int char operation.
	   int i1=30;
	   char c3='a';
       int charIntRes=i1+c3;
       System.out.println("Result at 25..:"+charIntRes);
     
       int i2=10;
       float f2=12.5f;
       System.out.println(i2+f2);		
	 
   }
}