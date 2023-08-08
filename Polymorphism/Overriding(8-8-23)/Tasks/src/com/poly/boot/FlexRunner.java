package com.poly.boot;

import com.poly.app.Flex;
import com.poly.app.FlexDesign;

public class FlexRunner {
public static void main(String[] args) {
	System.out.println("invoking main in FlexRunnner...");
	Flex flex=new FlexDesign();
	flex.chain();
}
}
