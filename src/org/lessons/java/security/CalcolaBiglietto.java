package org.lessons.java.security;
import java.util.Scanner;
public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Quanti Km vuoi percorrere?");
		
		int kilometri = s.nextInt();
		
		System.out.print("Quanti anni hai?");
		
		int eta = s.nextInt();
		
//		DICHIARO GLI SCONTI
		
		int scontoVenti = 20;
		
		int scontoQuaranta = 40;
		
		
		
		double prezzoBiglietto = 0.21;
		
		if(eta < 18) {
			double prezzoPieno = (double) kilometri * prezzoBiglietto;
			
			double	prezzoScontato = (double) ( prezzoPieno * scontoVenti  ) / 100;
			
			double prezzoFinale = (double) prezzoPieno - prezzoScontato;
			
			System.out.println(prezzoFinale + " euro");
			
		}
		else if ( eta > 65){
			
			double prezzoPieno = (double) kilometri * prezzoBiglietto;
			
			double	prezzoScontato = (double) ( prezzoPieno * scontoQuaranta  ) / 100;
			
			double prezzoFinale = (double) prezzoPieno - prezzoScontato;
			
			System.out.println(prezzoFinale + " euro");
		}
		
		else {
			double prezzoPieno = (double) kilometri * prezzoBiglietto;
			
			System.out.println(prezzoPieno + " euro");
		}
		
		s.close();
	}

}
