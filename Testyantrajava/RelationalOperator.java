public class RelationalOperator{
   public static void main(String []args){
     int i=10;
	 int j=20;
	 boolean b=i==j;
	 System.out.println("i == j.."+b);
	 b=i!=j;
	 System.out.println("i!= j..."+b);
	 b=i<j;
	 System.out.println("i < j..."+b);
	 b=i>j;
	 System.out.println("i > j..."+b);
	 b=i<=j;
	 System.out.println("i <= j..."+b);
	 b=i>=j;
	 System.out.println("i >= j..."+b);
	 
	 int a=65;
	 char ch='A';
	 boolean b1=a==ch;
	 System.out.println("b1..:"+b1);
	 b1=ch<a;
	 System.out.println(b1);
   }
}