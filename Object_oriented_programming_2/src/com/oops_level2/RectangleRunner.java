package com.oops_level2;

public class RectangleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle((byte)4,(byte)4);
		rectangle.isSquare();
		System.out.println(rectangle);
		
		rectangle.setWidth((byte)8);
		rectangle.isOtherRectangle();
		System.out.println(rectangle);
	}

}
