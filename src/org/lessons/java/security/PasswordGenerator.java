package org.lessons.java.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome="Alessandro";
		String cognome="Del Piero";
		String colore="Black";
		
		int giornoNascita=9;
		int meseNascita=11;
		int annoNascita=1974;
		
		int somma = giornoNascita + meseNascita + annoNascita;
		
		
		String password = nome + "-" + cognome + "-" + colore +  "-" + somma;
		
		System.out.println(password);
	}

}


//int somma = giornoDiNascita + meseNascita + annoNascita;
//
//
//String password = nome + "-" + cognome + "-" + colorePreferito +  "-" + somma;
//
//System.out.println(password);