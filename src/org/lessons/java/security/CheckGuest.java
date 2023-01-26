package org.lessons.java.security;
import java.util.Scanner;
public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] invitati= { 
				"Dua Lipa","Paris Hilton", "Manuel Agnelli", "J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio", "Luis", "Paradais Zarei", "Martina Maccherone","Rachel Zeili"
		};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo Nome e Cognome");
		
		String tuoNome = input.nextLine();
		
		boolean inLista = false;
		
		for(int i=0; i < invitati.length ; i++) {
			
			if(tuoNome.toLowerCase().trim().equals(invitati[i].toLowerCase().trim())) {
				
				inLista=true;
				
			}
		}
		if(inLista) 
			System.out.println("Ciao " + tuoNome + " e' in lista");
		
		else System.out.println("Mi dispiace " + tuoNome + " lei non e' in lista" );
		
		input.close();
	}

}
