package com.sreenutech;

public class CardOffer{
	
	public void m1(){
	
		System.out.println("***m1() method ****");
		
	}
	public void m2(){
		
		System.out.println("***m2() method ****");
	}
	
	public static void main(String[] args){
		
		CardOffer offer = new CardOffer();
		offer.m1(); // m1() method will call
		offer.m2(); // m2() method will call
	}	

}	
