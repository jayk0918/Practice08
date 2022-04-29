package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);		// 예상 : false(다른 주소값)
		System.out.println(p2 == p3);		// 예상 : false(다른 주소값)
		System.out.println(p3 == p4);		// 예상 : false(다른 주소값)
		System.out.println(p4 == p1);		// 예상 : true(같은 주소값)
		System.out.println(p1.equals(p2));	// 예상 : false(다른 주소값)
		System.out.println(p4.equals(p1));	// 예상 : true(같은 주소값)
		
		
		// equals는 모든 클래스의 부모인 object로부터 상속받아 활용됨
		// equals에 특정 조건을 달지 않았기 때문에 기본 판별식인 주소값을 비교함
		
	}

}


