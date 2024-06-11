package com.ferragnez.party;

import java.util.Scanner;


public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("il suo nome??");
		
		String name = input.nextLine();
		
		boolean invited = false;
		
		int i = 0;
		while (!invited && i < invitati.length) {
			if(name.toLowerCase().equals(invitati[i].toLowerCase())) {
				invited = true;
			}
			i++;
		}
		
		if(!invited) {
			System.out.println("non sei nella lista");
		}else {
			System.out.println("sei invitato");
		}
		
		
	}

}
