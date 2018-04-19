//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(20);
		
		
		
		System.out.println(randomNumber);
		
		if(randomNumber==0) {
System.out.println("You get a Iphone X");
		}

		if(randomNumber==3) {
			System.out.println("You get a Iphone 8");
					}
		
		if(randomNumber==4) {
			System.out.println("You get a Iphone 7");
					}
		
		if(randomNumber==2) {
			System.out.println("You get a Iphone 6 S Plus");
					}
		
		if(randomNumber==6) {
			System.out.println("You get a Iphone 11");
					}
		
		if(randomNumber==9) {
			System.out.println("You get a Iphone 13");
					}
		
		if(randomNumber==1) {
			System.out.println("You get a MacBook Pro");
					}
		
		if(randomNumber==7) {
			System.out.println("You get a Iphone 15");
					}
		
		if(randomNumber==8) {
			System.out.println("You get a MacBook air");
					}
		
		if(randomNumber==5) {
			System.out.println("You get a Iphone 6  Plus");
					}
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
