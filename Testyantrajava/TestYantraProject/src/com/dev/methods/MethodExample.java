package com.dev.methods;

public class MethodExample {

	public static void main(String[] args) {
		int area=calcArea(10);
		System.out.println("Area of Square..:"+area);
		double areaOfCircle=areaOfCircle(5);
		System.out.println("Area of Circle.:"+areaOfCircle);
		double areaOfTriangle=areaOfTriangle(5,10);
		System.out.println("Area of Triangle.:"+areaOfTriangle);
	}
	public static int calcArea(int side) {
		int area=side*side;
		return area;
	}
	public static double areaOfCircle(int radius) {
		double area=3.14*radius*radius;
		return area;
	}
	public static double areaOfTriangle(int base,int height) {
		double area=0.5*base*height;
		return area;
	}
} 
