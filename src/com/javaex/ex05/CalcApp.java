package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
		
    	while(true) {
    		System.out.print(">> ");
    		String input = sc.nextLine();
    		
    		if(input.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}
    		
    		String[] calLines = input.split(" ");
    		String symbol = calLines[1];
    		int number1 = Integer.parseInt(calLines[0]);
    		int number2 = Integer.parseInt(calLines[2]);
    		
    		switch(symbol) {
	    		case "+":
	    			Add plus = new Add();
	    			plus.setValue(number1, number2);
	    			System.out.println(">> " + plus.calculate());
	    			break;
	    			
	    		case "-":
	    			Sub minus = new Sub();
	    			minus.setValue(number1, number2);
	    			System.out.println(">> " + minus.calculate());
	    			break;
	    			
	    		case "*":
	    			Mul multiply = new Mul();
	    			multiply.setValue(number1, number2);
	    			System.out.println(">> " + multiply.calculate());
	    			break;
	    			
	    		case "/":
	    			Div divide = new Div();
	    			divide.setValue(number1, number2);
	    			System.out.println(">> " + divide.calculate());
	    			break;
	    			
	    		default:
	    			System.out.println("알 수 없는 연산입니다.");
	    			
    		} // switch-case end
    		
    	}// while end
    	
    	sc.close();
    	
	}
    	
    	
    	

}
