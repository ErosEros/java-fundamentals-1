package org.lessons.java.security;

public class CibiPrefetiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cibiPreferiti = {"pasta", "tartufo", "manzo","sushi", "hamburger", "minestra", "pesce", "fagioli"};
		
//		stampo la lunghezza degli array
		System.out.println("La lunghezza della classifica è: " + cibiPreferiti.length);
		
//	    stampo il cibo primo nella mia classifica
		System.out.println("Il mio cibo preferito è: " + cibiPreferiti[0]);
	    
//		stampo il cibo ultimo nella mia classifica
	    System.out.println("Il mio cibo preferito ma non troppo è: " + cibiPreferiti[cibiPreferiti.length - 1]);;

//	    BONUS stampo il cibo di mezza classifica
	    System.out.println("Il mio cibo di mezza classifica è: " + cibiPreferiti[cibiPreferiti.length /2 - 1]);
	}

}
