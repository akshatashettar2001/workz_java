package com.java.fourlevel.inheritance;

import com.java.fourlevel.ColoredSquare;

public class RectangleRunner {
		    public static void main(String[] args) {
		        System.out.println("Invoking main in ShapeRunner");

		        ColoredSquare coloredSquare = new ColoredSquare("Square", 5.0, "Blue");
		        System.out.println("********************");
		        ColoredSquare.describe();
		        ColoredSquare.displaySide();
		        ColoredSquare.displayDimensions();
		        ColoredSquare.displayArea();
		        ColoredSquare.displayColor();
		        System.out.println("********************");
		    }
}
