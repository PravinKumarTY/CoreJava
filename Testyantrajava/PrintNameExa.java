public class PrintNameExa{
	public static void main(String []args){
		String name="pravin";
		int dayNum=6;
		switch(dayNum){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			System.out.println("Name="+name);
			break;
			case 6:
			case 7:
			for(int i=0; i<5; i++){
				System.out.println("Name.="+name);
			}
			break;
			default:
			System.out.println("Invalid day.");
		}
		
	}
}