package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Friend[] friendArray = new Friend[3];
		
		System.out.println("친구를 3명 등록해 주세요");
		
		for(int i=0; i<=3; i++) {
			String friendsInfo = sc.nextLine();
			sc.nextLine();
			sc.nextLine();
			friendArray[i].name(friendsInfo.substring(0,3));
			friendArray[i].hp(friendsInfo.substring(4,17));
			friendArray[i].school(friendsInfo.substring(18));
		}
		
		for(int i=0; i<friendArray.length; i++) {
			friendArray[i].showInfo();
		}
		
		
		sc.close();
		
		
		
		
	}
}
