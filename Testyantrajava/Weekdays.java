public class Weekdays{
  public static void main(String []args){
   int dayNum=6;
   switch(dayNum){
     case 1:
	 case 2:
	 case 3:
	 case 4:
	 case 5:
	 System.out.println("Weekday");
	 break;
	 case 6:
	 case 7:
	 System.out.println("Weekends");
	 break;
	 defaults:
	 System.out.println("Invalid day.");
   }
  }
}