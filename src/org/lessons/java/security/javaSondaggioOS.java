package org.lessons.java.security;

import java.util.Scanner;

public class javaSondaggioOS {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Quanti studenti usano windows?");
		
		int Windows = s.nextInt();
		
		System.out.print("Quanti studenti usano linux?");
		
		int Linux = s.nextInt();
		
		System.out.print("Quanti studenti usano mac?");
		
		int Mac = s.nextInt();
		
		int Totale = Mac + Windows + Linux;
		
		double windowsQuantita = (Windows / (double) Totale ) * 100;
		double linuxQuantita = (Linux / (double) Totale ) * 100;
		double macQuantita = (Mac / (double) Totale) * 100;
		
		System.out.println("Percentuale studenti windows:" + windowsQuantita + "%");
		System.out.println("Percentuale studenti linux:" + linuxQuantita + "%");
		System.out.println("Percentuale studenti mac:" + macQuantita + "%");
		
		s.close();
		
	}
}
