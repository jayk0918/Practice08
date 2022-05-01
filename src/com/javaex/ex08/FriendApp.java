package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String friendsInfo;
		String[] infoSplit;
		Friend[] friendsArray = new Friend[3];
		
		System.out.println("친구를 3명 등록해 주세요");
		
		for(int i=0; i<friendsArray.length; i++) {
			friendsInfo = sc.nextLine();
			infoSplit = friendsInfo.split(" ");
			friendsArray[i] = new Friend(infoSplit[0],infoSplit[1],infoSplit[2]);
		}
		
		for(int i=0; i<friendsArray.length; i++) {
			friendsArray[i].showInfo();
		}
		
		
		
		
		sc.close();
		
		
		
		
	}
}
