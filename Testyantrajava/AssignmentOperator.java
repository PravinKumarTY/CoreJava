public class AssignmentOperator{
	public static void main(String []args){
		int i;
		int j;
		i=10;
		j=20;
		System.out.println("i="+i);
		System.out.println("j="+j);
		j+=i;
		System.out.println("Addition Assignment="+j);
		j-=i;
		System.out.println("Subtraction assignment.:"+j);
		j*=i;
		System.out.println("Multuplication assignment:"+j);
		j/=i;
		System.out.println("Division assignment:"+j);
		j%=i;
		System.out.println("Modular assignment:"+j);	
	}
}