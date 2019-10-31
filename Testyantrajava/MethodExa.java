public class MethodExa{
  public static int calcArea(int side){
	  int area=side*side;
	  return area;
  }
  public static double arrCircle(int side){
	  double area=3.14*side*side;
	  return area;
  }
  public static double avarage(int a,int b,int c){
	  double avarage=a+b+c/3;
	  return avarage;
  }
  public static double areaOfTriangle(int base,int height){
	  double arrTriangle=0.5*base*height;
	  return arrTriangle;
  }
  public static void main(String []args){
    int areaSquare=calcArea(5);
	System.out.println("Area of square."+areaSquare);
	double areaOfCircle=arrCircle(5);
	System.out.println("Area of Circle.="+areaOfCircle);
	double avg=avarage(10,20,30);
	System.out.println("Avarage.:"+avg);
	double arrTriangle=areaOfTriangle(5,10);
	System.out.println("Area of Triangle.:"+arrTriangle);
  }
}