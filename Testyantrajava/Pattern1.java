public class Pattern1{
   public static void main(String arg[]){
	   for(int i=0; i<4; i++){
		   for(int j=0; j<=i; j++){
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	   System.out.println("----------");
	   for(int i=4; i>0; i--){
		   for(int j=1; j<=i; j++){
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
   }
}