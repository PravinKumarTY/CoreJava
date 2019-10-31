public class MixedOperatorExa{
   public static void main(String []args){
	   int a=100;
	   int b=200;
	   int result=100+200;
	   System.out.println("result...:"+result);
	   a+=b;
	   System.out.println("a..:"+a);
	   int c=a++;
	   System.out.println("c..:"+c);
	   boolean d=a==b;
	   System.out.println("boolean d.."+d);
       boolean e=(a==b)&&(a>b);	
       System.out.println("e...:"+e);
       int bitres=a&b;
       System.out.println("bitres..:"+bitres);	
       int bitxor=5^1;
       System.out.println("bitxor...."+bitxor);	   
   }
}