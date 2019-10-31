public class GradeSystem{
	public static void main(String... arg){
		int marks=60;	
	    if(marks>90&&marks<=100){
			System.out.println("Grade A");
		}else if(marks>80&&marks<=90){
			System.out.println("Grade B");
		}else if(marks>70&&marks<=80){
			System.out.println("Grade C");
		}else if(marks>60&&marks<=70){
			System.out.println("Grade D");
		}else if(marks>50&&marks<=60){
			System.out.println("Grade E");
		}else if(marks>40&&marks<=50){
			System.out.println("Retest");
		}else if(marks>=0&&marks<=40){
			System.out.println("Fail");
		}else{
			System.out.println("Out of range");
		}
	}
}