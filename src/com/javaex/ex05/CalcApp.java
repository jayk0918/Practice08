package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String input = sc.nextLine();
    	String[] inputArray = input.split(" ");
    	
    	String symbol = inputArray[1];
    	int a = inputArray[0];
    	
    	switch(symbol) {
    		case "+":
    			Add plus = new Add();
    			plus.setValue();
    			plus.calculate();
    			break;
    			
    		case "-":
    			Add minus = new Add();
    			minus.setValue();
    			minus.calculate();
    			break;
    			
    		case "*":
    			Add multiply = new Add();
    			multiply.setValue();
    			multiply.calculate();
    			break;
    			
    		case "/":
    			Add divide = new Add();
    			divide.setValue();
    			divide.calculate();
    			break;
    			
    		case "/q":
    			break;
    			
    		default:
    			System.out.println("알 수 없는 연산입니다.");
    			break;
    	
    	}
    	
    	sc.close();
    }
}
