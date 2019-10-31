public class PatternTest1{
  public static void main(String []args){
	  int k=1;
	  for(int i=1; i<=3; i++){
		  for(int j=1; j<=i; j++){
			  System.out.print((char)(64+k)+""+(char)(96+k)+" ");
			  k++;
		  }
		  System.out.println();
	  }
  }
}