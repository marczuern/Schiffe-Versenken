package battleship;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Herzlich Willkommen zu Schiffeversenken.");
		
		Feld f1 = new Feld();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);	
		
		while(true){
			f1.feldausgeben();
			System.out.println("Name für Spieler 1 eingeben:");
			Spieler s1 = new Spieler(sc.next());
			System.out.println("Name für Spieler 2 eingeben:");
			Spieler s2 = new Spieler(sc.next());
			
			System.out.println(s1.name);
			System.out.println(s2.name);
		}
	}
}
