package fr.afpa.pierrefeuilleciseau;

import java.util.Random;
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		
		int saisiChoix;
		
		final int STOP = 3;
		
		
		Jeu jeux = new Jeu();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Bienvenue dans votre jeu Pierre Feuille Ciseau");
			System.out.println("Choisissez entre Pierre(0) Feuille(1) Ciseau(2) Quitter(3)");
			
			
			Choix choixJoueur = null;
			
			saisiChoix = sc.nextInt();
			if(saisiChoix ==  0) {
				choixJoueur = Choix.PIERRE;
			}
			if (saisiChoix ==  1) {
				choixJoueur = Choix.FEUILLE;
			}
			if(saisiChoix ==  2) {
				choixJoueur = Choix.CISEAU;
			}
			
			Random generator = new Random();
			  int numberIA = generator.nextInt(3);
				 
				 Choix choixIA1 = null;
				if(numberIA ==  0) {
					 choixIA1 = Choix.PIERRE;
					}
				 if (numberIA ==  1) {
					 choixIA1 = Choix.FEUILLE;
					}
				 if(numberIA ==  2) {
					 choixIA1 = Choix.CISEAU;
					}
				 
				 
			
			
			jeux.choixCompare(choixJoueur, choixIA1);
				
			
		
		 
			
			System.out.println();
			
		}while(saisiChoix != STOP);
		
		
		System.out.println("Votre score : " + jeux.getScoreJoueur() + " Score IA : " + jeux.getScoreIA());
			
		 
		 
		
		

	
	}

	
}
