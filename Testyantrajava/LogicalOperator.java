public class LogicalOperator{
  public static void main(String []args){
     boolean b=true;
	 boolean c=false;
	 boolean d=b&&c;
	 System.out.println("For &&...:"+d);
	 
	 d=b||c;
	 System.out.println("For ||...:"+d);
	 
	 d=!(b||c);
	 System.out.println("For !"+d);
  }
}